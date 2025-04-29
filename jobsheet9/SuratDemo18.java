package jobsheet9;

import java.util.Scanner;

public class SuratDemo18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan Jumlah yang Ingin diProses: ");
        int jmlh=input.nextInt();
        StackSuratMahasiswa18 surat=new StackSuratMahasiswa18(jmlh);

        int choose;
        

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin ");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Daftar Surat");
            System.out.println("5. Cari Surat");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            choose=input.nextInt();
            input.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("id Surat: ");
                    String id=input.nextLine();
                    System.out.print("Nama: ");
                    String nama=input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas=input.nextLine();
                    System.out.print("Jenis izin (S=sakit, I=izin): ");
                    char jnsIzin=input.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi=input.nextInt();
                    Surat18 srt=new Surat18(id, nama, kelas, jnsIzin, durasi);
                    surat.push(srt);
                    input.nextLine();
                    System.out.println("Data Surat berhasil ditambahkan!");
                    break;
                case 2:
                    Surat18 verif=surat.pop();
                    if(verif!=null){
                        System.out.println("Memverifikasi surat " + verif.namaMahasiswa);
                        System.out.print("Verifikasi (Ya/Tidak): ");
                        String vrf=input.nextLine();
                        if(vrf.equalsIgnoreCase("Ya")){
                            System.out.printf("Surat %s sudah diterima\n", verif.namaMahasiswa);
                        }else if(vrf.equalsIgnoreCase("tidak")){
                            System.out.printf("Surat %s tidak diterima\n", verif.namaMahasiswa);
                        }
                    }
                    break;
                case 3:
                    Surat18 cekSurat=surat.peek();
                    if(cekSurat!=null){
                        System.out.println("Surat terakhir yang dikumpukan milik " + cekSurat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.println("Tampil semua data surat: ");
                    System.out.println("ID\tNama\tKelas\tJenis\tDurasi");
                    surat.print();
                    break;
                case 5:
                    System.out.print("Masukkan nama yang ingin dicari: ");
                    String name=input.nextLine();
                    surat.printSearch(name, surat.surat);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }while(choose!=0);

    }
}
