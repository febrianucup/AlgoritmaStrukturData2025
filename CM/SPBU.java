package CM;
import java.util.Scanner;
public class SPBU {
    Scanner in = new Scanner(System.in);
    NodeKendaraan head;
    NodeKendaraan tail;
    int size;
    TransaksiPengisian[] arrOfRiwayatTransaksi;
    int idx;

    SPBU(int n){
        head = null;
        size = 0;
        idx = 0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void addLast(Kendaraan input){
        NodeKendaraan nodeInput=new NodeKendaraan(input, null);

        if(isEmpty()){
            head=nodeInput;
            tail=nodeInput;
        }else{
            tail.next=nodeInput;
            tail=nodeInput;
        }
        System.out.println(">> Kendaraan masuk dalam antrian.");
        size++;
    }

    int cekSize(){
        return size;
    }

    Kendaraan getFirst(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada kendaraan yang bisa dilayani.");
            return null;
        }
        return head.data;
    }

    TransaksiPengisian layaniKendaraan(TransaksiPengisian kendaraan) {
        if (isEmpty()) {
            System.out.println("Antrian Koson");
        }
        
        head = head.next;
        kendaraan.totalBayar = kendaraan.bbm.hargaPerLt * kendaraan.liter;
        arrOfRiwayatTransaksi[idx] = new TransaksiPengisian(kendaraan.kendaraan, kendaraan.bbm, kendaraan.liter, kendaraan.totalBayar);
        idx++;
        size--;
        return kendaraan;
    }

    void tampilRiwayat(){
    for (int i = 0; i < idx; i++) {
        TransaksiPengisian transaksiPengisian = arrOfRiwayatTransaksi[i];
        System.out.println(transaksiPengisian.kendaraan.platNo + " : " + transaksiPengisian.totalBayar);
    }
    }

    void TampilAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            NodeKendaraan current = head;
            System.out.println("Antrian Kendaraan:");
            while (current != null) {
                current.tampil();
                current = current.next;
            }
        }
    }
}
