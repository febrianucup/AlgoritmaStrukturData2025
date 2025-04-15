package jobsheet7;

public class Mahasiswa {
    String NIM, nama, prodi;

    Mahasiswa(String nm, String name, String prd){
        NIM=nm;
        nama=name;
        prodi=prd;
    }

    void tampilMahasiswa(){
        System.out.print("NIM: " + NIM + " | " + "Nama: " + nama + " | " + "Prodi: " + prodi);
    }
}
