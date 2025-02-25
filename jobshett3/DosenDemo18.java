package jobshett3;

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

      DataDosen18 myArrayOfDosen=new DataDosen18();
      myArrayOfDosen.dataSemuaDosen(arrayOfDosen);
      myArrayOfDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
      myArrayOfDosen.rerataUsiaDosenPerjenisKelamin(arrayOfDosen);
      myArrayOfDosen.infoDosenPalingTua(arrayOfDosen);
      myArrayOfDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
