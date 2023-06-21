public class InsertionusingRecursion {
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
    InsertionusingRecursion(){
        this.size=0;
    }
    public void recur(int val,int index){
        head=recursionInsertion(val, index, head);
    }
    private Node recursionInsertion(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=recursionInsertion(val, index--, node.next);
        return node;

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
        InsertionusingRecursion il=new InsertionusingRecursion();
        il.head=new Node(1);
        il.head.next=new Node(2);
        il.display();
        il.recur(3, 1);
        
    }

        
}

