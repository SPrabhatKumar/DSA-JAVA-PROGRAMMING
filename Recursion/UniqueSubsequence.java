import java.util.HashSet;

public class UniqueSubsequence {
    public static void uniqueSubssequence(String str,int index,String newstr,HashSet<String>set){

        if(index==str.length()){
            if(set.contains(newstr)){
                return;
            }else{
                set.add(newstr);
                System.out.println(newstr);
                return;
            }
    
        }
        char currchar=str.charAt(index);
        uniqueSubssequence(str, index+1, newstr+currchar, set);
        uniqueSubssequence(str, index+1, newstr, set);
    }

    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        uniqueSubssequence("aba", 0,"", set);

    }
}
