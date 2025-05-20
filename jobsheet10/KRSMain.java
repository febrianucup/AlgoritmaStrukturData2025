package jobsheet10;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianKRS antrianKRS = new AntrianKRS(10); 

        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Cek Data Kosong");
            System.out.println("2. Cek Data Full");
            System.out.println("3. Tambah Mahasiswa ke Antrian");
            System.out.println("4. Proses KRS (2 Mahasiswa)");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan 2 Mahasiswa Terdepan");
            System.out.println("7. Tampilkan Mahasiswa Paling Akhir");
            System.out.println("8. Cek Jumlah Antrian");
            System.out.println("9. Cek Jumlah Sudah Proses KRS");
            System.out.println("10. Cek Jumlah Belum Proses KRS");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    boolean empty=antrianKRS.isEmpty();
                    if(empty==true){
                        System.out.println("Data kosong");
                    }else{
                        System.out.println("Data Penuh");
                    }
                    break;
                case 2:
                    boolean Full=antrianKRS.isFull();
                    if(Full==true){
                        System.out.println("Data Penuh");
                    }else{
                        System.out.println("Data Kosong");
                    }
                    break;
                case 3:
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
                case 4:
                    System.out.println("KRS yang telah diproses");
                    for(int i=0;i<2;i++){
                        Mahasiswa18 mhs=antrianKRS.peekMhs();
                        mhs.tampilkanData();
                    }
                    break;
                case 5:
                    antrianKRS.tampilSemua();
                    break;
                case 6:
                    antrianKRS.tampilDuaTerdepan();
                    break;
                case 7:
                    antrianKRS.tampilTerbelakang();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrianKRS.hitungJumlahAntrian());
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + antrianKRS.afterProcess);
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa yang belum proses KRS: " + (antrianKRS.hitungBelumKRS()));
                    break;
                case 11:
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

