public class DeleteFromNthNodeFromLastLL {
    class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        
    }
    private Node head;
    private Node tail;
    private int size;
    DeleteFromNthNodeFromLastLL(){
        this.size=0;
    }
    public void addFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (head == null) {
            head = newNode;
            tail = head;
            size++;
            return;
        }
        size++;
    }
    public void deletenthfromLast(int n){
        Node prev=head;
        if(head==null || head.next==null){
            return ;
        }
        if(n==size){
            head=head.next;
            size--;
            return;
        }
        int frombeg=size-n;
        int i=1;
        while(i<frombeg){
            prev=prev.next;
            i++;
        }
        if(n==1){
            prev.next=null;
            tail=prev;
            size--;
            return;
        }
        else{
            prev.next=prev.next.next;
            size--;
            return;
        }


    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null\n");
    }
    public static void main(String[] args) {
        DeleteFromNthNodeFromLastLL ll=new DeleteFromNthNodeFromLastLL();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.display();
        ll.deletenthfromLast(5);
        ll.display();

        

        
    }
}
