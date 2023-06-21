/**
 * SingularLL
 */
public class SingularLL {
    Node head;
    private int size;
    SingularLL(){
        size=0;
    }
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode=lastNode.next;
    }


    public static void main(String[] args) {
        SingularLL sl=new SingularLL();

    }
}