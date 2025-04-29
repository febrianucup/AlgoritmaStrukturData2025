package jobsheet9;

public class StackSuratMahasiswa18 {
    Surat18[] surat;
    int size, top;

    StackSuratMahasiswa18(int size){
        this.size=size;
        surat=new Surat18[size];
        top=-1;
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }

    void push(Surat18 srt){
        if(!isFull()){
            top++;
            surat[top]=srt;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    Surat18 pop(){
        if(!isEmpty()){
            Surat18 srt=surat[top];
            top--;
            return srt;
        }else{
            System.out.println("Data Kosong");
            return null;
        }
    }

    Surat18 peek(){
        if(!isEmpty()){
            return (surat[top]);
        }else{
            System.out.println("Data Kosong");
            return null;
        }
    }

    void print(){
        for(int i=top;i>=0;i--){
            System.out.println(surat[i].idSurat + "\t" + surat[i].namaMahasiswa + "\t" + surat[i].kelas + "\t" + surat[i].jenisIzin + "\t" + surat[i].durasi);
        }
        System.out.println();
    }

    int searchSurat(String nama, Surat18[] surat){
        int idx=-1;
        for(int i=0;i<=top;i++){
            if(surat[i].namaMahasiswa.equalsIgnoreCase(nama)){
                idx=i;
                break;
            }
        }
        return idx;
    }

    void printSearch(String nim, Surat18[] surat){
        int find=searchSurat(nim, surat);
        if(find!=-1){
            System.out.println("Surat ditemukan: IDSurat " + surat[find].idSurat + " | " + "Nama: " + surat
            [find].namaMahasiswa + " | " + "Kelas: " + surat[find].kelas + " | " + "Jenis: " + surat[find].jenisIzin);;
        }else{
            System.out.println("Surat tidak ditemukan");
        }
    }
}
