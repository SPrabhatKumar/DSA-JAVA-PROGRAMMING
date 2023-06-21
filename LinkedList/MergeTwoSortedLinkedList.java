public class MergeTwoSortedLinkedList {
    static class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val=val;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
         
    }
    Node head;
    int size;
    MergeTwoSortedLinkedList(){
        this.size=0;

    }
    public void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("LinkedList is Empty:");
        }
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print("Null\n");
    }
    public static void main(String[] args) {
        MergeTwoSortedLinkedList ml=new MergeTwoSortedLinkedList();
        ml.head=new Node(1);
        ml.head.next=new Node(5);
        ml.head.next.next=new Node(7);
        ml.head.next.next.next=new Node(8);
        ml.head.next.next.next.next=new Node(10);
        // ml.head.next.next.next.next.next=new Node(4);
        ml.display();
        MergeTwoSortedLinkedList ml2=new MergeTwoSortedLinkedList();
        ml2.head=new Node(1);
        ml2.head.next=new Node(5);
        ml2.head.next.next=new Node(7);
        ml2.head.next.next.next=new Node(8);
        ml2.head.next.next.next.next=new Node(10);
        ml2.display();


    }
}
