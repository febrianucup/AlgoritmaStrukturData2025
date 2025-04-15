package jobsheet7;

import java.util.Scanner;

public class PenilaianMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        String cari;
        Mahasiswa[] dataMahasiswa = new Mahasiswa[3];
        MataKuliah[] mk = new MataKuliah[3];
        Penilaian[] nilai = new Penilaian[5];
        DataNilai dataNilai= new DataNilai();  

        dataMahasiswa[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        dataMahasiswa[1] = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        dataMahasiswa[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        mk[0] = new MataKuliah("MK001", "Struktur Data",3);
        mk[1] = new MataKuliah("MK002", "Basis Data",3);
        mk[2] = new MataKuliah("MK003", "Desain Web",3);

        nilai[0] = new Penilaian(dataMahasiswa[0], mk[0], 80, 85, 90);
        nilai[1] = new Penilaian(dataMahasiswa[0], mk[1], 60, 75, 70);
        nilai[2] = new Penilaian(dataMahasiswa[1], mk[0], 75, 70, 80);
        nilai[3] = new Penilaian(dataMahasiswa[2], mk[1], 85, 90, 95);
        nilai[4] = new Penilaian(dataMahasiswa[2], mk[2], 80, 90, 65);

        do{
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            switch(menu){
                case 1:
                    System.out.println();
                    System.out.println("Daftar Mahasiswa:");
                    for (int i=0; i<3; i++){
                        dataMahasiswa[i].tampilMahasiswa();
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Daftar Mata Kuliah:");
                    for (int i=0; i<3; i++){
                        mk[i].tampilMatakuliah();
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Data Penilaian:");
                    for (int i=0; i<5; i++){
                        nilai[i].hitungNilaiAkhir();
                    }
                    for (int i=0; i<5; i++){
                        nilai[i].tampilDataNilai();
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Data Penilaian:");
                    dataNilai.tampilSorting(nilai);
                    System.out.println();
                    break;
                case 5:
                    input.nextLine();
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    cari = input.nextLine();
                    dataNilai.tampilNim(cari, dataMahasiswa);
                    System.out.println();
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu!=0);
    }
}
