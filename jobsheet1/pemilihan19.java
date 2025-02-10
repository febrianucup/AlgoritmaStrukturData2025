import java.util.Scanner;

public class pemilihan19{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.println("Input Nilai Tugas: ");
        double tugas=input.nextDouble();
        System.out.println("Input Nilai Kuis: ");
        double kuis=input.nextDouble();
        System.out.println("Input Nilai UTS: ");
        double uts=input.nextDouble();
        System.out.println("Input Nilai UAS: ");
        double uas=input.nextDouble();
        System.out.println("================================");

        double nilaiAkhir=0;
        
        if(tugas<0 || tugas >100 || kuis<0 || kuis>100 || uts<0 || uts>100 || uas<0 | uas>100){
            System.out.println("Nilai Tidak Valid");
        }else{
            nilaiAkhir=(0.2*tugas)+(0.2*kuis)+(0.3*uts)+(0.4*uas);
        }

        

        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}