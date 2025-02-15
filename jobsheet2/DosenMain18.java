package jobsheet2;

public class DosenMain18 {
    public static void main(String[] args) {
        int masaKerja;
        Dosen18 dosen1=new Dosen18(null, null, false, 0, null);
        dosen1.idDosen="MDF";
        dosen1.nama="Muhammad Dwi Febrian";
        dosen1.statusAktif=true;
        dosen1.tahunBergabung=2006;
        dosen1.bidangKeahlian="Informatika";

        dosen1.tampilkanInformasi();
        masaKerja=dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Basis Data");
        dosen1.tampilkanInformasi();
        System.out.println("Masa Kerja: " + masaKerja + " tahun");

        Dosen18 dosen2=new Dosen18("231731", "Nuril", false, 2008, "Sistem Informasi");
        dosen2.tampilkanInformasi();
        dosen2.ubahKeahlian("Matematika");
        masaKerja=dosen2.hitungMasaKerja(2025);
        dosen2.tampilkanInformasi();
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
}
