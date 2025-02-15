package jobsheet2;

public class Dosen19 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Kehalian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        if(status==true){
            System.out.println("Aktif");
        }else{
            System.out.println("Tidak AKtif");
        }
    }

    int hitungMasaKerja(int thnSkrg){
        int jmlhTahun=thnSkrg-tahunBergabung;
        return jmlhTahun;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian=bidang;
    }
}
