package jobsheet10;

public class AntrianLayanan {
    Mahasiswa18[] data;
    int front, rear, size, max;

    AntrianLayanan(int max){
        this.max=max;
        this.data=new Mahasiswa18[max];
        this.front=0;
        this.rear=-1;
        this.size=0;
    }

    boolean isFull(){
        if(size==max){
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

    void tambahAntrian(Mahasiswa18 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }

    Mahasiswa18 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa18 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    void lihatTerbelakang(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terbelakang: ");
            System.out.println("NIM-NAMA-PRODI-KELAS");
            data[rear].tampilkanData();
        }
    }

    void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM-NAMA-PRODI-KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    int getJumlahAntrian(){
        return size;
    }
}
