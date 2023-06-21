/**
 * LinkedList
 */
public class LinkedList {
    private Node tail;
    private Node head;
    private int size;

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
            size++;

        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void InsertFirst(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        if (head == null) {
            head = newnode;
            size++;
        }
        size++;

    }

    
    public void InsertLast(int val) {
        Node newnode = new Node(val);
        if (head== null) {
             InsertFirst(val);
             return;
        }else{
            tail.next = newnode;
            tail = newnode;
            size++;
        }
    }

    public void DisplayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.InsertFirst(54);
        l1.InsertFirst(51);
        l1.InsertFirst(544);
        l1.InsertFirst(548);
        l1.InsertFirst(5465);
        l1.DisplayLL();
        l1.InsertLast(37);
        l1.InsertLast(43);
        l1.DisplayLL();
        l1.InsertLast(0);
        l1.DisplayLL();

    }

}