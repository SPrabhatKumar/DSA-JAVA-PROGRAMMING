public class RemoveDuplicate {
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
    RemoveDuplicate(){
        this.size=0;
    }
    public void removeDuplicate(){
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            if(prev.val==curr.val){
                prev.next=curr.next;
                curr=curr.next;

                size--;
            }
            else{
                prev=curr;
                curr=curr.next;
            }

        }
        System.out.println("Inside Remove Duplicate method");

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
        RemoveDuplicate rm=new RemoveDuplicate();
        rm.head=new Node(1);
        rm.head.next=new Node(1);
        rm.head.next.next=new Node(2);
        rm.head.next.next.next=new Node(3);
        rm.head.next.next.next.next=new Node(4);
        rm.head.next.next.next.next.next=new Node(4);
        rm.display();
        rm.removeDuplicate();
        rm.display();
    }
}
