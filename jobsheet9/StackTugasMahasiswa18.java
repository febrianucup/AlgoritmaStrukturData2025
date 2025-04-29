package jobsheet9;

public class StackTugasMahasiswa18 {
    Mahasiswa18[] stack;
    int size, top;

    StackTugasMahasiswa18(int size){
        this.size=size;
        stack=new Mahasiswa18[size];
        top=-1;
    }

    boolean isFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    void push(Mahasiswa18 mhs){
        if(!isFull()){
            top++;
            stack[top]=mhs; 
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    Mahasiswa18 pop(){
        if(!isEmpty()){
            Mahasiswa18 m=stack[top];
            top--;
            return m;
        }else{
            System.err.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    Mahasiswa18 peek(){
        if(!isEmpty()){
            return (stack[top]);
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    Mahasiswa18 first(){
        if(!isEmpty()){
            return stack[0];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    int jmlhTugas(){
        int jmlh=0;
        if(!isEmpty()){
            jmlh=top+1;
            return jmlh;
        }else{
            return 0;
        }
    }

    String konversiDecimalToBiner(int nilai){
        StackKonversi18 stack=new StackKonversi18();
            while (nilai !=0) {
                int modulus=nilai%2;
                stack.push(modulus);
                nilai=nilai/2;
            }
        String biner=new String();
        while (!stack.isEmpty()) {
            biner+=stack.pop();
        }
        return biner;
    }

    void print(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println();
    }
}
