package jobshett3;

import java.util.Scanner;

public class MataKuliahDemo18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jmlhMK=input.nextInt();
        MataKuliah18[] arrayOfMataKuliah=new MataKuliah18[jmlhMK];
        String kode, nama, dummy;
        int sks, jumlahJam;
        
        for(int i=0;i<arrayOfMataKuliah.length;i++){
            arrayOfMataKuliah[i]=new MataKuliah18();
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah[i].tambahData();
            System.out.println("---------------------------------------");
        }

        for(int i=0;i<arrayOfMataKuliah.length;i++){  
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-------------------------------------");
        }
    }
}
