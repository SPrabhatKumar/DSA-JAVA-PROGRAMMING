public class RevLinkedList {
    class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    RevLinkedList(){
        this.size=0;
    }
    public void addLast(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            tail=head;
            size++;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;
    }
    public void revLInkedList(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=head;
        Node current=head.next;
        while (current!=null) {
            Node next=current.next;
            current.next=prev;
            // Update The Nodes
            prev=current;
            current=next;
        }
        head.next=null;
        head=prev;

    }
    public Node reverseRecLL(Node head){
        if(head ==null|| head.next==null){
            return head;
        }
        Node newNode=reverseRecLL(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print("Null\n");
    }
    public static void main(String[] args) {
        RevLinkedList r=new RevLinkedList();
        r.addLast(44);
        r.addLast(43);
        r.addLast(45);
        r.addLast(46);
        r.addLast(47);
        r.addLast(48);
        System.out.println("Before Reversing The Linked List:");
        r.display();
        System.out.println("After Reversing The Linked List:");
        r.revLInkedList();
        r.display();
        r.head=r.reverseRecLL(r.head);
        r.display();
        
    }
}
