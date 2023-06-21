import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "Prabhat");
        map.put(2, "Bhaskar");
        // map.put(2,"Prince"); -->It Will Update The Value of key 2
        map.put(3, "Sai");
        map.put(4, "Kumar");
        map.put(5, "Prabhat");
        System.out.println(map);
        System.out.println(map.containsKey(3));        
        System.out.println(map.containsValue("Prabhat"));  
        System.out.println(map.size());  
        System.out.println(map.get(1));    
        System.out.println(map.keySet());
        System.out.println(map.values());
        // System.out.println(map.putIfAbsent(10, "Kumar"));
        // map.remove(4);
        // map.remove(3, "Sai");
        // System.out.println(map);
        

    }
}
