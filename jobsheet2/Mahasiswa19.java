package jobsheet2;

public class Mahasiswa19 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa19(String nm, String nim, double ipk, String kls){
        nama=nm;
        this.nim=nim;
        this.ipk=ipk;
        kelas=kls;
    }

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nilai Kerja: " + nilaiKinerja());
    }

    void ubahKelas(String kelasBaru){
        kelas=kelasBaru;
    }

    void ubahIPK(double ipkBaru){
        ipk=ipkBaru;
    }

    String nilaiKinerja(){
        if(ipk>=3.5){
            return "Kinerja Sangat Baik";
        }else if(ipk>=3.0){
            return "Kinerja Baik";
        }else if(ipk>=2){
            return "Kinerja CUkup";
        }else{
            return "Kinerja Kurang";
        }
    }
}