package Praktikum05;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan jumlabh dosen:");
        int jmlh=input.nextInt();
        DataDosen18 dsn=new DataDosen18(jmlh);
        int choose;
        do{
            System.out.println("1. Tambah Data\n2. Tampil Data\n3. Sorting ASC\n4. Sorting DSC\n5. Exit");
            System.out.print("Pilih Menu: ");
            choose=input.nextInt();
            input.nextLine();
            switch (choose) {
                case 1:
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
                    break;
                case 2:
                    dsn.tampil();
                    break;
                case 3:
                    dsn.sortingASC();
                    dsn.tampil();
                    break;
                case 4:
                    System.out.println("1. Metode Selection Sort\n2. Metode Insertion Sort");
                    System.out.print("Pilih metode: ");
                    int methodChoose=input.nextInt();
                    if(methodChoose==1){
                        dsn.sortingDSC();
                        dsn.tampil();
                    }else if(methodChoose==2){
                        dsn.insertionSort();
                        dsn.tampil();
                    }
                    break;
                case 5:
                    System.out.println("Keluat dari menu");
                    break;
                default:
                    break;
            }
        } while (choose != 5);
    }
}
