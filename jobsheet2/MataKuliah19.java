package jobsheet2;

public class MataKuliah19 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    public MataKuliah19(String kode, String name, int sks, int jmlhJam){
        kodeMK=kode;
        nama=name;
        this.sks=sks;
        jumlahJam=jmlhJam;
    }

    void tampilkanInformasi(){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks=sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam+=jam;
    }

    void kurangJam(int jam){
        if(jumlahJam<jam){
            System.out.println("Penguran Jam Mata Kuliah Tidak Dapat dilakukan!");
        }else{
            jumlahJam-=jam;
            System.out.println("Jumlah Jam yang baru adalah: " + jumlahJam );
        }
    }
}