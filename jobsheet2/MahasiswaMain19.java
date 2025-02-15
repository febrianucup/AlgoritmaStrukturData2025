package jobsheet2;

public class MahasiswaMain19 {
    public static void main(String[] args) {
        Mahasiswa19 mhs1=new  Mahasiswa19(null, null, 0, null);
        mhs1.nama="Muhammad Dwi Febrian";
        mhs1.nim="24107020081";
        mhs1.kelas="SI 2J";
        mhs1.ipk=3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.ubahIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa19 mhs2=new Mahasiswa19("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.ubahIPK(3.30);
        mhs2.tampilkanInformasi();
    }
}
