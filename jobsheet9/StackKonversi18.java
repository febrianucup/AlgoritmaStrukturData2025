package jobsheet9;

public class StackKonversi18 {
    int[] tumpukanBiner;
    int size, top;

    public StackKonversi18(){
        this.size=32;//Asumsi 32
        tumpukanBiner=new int[size];
        top=-1;
    }
    public boolean isFull(){
        return top==size-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int data){
        if(!isFull()){
            top++;
            tumpukanBiner[top]=data;
        }else{
            System.out.println("Stack penuh!");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int data=tumpukanBiner[top];
            top--;
            return data;
        }else{
            System.out.println("Stack Kosong!");
            return -1;
        }
    }
}
