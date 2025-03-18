package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMhs = input.nextInt();
        input.nextLine();
        MahasiswaBerprestasi18 list=new MahasiswaBerprestasi18(jmlhMhs);
        // Mahasiswa18 m1=new Mahasiswa18("123", "Zidan", "2A", 3.2);
        // Mahasiswa18 m2=new Mahasiswa18("124", "Ayu", "2A", 3.5);
        // Mahasiswa18 m3=new Mahasiswa18("125", "Sofi", "2A", 3.1);
        // Mahasiswa18 m4=new Mahasiswa18("126", "Sita", "2A", 3.9);
        // Mahasiswa18 m5=new Mahasiswa18("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        for(int i=0;i<jmlhMhs;i++){
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            input.nextLine();
            System.out.println("------------------------------------");

            Mahasiswa18 m=new Mahasiswa18(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();;

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECION SORT (ASC):");
        list.selectionSort();
        list.tampil();

        
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC):");
        list.insertionSort();
        list.tampil();
    }
}
