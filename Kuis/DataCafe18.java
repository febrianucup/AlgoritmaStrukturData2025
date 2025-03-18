package Kuis;

import java.util.Scanner;

public class DataCafe18 {
    Scanner input=new Scanner(System.in);
    String CustomerName, cassierName, menu;
    int harga, totalPesanan;
    boolean member;
    void inputPesanan(Cafe18[] arrayOfCafe){
        for(int i=0;i<arrayOfCafe.length;i++){
            System.out.println("Input pesanan customer ke-" + (i+1));
            System.out.print("Nama Customer: ");
            CustomerName=input.nextLine();
            System.out.print("Input menu: ");
            menu=input.nextLine();
            System.out.print("Masukkan harga satuan: ");
            harga=input.nextInt();
            System.out.print("Jumlah pesanan: ");
            totalPesanan=input.nextInt();
            input.nextLine();
            System.out.print("Member?(Yes/No) : ");
            String itsMember=input.nextLine();
            if(itsMember.equalsIgnoreCase("Yes")){
                member=true;
            }else if(itsMember.equalsIgnoreCase("No")){
                member=false;
            }else{
                System.out.println("Invalid input!");
            }
            System.out.print("Nama Kasir: ");
            cassierName=input.nextLine();
            
            arrayOfCafe[i]=new Cafe18(CustomerName, cassierName, harga, member, menu, totalPesanan);
        }
        System.out.println("-------------------------------");
    }

    void cetakInfo(Cafe18[] arrayOfCafe){
        int i=1;
        for(Cafe18 cafe:arrayOfCafe){
            System.out.println("Data Pelanggan ke-" + i);
            System.out.println("Nama pelanggan: " + cafe.namaPlgn);
            System.out.println("Menu: " + cafe.menu);
            System.out.println("Harga satuan: " + cafe.harga);
            System.out.println("Jumlah pesanan: " + cafe.totalPesanan);
            String member=cafe.member?"Yes":"No";
            System.out.println("Member: " + member);
            System.out.println("Nama kasir: " + cafe.namaKasir);
            System.out.println("-----------------------------");
            i++;
        }
    }
}
