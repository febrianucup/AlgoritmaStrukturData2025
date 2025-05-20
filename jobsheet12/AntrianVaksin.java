package jobsheet12;

public class AntrianVaksin {
    NodeAntrian head;
    NodeAntrian tail;
    int size;

    AntrianVaksin(){
        head=null;
        size=0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void add(String nomotAntri, String nama){
        NodeAntrian newNode=new NodeAntrian(null, nomotAntri, nama, null);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
        System.out.println("Data " + nama + " antrian nomor " + nomotAntri + "  berhasil ditambahkan");
    }

    void delete() throws Exception{
       if(isEmpty()){
            throw new Exception("Antrian kosong");
       }
       NodeAntrian tmp=head;
       if(size==1){
            head=null;
            size=0;
       }else{
            head=head.next;
            head.prev=null;
            size--;
       }
       System.out.println(tmp.recceptionName + " telah selesai divaksinasi");
    }

    void print() throws Exception{
        if(isEmpty()){
            throw new Exception("Antrian kosong");
        }else{
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("|" + "No." + "    |" + "Nama           " + "|");
            NodeAntrian current=head;
            while(current!=null){
                System.out.printf("| %-5s | %-13s |\n", current.queueNum, current.recceptionName);
                current=current.next;
            }
        }
        System.out.println("Sisa Antrian: " + size);
    }
}
