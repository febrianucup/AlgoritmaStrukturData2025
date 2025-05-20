package jobsheet12;

public class NodeAntrian {
    String queueNum;
    String recceptionName;
    NodeAntrian next;
    NodeAntrian prev;

    NodeAntrian(NodeAntrian prev, String num, String name, NodeAntrian next){
        queueNum=num;
        recceptionName=name;
        this.next=next;
        this.prev=prev;
    }
}
