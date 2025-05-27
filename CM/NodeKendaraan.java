package CM;

public class NodeKendaraan {
    Kendaraan data;
    NodeKendaraan next;

    NodeKendaraan(Kendaraan data, NodeKendaraan next){
        this.data=data;
        this.next=next;
    }
}
