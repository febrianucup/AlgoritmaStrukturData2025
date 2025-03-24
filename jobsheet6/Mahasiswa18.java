package jobsheet6;

public class Mahasiswa18 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa18(){

    }
    Mahasiswa18(String nm, String name, String kls, double ip){
        nim=nm;
        nama=name;
        kelas=kls;
        ipk=ip;
    }

    void tampilInformasi(){
        System.out.println("Nim\t :" + nim);
        System.out.println("Nama\t :" + nama);
        System.out.println("Kelas\t :" + kelas);
        System.out.println("IPK\t :" + ipk);
    }
}
