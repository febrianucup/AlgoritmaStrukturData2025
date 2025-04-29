package jobsheet9;

public class Mahasiswa18 {
    String nim, nama, kelas;
    int nilai;
    public Mahasiswa18[] stack;

    Mahasiswa18(){

    }

    Mahasiswa18(String nim, String nama, String kelas){
        this.nim=nim;
        this.nama=nama;
        this.kelas=kelas;
    }

    void tugasDinilai(int nilai){
        this.nilai=nilai;
    }
}
