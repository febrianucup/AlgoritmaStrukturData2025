package jobsheet7;

public class MataKuliah {
    String kodeMK, namaMK;
    int sks;

    MataKuliah(String kdMatkul, String nmMatkul, int sks){
        kodeMK = kdMatkul;
        namaMK = nmMatkul;
        this.sks = sks;
    }

    void tampilMatakuliah(){
        System.out.print("Kode MK: " +  kodeMK + " | " + "Nama: " + namaMK + " | " + "SKS: " + sks);
    }
}
