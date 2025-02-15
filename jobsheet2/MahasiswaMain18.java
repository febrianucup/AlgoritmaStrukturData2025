package jobsheet2;

public class MahasiswaMain18 {
    public static void main(String[] args) {
        Mahasiswa18 mhs1=new  Mahasiswa18(null, null, 0, null);
        mhs1.nama="Muhammad Ali Farham";
        mhs1.nim="2241720171";
        mhs1.kelas="SI 2J";
        mhs1.ipk=3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa18 mhs2=new Mahasiswa18("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa18 mhs18=new Mahasiswa18("Muhammad Dwi Febrian", "244107020081", 3.78, "TI_1A");
        mhs18.tampilkanInformasi();
        String evaluasiNilai=mhs18.nilaiKinerja();
        System.out.println("Nilai Kinerja: " + evaluasiNilai);
    }
}
