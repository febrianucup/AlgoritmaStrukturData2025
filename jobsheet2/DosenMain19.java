package jobsheet2;

public class DosenMain19 {
    public static void main(String[] args) {
        Dosen19 dosen1=new Dosen19();
        dosen1.idDosen="MDF";
        dosen1.nama="Muhammad Dwi Febrian";
        dosen1.statusAktif=true;
        dosen1.tahunBergabung=2006;
        dosen1.bidangKeahlian="Informatika";

        dosen1.setStatusAktif(dosen1.statusAktif);
        int masaKerja=dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Basis Data");
        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(dosen1.statusAktif);
        System.out.println(masaKerja + " tahun");
    }
}
