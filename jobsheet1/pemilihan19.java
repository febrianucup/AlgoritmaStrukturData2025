import java.util.Scanner;

public class pemilihan19{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Input Nilai Tugas: ");
        double tugas=input.nextDouble();
        System.out.print("Input Nilai Kuis: ");
        double kuis=input.nextDouble();
        System.out.print("Input Nilai UTS: ");
        double uts=input.nextDouble();
        System.out.print("Input Nilai UAS: ");
        double uas=input.nextDouble();
        System.out.println("================================");

        double nilaiAkhir=0;
        
        if(tugas<0 || tugas >100 || kuis<0 || kuis>100 || uts<0 || uts>100 || uas<0 | uas>100){
            System.out.println("Nilai Tidak Valid");
            System.out.println("================================");
        }else{
            nilaiAkhir=(0.2*tugas)+(0.2*kuis)+(0.3*uts)+(0.4*uas);
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            String indeks="";
            if(nilaiAkhir>80&&nilaiAkhir<=100){
                indeks="A";
            }else if(nilaiAkhir>73&&nilaiAkhir<=80){
                indeks="B+";
            }else if(nilaiAkhir>65&&nilaiAkhir<=73){
                indeks="B";
            }else if(nilaiAkhir>60&&nilaiAkhir<=65){
                indeks="C+";
            }else if(nilaiAkhir>50&&nilaiAkhir<=60){
                indeks="C";
            }else if(nilaiAkhir>39&&nilaiAkhir<=50){
                indeks="D";
            }else if(nilaiAkhir<=39){
                indeks="E";
            }else{
                System.out.println();
            }
            
            System.out.println("Nilai Huruf: " + indeks);

            if(indeks=="A" || indeks=="B+" || indeks=="B" || indeks=="C+" || indeks=="C"){
                System.out.println("Selamat Anda Lulus");
            }else if(indeks=="D" || indeks=="E"){
                System.out.println("Anda Tidak Lulus");
            }
        }
    }
}