import java.util.Scanner;

public class Perulangan18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim=input.nextLine();
        System.out.println("=============================");

        String duaDigitBelakang=nim.substring(nim.length()-2);
        int n=Integer.parseInt(duaDigitBelakang);

        if(n<10){
            n+=10;
        }

        System.out.println("N: " + n);
        System.out.println("=============================");

        for(int i=1;i<=n;i++){
            if(i==6||i==10){
                continue;
            }else{
                if(i%2==1){
                    System.out.print(" * ");
                }else{
                    System.out.print(i);
                }
            }
        }
    }
}
