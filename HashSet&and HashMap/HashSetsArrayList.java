import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetsArrayList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("prabhat");
        list.add("Kumar");
        list.add("Prince");
        list.add("Anand");
        HashSet<String> set=new HashSet<>(list);
        set.add("Rami");
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
