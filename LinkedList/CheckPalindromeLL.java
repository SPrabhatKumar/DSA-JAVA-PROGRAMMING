public class CheckPalindromeLL {
    static class Node{
        int val;
        Node next;
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
    CheckPalindromeLL(){
        this.size=0;
    }
    public Node middleElement(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public Node reverseFromMiddle(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean checkPalindromeLL(Node head){
        if(head.next==null||head==null){
            return true;
        }
        Node firstHalfEnd=middleElement(head);
        Node secondEndStart=reverseFromMiddle(firstHalfEnd.next);
        Node temp=head;
        while(secondEndStart!=null){
            if(temp.val!=secondEndStart.val){
                return false;
            }
            temp=temp.next;
            secondEndStart=secondEndStart.next;
        }
        return true;

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
        CheckPalindromeLL ll=new CheckPalindromeLL();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next.next=new Node(2);
        ll.head.next.next.next.next=new Node(1);
        // ll.head.next.next.next.next.next=new Node(59);
        ll.display();
        boolean check=ll.checkPalindromeLL(ll.head);
        System.out.println(check);
    }

}
