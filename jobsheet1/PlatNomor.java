import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char[] kode={'A','B','D','E','F','G','H','L','N','T'};
        char[][] kota={
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}};

        System.out.print("Masukkan kode: ");
        char inputKode=input.nextLine().charAt(0);

        int index=-1;
        for(int i=0;i<kode.length;i++){
            if(inputKode==kode[i]){
                index=i;
                break;
            }
        }

        if(index!=-1){
            for(int j=0;j<kota[index].length;j++){
                System.out.print(kota[index][j]);
            }
        }else{
            System.out.println("Kode tidak ditemukan");
        }

    }   
}
