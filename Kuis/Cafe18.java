package Kuis;

public class Cafe18 {
    String namaPlgn, namaKasir, menu;
    int harga, totalPesanan;
    boolean member;

    Cafe18(String namaPlgn, String namaKasir, int harga, boolean member, String menu, int totalPesanan){
        this.namaPlgn=namaPlgn;
        this.namaKasir=namaKasir;
        this.harga=harga;
        this.member=member;
        this.menu=menu;
        this.totalPesanan=totalPesanan;
    }
}
