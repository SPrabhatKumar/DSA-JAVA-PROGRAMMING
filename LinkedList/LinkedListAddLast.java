public class LinkedListAddLast {
    private Node head;
    private Node tail;
    private int size;

    LinkedListAddLast() {
        this.size = 0;
        this.head = null;
        this.tail = null;

    }

    public class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            size++;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
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
    public void addIndex(int val,int index){
        if(index==0){
            addFirst(val);
            return;
        }
        if(index==size){
            addLast(val);
            return;
        }
        Node traverse=head;
        for(int i=1;i<index;i++){
            traverse=traverse.next;
        }
        Node newnode=new Node(val,traverse.next);
        traverse.next=newnode;
        size++;
    }
    public int removeFirst(){
        int val=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int removeLast(){
        if(size<=1){
            return removeFirst();
        }
        Node n=head;
        while(n.next.next!=null){
            n=n.next;
        }
        int val=n.data;
        tail=n;
        tail.next=null;
        return val;
        
    }
    public int removeAtIndex(int index){
        if(index==0){
            removeFirst();
        }
        if(index==size-1){
            removeLast();
        }
    
        Node tarNode=getNode(index-1);
        int val=tarNode.data;
        tarNode.next=tarNode.next.next;
        size--;
        return val;

    }
    public Node getNode(int index){
        if(index==0){
            return head;
        } 
        if(index==size-1){
            return tail;
        }
        Node sl=head;
        for(int i=1;i<index+1;i++){
            sl=sl.next;
        }
        return sl;
    }
    public Node getNodeByValue(int value){
        Node nd=head;
        while(nd.next!=null){
            if(nd.data==value){
                return nd;
            }
            nd=nd.next;
        }
        return null;
    }

    public void displayLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListAddLast l1 = new LinkedListAddLast();
        l1.addLast(54);
        l1.addLast(65);
        l1.addLast(546);
        l1.addLast(867);
        System.out.println("Adding Element at Last :");
        l1.displayLinkedList();
        l1.addLast(746);
        l1.addLast(746);
        l1.displayLinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        System.out.println("Adding Element at First:");
        l1.displayLinkedList();
        System.out.println("Adding Element at Index 2");
        l1.addIndex(10, 2);
        l1.displayLinkedList();
        System.out.println("After Removing Element from Starting Index i.e:"+l1.removeFirst());
        l1.displayLinkedList();
        l1.displayLinkedList();
        System.out.println("Value at Index 4 is :"+l1.getNode(4).data);
        System.out.println("Removing Last Index:"+l1.removeLast());
        l1.displayLinkedList();
        l1.removeAtIndex(4);
        System.out.println("After Removing Index 4 Node :");
        l1.displayLinkedList();
        System.out.println("Null Mean Not Found\nOther wise value is Found"+l1.getNodeByValue(2).data);

    }
}
