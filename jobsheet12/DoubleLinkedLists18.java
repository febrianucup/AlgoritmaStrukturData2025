package jobsheet12;

public class DoubleLinkedLists18 {
    Node18 head;
    int size;

    DoubleLinkedLists18(){
        head=null;
        size=0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void addFirst(int item){
        if(isEmpty()){
            head=new Node18(null, item, null);
        }else{
            Node18 newNode=new Node18(null, item, head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }

    void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node18 current=head;
            while(current.next != null){
                current=current.next;
            }
            Node18 newNode=new Node18(current, item, null);
            current.next=newNode;
            size++;
        }
    }

    void add(int item, int index) throws Exception{  
        if(isEmpty()){
            addFirst(item);
        }else if(index<0||index>size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            Node18 current=head;
            int i=0;
            while (i<index) {
                current=current.next;
                i++;
            }
            if(current.prev==null){
                Node18 newNode=new Node18(null, item, current);
                current.prev=newNode;
                head=newNode;
            }else{
                Node18 newNode18=new Node18(current.prev, item, current);
                newNode18.prev=current.prev;
                newNode18.next=current;
                current.prev.next=newNode18;
                current.prev=newNode18;
            }
            size++;
        }
    }

    int size(){
        return size;
    }

    void clear(){
        head=null;
        size=0;
    }

    void print(){
        if(!isEmpty()){
            Node18 tmp=head;
            while(tmp!=null){
                System.out.print(tmp.data+"\t");
                tmp=tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked Lists Kosong");
        }
    }

    void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if(size==1){
            removeLast();
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }

    void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node18 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void remove(int index) throws Exception{
        if(isEmpty()||index>=size){
            throw new Exception("Nilai indeks di luar batas");
        }else if(index==0){
            removeFirst();
        }else{
            Node18 current=head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }
            if(current.next==null){
                current.prev.next=null;
            }else if(current.prev==null){
                current=current.next;
                current.prev=null;
                head=current;
            }else{
                current.prev.next=current.next;
                current.next.prev=current.prev;
            }
            size--;
        }
    }

    int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    int getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        Node18 tmp=head;
        while (tmp.next != null){
            tmp=tmp.next;
        }
        return tmp.data;
    }

    int get(int index) throws Exception{
         if(isEmpty()||index>=size){
            throw new Exception("Nilai indeks di luar batas");
         }
         Node18 tmp=head;
         for(int i=0;i<index;i++){
            tmp=tmp.next;
         }
         return tmp.data;
    }
}
