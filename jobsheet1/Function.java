import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] jenis={"Aglonema", "Keladi", "Acolasia", "Mawar"};
        int[][] royalGarden={{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};

        totalPendapatan(royalGarden);
        stokBunga(royalGarden, jenis);
    }

    static void totalPendapatan(int[][] a){
        int[] harga={75000, 50000, 60000, 10000};
        for(int i=0;i<a.length;i++){
            int totalPercabang=0;
            for(int j=0;j<a[i].length;j++){
                totalPercabang+=a[i][j]*harga[j];
            }
            System.out.println("Total pengahsilan RoyalGarden" + (i+1) + ": " + totalPercabang);
        }
    }

    static void stokBunga(int[][] a, String[] b){
        System.out.print("\t\t");
        for(int i=0;i<b.length;i++){
            System.out.print(String.format("%-15s", b[i]));
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print("Royalgarden\t" + (i+1));
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println();
        }
    }


}
