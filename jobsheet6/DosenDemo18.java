package jobsheet6;

import java.util.Scanner;

public class DosenDemo18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan jumlabh dosen:");
        int jmlh=input.nextInt();
        input.nextLine();
        DataDosen18 dsn=new DataDosen18(jmlh);

        //Input
        for(int i=0;i<jmlh;i++){
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin: ");
            String gender=input.nextLine();
            boolean jenisKelamin =false;
            if(gender.equalsIgnoreCase("wanita")){
                jenisKelamin=true;
            }else{
                jenisKelamin=false;
            }
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.println("------------------------------------");
        
            Dosen18 d=new Dosen18(kode, nama, jenisKelamin, usia);
            dsn.tambah(d);
        }

        //menu
        int choose;
        do{
            System.out.println("1. Tampilkan data dosen\n2. Cari Berdasarkan Nama\n3. Cari Berdasarkan Usia\n4. Exit");
            System.out.print("Pilih Menu: ");
            choose=input.nextInt();
            System.out.println("------------------------------------");
            input.nextLine();
            switch (choose) {
                case 1:
                    dsn.tampil();//menampilkan inputan
                    break;
                case 2://mencari nama
                    System.out.print("Cari Nama: ");
                    String name=input.nextLine();
                    int pss=dsn.pencarianDataSequential18(name);
                    dsn.tampilDataSequential(name, pss);
                    System.out.println("------------------------------------");
                    break;
                case 3://mencari usia
                    System.out.print("Cari Usia: ");
                    int usia=input.nextInt();
                    int pos=dsn.pencarianDataBinary(usia, 0, jmlh-1);
                    dsn.tampilDataBinary(usia, pos);
                    System.out.println("------------------------------------");
                    break;
                case 4://exit looping
                    System.out.println("Exit");
                    break;
                default:
                    break;
            }
        }while (choose!=4);
    }
}
