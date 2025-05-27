package CM;

import java.util.Scanner;

public class SPBU {
    NodeKendaraan head;
    NodeKendaraan tail;
    int size;

    SPBU(){
        head=null;
        size=0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void addLast(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Masukkan Plat Nomor: ");
        String plat=ip.nextLine();
        System.out.print("Masukkan Jenis Kendaraan: ");
        String tipe=ip.nextLine();
        System.out.print("Masukkan Merk: ");
        String merk=ip.nextLine();

        Kendaraan input=new Kendaraan(plat, tipe, merk);

        NodeKendaraan nodeInput=new NodeKendaraan(input, null);

        if(isEmpty()){
            head=nodeInput;
            tail=nodeInput;
        }else{
            head.next=nodeInput;
            tail=nodeInput;
        }
        size++;
    }

    int cekSize(){
        return size;
    }
}
