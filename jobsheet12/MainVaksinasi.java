package jobsheet12;

import java.util.Scanner;

public class MainVaksinasi {
    public static void main(String[] args) throws Exception{
        AntrianVaksin data=new AntrianVaksin();
        Scanner input=new Scanner(System.in);
        int choose;

        do{
            System.out.println("\n+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Masukkan pilihan Anda: ");
            choose=input.nextInt();
            input.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("\n--- Tambah Data Penerima Vaksin ---");
                    System.out.print("Nomor Antrian: ");
                    String nomorAntrian = input.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = input.nextLine();
                    data.add(nomorAntrian, nama);
                    break;
                case 2:
                    System.out.println("\n--- Hapus Data Pengantri Vaksin (Vaksinasi) ---");
                    data.delete();
                    break;
                case 3:
                    System.out.println("\n--- Daftar Penerima Vaksin (Antrian) ---");
                    data.print();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }while(choose!=4);
    }
}
