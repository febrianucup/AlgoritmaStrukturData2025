import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int menu;
        do{
            System.out.println("===MENU===");
            System.out.println("1. Hitung Volume Kubus\n" + "2. Hitung Luas Permukaan Kubus\n" + "3. Hitung Keliling\n" + "4. Keluar");
            System.out.print("Pilih Menu(1/2/3/4): ");
            menu=input.nextInt();
            switch (menu) {
                case 1:
                    int volume=VolumeKubus(input);
                    System.out.println("Volume Kubus: "+volume);
                    break;
                case 2:
                    int luas=LuasKubus(input);
                    System.out.println("Luas Kubus: "+luas);
                    break;
                case 3:
                    int keliling=Keliling(input);
                    System.out.println("Keliling Kubus: "+keliling);
                    break;
                case 4:
                    break;
            }
        }while(menu!=4);
    }

    static int VolumeKubus(Scanner input){
        System.out.print("Input sisi kubus: ");
        int sisi=input.nextInt();
        int Volume=sisi*sisi*sisi;
        return Volume;
    }

    static int LuasKubus(Scanner input){
        System.out.print("Input sisi kubus: ");
        int sisi=input.nextInt();
        int luas=6*sisi*sisi;
        return luas;
    }

    static int Keliling(Scanner input){
        System.out.print("Input sisi kubus: ");
        int sisi=input.nextInt();
        int keliling=12*sisi;
        return keliling;
    }
}
