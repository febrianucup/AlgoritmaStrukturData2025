package jobsheet7;

public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

    Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double tugas, double uts, double uas){
        this.mahasiswa=mahasiswa;
        this.mataKuliah=mataKuliah;
        nilaiUts=uts;
        nilaiTugas=tugas;
        nilaiUas=uas;
    }

    void hitungNilaiAkhir(){
        nilaiAkhir=((nilaiTugas*0.3) + (nilaiUts*0.3) + (nilaiUas*0.4));
    }

    

    void tampilDataNilai(){
        System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | " + "Nilai AKhir: " + nilaiAkhir);
    }
}
