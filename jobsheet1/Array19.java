import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Menghitung IP Semester");
        System.out.println("=======================");

        String[] namaMK={"Pancasila", "DASPRO", "PrakDASPRO", "RPL", "KTI", "K3", "CTPS", "MATDAS"};
        double[][] bobotNilai=new double[8][2];
        double[] nilaiMhs=new double[8];
        for(int i=0;i<nilaiMhs.length;i++){
            System.out.print("Masukkan Nilai MK " + namaMK[i] + ": ");
            nilaiMhs[i]=input.nextDouble();
            System.out.print("Bobot SKS: ");
            bobotNilai[i][1]=input.nextDouble();
        }

        //konversi nilai ke huruf
        String[] nilaiHuruf=new String[8];
        for(int i=0;i<nilaiMhs.length;i++){
            if(nilaiMhs[i]>80&&nilaiMhs[i]<=100){
                nilaiHuruf[i]="A";
            }else if(nilaiMhs[i]>73&&nilaiMhs[i]<=80){
                nilaiHuruf[i]="B+";
            }else if(nilaiMhs[i]>65&&nilaiMhs[i]<=73){
                nilaiHuruf[i]="B";
            }else if(nilaiMhs[i]>60&&nilaiMhs[i]<=65){
                nilaiHuruf[i]="C+";
            }else if(nilaiMhs[i]>50&&nilaiMhs[i]<=60){
                nilaiHuruf[i]="C";
            }else if(nilaiMhs[i]>39&&nilaiMhs[i]<=50){
                nilaiHuruf[i]="D";
            }else if(nilaiMhs[i]<=39){
                nilaiHuruf[i]="E";
            }
        }

        //pembobotan nilai
        for(int i=0;i<nilaiHuruf.length;i++){
            if(nilaiHuruf[i].equalsIgnoreCase("A")){
                bobotNilai[i][0]=4;
            }else if(nilaiHuruf[i].equalsIgnoreCase("B+")){
                bobotNilai[i][0]=3.5;
            }else if(nilaiHuruf[i].equalsIgnoreCase("B")){
                bobotNilai[i][0]=3;
            }else if(nilaiHuruf[i].equalsIgnoreCase("C+")){
                bobotNilai[i][0]=2.5;
            }else if(nilaiHuruf[i].equalsIgnoreCase("C")){
                bobotNilai[i][0]=2;
            }else if(nilaiHuruf[i].equalsIgnoreCase("D")){
                bobotNilai[i][0]=1;
            }else if(nilaiHuruf[i].equalsIgnoreCase("E")){
                bobotNilai[i][0]=0;
            }
        }

        //tabel menampilkan seluruh nilai
        System.out.println("==Hasil Konversi Nilai==");
        System.out.print(String.format("%-15s", "Mk"));
        System.out.println("Nilai Angka\t" + "Nilai Huruf\t" + "Bobot Nilai");
        for(int i=0;i<nilaiMhs.length;i++){
            System.out.print(String.format("%-15s", namaMK[i]));
            System.out.println(nilaiMhs[i] + "\t\t" + nilaiHuruf[i] + "\t\t" + bobotNilai[i][0]);
        }
        
        //menentukan IP
        double totalNilai=0;
        double totalSKS=0;
        for(int i=0;i<bobotNilai.length;i++){
            totalNilai+=bobotNilai[i][0]*bobotNilai[i][1];
            totalSKS+=bobotNilai[i][1];
        }
        System.out.println("==Hasil IP==");
        double ip=totalNilai/totalSKS;
        System.out.println("IP: " + ip);
    }
}