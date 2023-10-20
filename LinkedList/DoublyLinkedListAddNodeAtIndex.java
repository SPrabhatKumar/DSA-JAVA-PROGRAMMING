public class DoublyLinkedListAddNodeAtIndex {
    private Node tail;
    private Node head;
    private int size;
    private class Node{
        private int val;
        private Node prev;
        private Node next;
        Node(int val){
            this.val=val;
        }
        Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

    }
    DoublyLinkedListAddNodeAtIndex(){
        this.size=0;
    }
    public void addFirstDL(int val){
        if(head==null){
            Node newnode=new Node(val);
            head=newnode;
            tail=newnode;
            size++;
            return;
        }
        Node newNode=new Node(val);
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }
    public void addLastDL(int val){
        if(head==null){
            addFirstDL(val);
            return;
        }
        Node newNode=new Node(val);
        tail.next=newNode;
        newNode.next=null;
        tail=newNode;
        size++;

    }
    public void displayDL(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"<->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public void addAtIndexDL(int val,int index){
        if(index==0){
            addFirstDL(val);
            return;
        }
        if(index==size-1){
            addLastDL(val);
            return;
        }
        if(index>size){
            System.out.println("Element cannot be added at "+index);
        }
        Node temp=head;
        int i=1;
        while(i<index){
            temp=temp.next;
            i++;
        }
        Node newNode=new Node(val,temp.next,temp);
        temp.next=newNode;
        newNode.next.prev=newNode;
        size++;

    }
    public static void main(String[] args) {
        DoublyLinkedListAddNodeAtIndex dl=new DoublyLinkedListAddNodeAtIndex();
        dl.addFirstDL(1);
        dl.addFirstDL(2);
        dl.addFirstDL(3);
        dl.addFirstDL(4);
        dl.displayDL();
        dl.addLastDL(5);
        dl.addLastDL(6);
        dl.addLastDL(7);
        dl.displayDL();
        System.out.println(dl.size);
        System.out.println(dl.head.val);
        System.out.println(dl.tail.val);
        dl.addAtIndexDL(100, 4);
        dl.displayDL();
        System.out.println(dl.size);
        System.out.println(dl.head.val);
        System.out.println(dl.tail.val);

    }
}
