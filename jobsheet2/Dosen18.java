package jobsheet2;

public class Dosen18 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen18(String id, String nama, boolean status, int tahunBergabung, String bidang){
        idDosen=id;
        this.nama=nama;
        status=statusAktif;
        this.tahunBergabung=tahunBergabung;
        bidangKeahlian=bidang;
    }

    void tampilkanInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Kehalian: " + bidangKeahlian);
        System.out.print("Status: ");setStatusAktif(statusAktif);
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
