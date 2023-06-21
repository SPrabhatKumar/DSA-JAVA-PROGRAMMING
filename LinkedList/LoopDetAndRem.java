public class LoopDetAndRem {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    Node head;
    int size;

    LoopDetAndRem() {
        this.size = 0;
    }

    public void checkLoop(Node head) {
        Node slow = head;
        Node fast = head;
        if (head == null || head.next == null) {
            System.out.println("Linked List Contain Null or Single Node ");
        }
        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("LOOP IS PRESENT !");
                // System.out.println(slow.val);
                if (slow == head && fast == head) {
                    // Junction point is head in this Loop
                    Node temp = head;
                    while (temp.next != slow) {
                        temp = temp.next;
                    }
                    temp.next = null;
                } else {
                    removeLoop(slow, head);
                    return;
                }
            }

        }
    }

    public void removeLoop(Node slow, Node head) {
        Node ptr1 = slow;
        Node ptr2 = head;
        while (ptr1.next != ptr2.next) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next = null;

    }

    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is Empty:");
        }
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }

    public static void main(String[] args) {
        LoopDetAndRem rl = new LoopDetAndRem();
        rl.head = new Node(1);
        rl.head.next = new Node(2);
        rl.head.next.next = new Node(3);
        rl.head.next.next.next = new Node(4);
        rl.head.next.next.next.next = new Node(5);
        rl.head.next.next.next.next.next = new Node(6);
        rl.head.next.next.next.next.next.next = new Node(7);
        rl.head.next.next.next.next.next.next.next = new Node(8);
        rl.display();
        // Creating a loop
        // rl.head.next.next.next.next.next.next.next.next = rl.head.next.next;
        // exception case
        rl.head.next.next.next.next.next =rl.head.next.next;

        rl.checkLoop(rl.head);
        System.out.println("After Removing The Loop The Linked List is :");
        rl.display();

    }
}
