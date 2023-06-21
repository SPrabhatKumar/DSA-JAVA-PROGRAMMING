import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInBuild {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println("Initail Printing :"+q);
        System.out.println("Iterating :");
        Iterator itr=q.iterator();
        while ( itr.hasNext()) {
            System.out.print(itr.next()+"-->");
        }
        // System.out.println();
        System.out.println(+q.peek());
        System.out.println(q.remove(5));
        Iterator itr2=q.iterator();
        while ( itr2.hasNext()) {
            System.out.print(itr2.next()+"-->");
        }
        
    }
}
