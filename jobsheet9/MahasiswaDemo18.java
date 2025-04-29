package jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        StackTugasMahasiswa18 stack=new StackTugasMahasiswa18(5);
        int pilih;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas dan Terbawah");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Jumlah Tugas yang Dikumpulkan");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama=input.nextLine();
                    System.out.print("NIM: ");
                    String NIM=input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas=input.nextLine();
                    Mahasiswa18 mhs=new Mahasiswa18(NIM, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama );
                    break;
                case 2:
                    Mahasiswa18 dinilai=stack.pop();
                    if(dinilai!=null){
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai=input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner=stack.konversiDecimalToBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa18 lihat=stack.peek();
                    Mahasiswa18 first=stack.first();
                    if(lihat!=null){
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                        System.out.println("Tugas pertama dikumpulkan oleh " + first.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas: ");
                    System.out.println("Nama\tNim\tKelas");
                    stack.print();
                    break;
                case 5:
                    int jmlh=stack.jmlhTugas();
                    System.out.println("Jumlah Tugas Yang dikumpulkan adalah " + jmlh);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            
                default:
                    System.out.println("Input invalid!");
                    break;
            }
        }while(pilih!=0);
    }
}
