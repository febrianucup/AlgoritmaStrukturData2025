package jobsheet6;

public class Dosen18 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen18(String kd, String name, boolean jk, int age){
        kode=kd;
        nama=name;
        jenisKelamin=jk;
        usia=age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin?"Wanita":"Pria"));
        System.out.println("Usia: " + usia);
    }
}
