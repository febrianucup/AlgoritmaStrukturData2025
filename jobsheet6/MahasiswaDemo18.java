package jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input jumlah Mahasiswa: ");
        int jmlh=input.nextInt();
        input.nextLine();
        MahasiswaBerprestasi18 list=new MahasiswaBerprestasi18(jmlh);

        for(int i=0;i<jmlh;i++){
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            String ip=input.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------------");
            list.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari=input.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        double posisi=list.sequentialSearch(cari);
        int pss=(int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //melakukan pencarian data binary
        System.out.println("Menggunakan Sequential Searching");
        int pss2=list.findBinarySearch(cari, 0, jmlh-1);
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}

