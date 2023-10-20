public class DoublyLinkedList {
    class Node{
        private int val;
        private Node next;
        private Node prev;
        Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
        Node (int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }

    }
    private Node head;
    private Node tail;
    private int size;
    DoublyLinkedList(){
        this.size=0;
    }
    public void addFirst(int val){
        Node newnode=new Node(val);
        newnode.next=head;
        newnode.prev=null;
        if(head!=null){
            head.prev=newnode;
        }
        head=newnode;
        
        size++;
    }
    public void addLast(int val){
        Node freshNode=new Node(val);
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=freshNode;
        
    }
    public void displayDoublyLinkedList(){
        Node temp=head;
        Node end=null;
        System.out.print("Starting to Ending :\n");
        while(temp!=null){
            System.out.print(temp.val+"<-->");
            end=temp;
            temp=temp.next;
        }
        
        System.out.print("null\n");
        System.out.println("Ending to Starting :");
        while(end!=null){
            System.out.print(end.val+"<-->");
            end=end.prev;
        }
        System.out.print("null");

    }
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.addFirst(4);
        dl.addFirst(5);
        dl.addFirst(6);
        dl.addFirst(7);
        dl.displayDoublyLinkedList();
    }

}
