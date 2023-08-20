import java.util.Collections;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        // Adding Element in list
        list.add( 4);
        list.add( 5);
        list.add( 6);
        list.add( 6);
        list.add( 8);
        list.add( 5);
        System.out.println(list);
        // get Element
        int ele=list.get(4);
        System.out.println(ele);
        // Adding Element at Specific Index
        list.add( 2, 43);
        System.out.println("Element Added at Index 2 :"+list);
        // Setting element at Specific index 
        list.set(0, 8347);
        System.out.println("Element is Set at Index 0:"+list.get(0));
        // Size of ArrayList
        int size=list.size();
        System.out.println(size);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        // Sorting ArrayList by Using Collection
        Collections.sort(list);
        System.out.println(list);



        
    }
}
