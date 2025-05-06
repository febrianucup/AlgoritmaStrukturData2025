package jobsheet10;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianKRS antrianKRS = new AntrianKRS(10); 

        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Mahasiswa Terdepan");
            System.out.println("5. Tampilkan Mahasiswa Paling Akhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah Sudah Proses KRS");
            System.out.println("8. Cek Jumlah Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("--- Daftar Data Mahasiswa ---");
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = scanner.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    antrianKRS.addQueue(new Mahasiswa18(nim, nama, prodi, kelas));
                    break;
                case 2:
                    System.out.println("KRS yang telah diproses");
                    for(int i=0;i<2;i++){
                        Mahasiswa18 mhs=antrianKRS.peekMhs();
                        mhs.tampilkanData();
                    }
                    break;
                case 3:
                    antrianKRS.tampilSemua();
                    break;
                case 4:
                    antrianKRS.tampilDuaTerdepan();
                    break;
                case 5:
                    antrianKRS.tampilTerbelakang();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrianKRS.hitungJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + antrianKRS.afterProcess);
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum proses KRS: " + (antrianKRS.hitungBelumKRS()));
                    break;
                case 9:
                    antrianKRS.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}

