package jobsheet10;

public class Mahasiswa18 {
    String nim, nama, kelas, prodi;

    Mahasiswa18(String nim, String nama, String prodi, String kelas){
        this.nim=nim;
        this.nama=nama;
        this.kelas=kelas;
        this.prodi=prodi;
    }

    void tampilkanData(){
        System.out.println(nim + "-" + nama + "-" + prodi + "-" + kelas);
    }
}
