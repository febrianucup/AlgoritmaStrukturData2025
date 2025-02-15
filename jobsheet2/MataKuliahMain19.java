package jobsheet2;

public class MataKuliahMain19 {
    public static void main(String[] args) {
        MataKuliah19 matkul1=new MataKuliah19(null, null, 0, 0);
        matkul1.kodeMK="ALSD";
        matkul1.nama="Algortima dan Struktur Data";
        matkul1.sks=3;
        matkul1.jumlahJam=4;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(2);
        matkul1.kurangJam(7);
        matkul1.tampilkanInformasi();

        MataKuliah19 matkul2=new MataKuliah19("DASPRO", "Dasar Pemrograman", 3, 4);
        matkul2.tampilkanInformasi();
        matkul2.ubahSKS(2);
        matkul2.tambahJam(3);
        matkul2.kurangJam(2);
        matkul2.tampilkanInformasi();
    }
}
