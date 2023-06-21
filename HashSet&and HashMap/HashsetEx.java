import java.util.HashSet;
import java.util.Iterator;
public class HashsetEx {

    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(1);
        System.out.println(h);
        System.out.println(h.contains(2));
        System.out.println( h.remove(5));
        System.out.println(h.isEmpty());
        System.out.println("Size of HashSet is :"+h.size());
        Iterator itr=h.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}