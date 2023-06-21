 /**
  * ItineraryGraphProblem
  */
import java.util.HashMap;;
public class ItineraryGraphProblem {
    public static String start(HashMap<String,String>ticket){
        HashMap<String,String> rev=new HashMap<>();
        for(String key:ticket.keySet()){
            rev.put(ticket.get(key), key);
        }
        for(String key:ticket.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        HashMap<String,String> tick=new HashMap<>();
        tick.put("chennai", "bengaleru");
        tick.put("mumbai", "delhi");
        tick.put("goa", "chennai");
        tick.put("delhi", "goa");
        String start=start(tick);
        while(tick.containsKey(start)){
            System.out.print(start+"-->");
            start=tick.get(start);
        }
        System.out.print(start);
         
    }
    
 }
