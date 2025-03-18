package Kuis;

import java.util.Scanner;

public class CafeMain18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        System.out.print("Jumlah Pelanggan: ");
        int countCus=input.nextInt();

        Cafe18[] arrayOfCafe=new Cafe18[countCus];

        DataCafe18 data=new DataCafe18();

        data.inputPesanan(arrayOfCafe);
        data.cetakInfo(arrayOfCafe);
        
    }
}
