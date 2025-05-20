package jobsheet12;

public class ListFilm {
    NodeFilm head;
    int size;

    ListFilm() {
        this.head = null;
        size=0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(String idFilm, String judulFilm, double rating) {
        NodeFilm filmBaru = new NodeFilm(idFilm, judulFilm, rating);
        if (isEmpty()) {
            head = filmBaru;
            tail = filmBaru;
        } else {
            filmBaru.next = head;
            head.prev = filmBaru;
            head = filmBaru;
        }
    }

    void addLast(String idFilm, String judulFilm, double rating) {
        NodeFilm filmBaru = new NodeFilm(idFilm, judulFilm, rating);
          if(isEmpty()){
            addFirst(idFilm, judulFilm, rating);
        }else{
            NodeFilm current=head;
            while(current.next != null){
                current=current.next;
            }
            NodeFilm newNode=new NodeFilm(idFilm, judulFilm, rating);
            current.next=newNode;
            size++;
        }
    }
}
