package jobsheet3;

import java.util.Scanner;

public class DosenDemo18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        System.out.print("Masukkan Jumlah Dosen: ");
        int jmlh=input.nextInt();
        input.nextLine();
        Dosen18[] arrayOfDosen=new Dosen18[jmlh];

        for(int i=0;i<arrayOfDosen.length;i++){
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("KODE         : ");
            kode=input.nextLine();
            System.out.print("NAMA         : " );
            nama=input.nextLine();
            System.out.print("JENIS KELAMIN: ");
            String gender=input.nextLine();
            if(gender.equalsIgnoreCase("pria")){
                jenisKelamin=true;
            }else{
                jenisKelamin=false;
            }
            System.out.print("USIA         : ");
            dummy=input.nextLine();
            usia=Integer.parseInt(dummy);
            System.out.println("-----------------------");

            arrayOfDosen[i]=new Dosen18(kode, nama, jenisKelamin, usia);
        }

        int choose;
        DataDosen18 myArrayOfDosen=new DataDosen18();
        do{
            System.out.println("1. Tampilkan Seluruh Data Dosen\n2. Jumlah Dosen Sesuai Jenis Kelamin\n3. Rata-Rata Usia Dosen Sesuai Jenis Kelamin\n4. Info Dosen Paling Tua\n5. Info Dosen Paling Muda\n6. Keluar");
            System.out.print("Choose the menu: ");
            choose=input.nextInt();
            System.out.println("-----------------------");

            switch (choose) {
                case 1:
                    myArrayOfDosen.dataSemuaDosen(arrayOfDosen);
                    break;
                case 2:
                    myArrayOfDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
                    break;
                case 3:
                    myArrayOfDosen.rerataUsiaDosenPerjenisKelamin(arrayOfDosen);
                    break;
                case 4:
                    myArrayOfDosen.infoDosenPalingTua(arrayOfDosen);
                    break;
                case 5:
                    myArrayOfDosen.infoDosenPalingMuda(arrayOfDosen);
                    break;
                case 6:
                    System.out.println("Keluar Dari Menu!");
                    break;
            
                default:
                    System.out.println("Invalid!!");
                    break;
            }
        }while(choose!=6);
    }
}
