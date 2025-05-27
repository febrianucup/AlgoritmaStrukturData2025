package jobsheet11;

public class SingleLinkedList18 {
    Node18 head;
    Node18 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node18 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa18 input) {
        Node18 ndInput = new Node18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa18 input) {
        Node18 ndInput = new Node18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa18 input) {
        Node18 ndInput = new Node18(input, null);
        Node18 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa18 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node18 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("indeks melebihi batas linked list");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("indeks melebihi batas linked list");
                return;
            }
            temp.next = new Node18(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    
}
