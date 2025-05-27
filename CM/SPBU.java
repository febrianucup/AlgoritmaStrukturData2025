package CM;

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

    void addLast(Kendaraan input){
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
