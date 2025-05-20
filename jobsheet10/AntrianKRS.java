package jobsheet10;

public class AntrianKRS {
    Mahasiswa18[] data;
    int front, rear, size, max;
    int afterProcess;
    final int DPAKRS=30;

    AntrianKRS(int max){
        this.max=max;
        this.data=new Mahasiswa18[max];
        this.front=0;
        this.rear=-1;
        this.size=0;
    }

    boolean isFull(){
        if(size==max-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    void clear(){
        if(!isEmpty()){
            front=rear=-1;
            size=0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    void addQueue(Mahasiswa18 mhs){
        if(isFull()){
            System.out.println("Queue KRS sudah penuh");
        }else{
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    Mahasiswa18 peekMhs(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        if(size<2){
            System.out.println("Antrian kurang");
            return null;
        }
        Mahasiswa18 mhs=data[front];
        front = (front + 1) % max;
        size--;
        afterProcess++;
        return mhs;
    }

    void tampilSemua(){
        if(isEmpty()){
            System.out.println("Queue kosong");
            return;
        }
        for(int i=0;i<size;i++){
            int index=(front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    void tampilDuaTerdepan(){
        if(isEmpty()){
            System.out.println("Queue kosong");
            return;
        }
        if(size<2){
            System.out.println("Antrian kurang");
        }
        if(size>=2){
            System.out.println("Dua Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for(int i=0;i<2;i++){
            int index=(front + i) % max;
            data[index].tampilkanData();
        }
        }
    }

    void tampilTerbelakang(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terbelakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    int hitungJumlahAntrian(){
        return size;
    }

    int hitungSudahKRS(){
        return afterProcess;
    }

    int hitungBelumKRS(){
        return (DPAKRS - (afterProcess));
    }
}
