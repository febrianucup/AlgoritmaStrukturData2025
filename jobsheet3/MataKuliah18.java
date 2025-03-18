package jobsheet3;
import java.util.Scanner;
public class MataKuliah18 {
    Scanner input=new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah18(){

    }

    public MataKuliah18(String kode, String nama, int sks, int jumlahJam){
        this.kode=kode;
        this.nama=nama;
        this.sks=sks;
        this.jumlahJam=jumlahJam;
    }

    void tambahData(){
        String dummy;
        System.out.print("KODE        : ");
        this. kode=input.nextLine();
        System.out.print("NAMA        : ");
        this.nama=input.nextLine();
        System.out.print("SKS         : ");
        dummy=input.nextLine();
        this.sks=Integer.parseInt(dummy);
        System.out.print("Jumlah Jam  : ");
        dummy=input.nextLine();
        this.jumlahJam=Integer.parseInt(dummy);
    }    

    void cetakInfo(){
        System.out.println("NIM    : " + kode);
        System.out.println("NAMA   : " + nama);
        System.out.println("KELAS  : " + sks);
        System.out.println("IPK    : " + jumlahJam);
    }
}
