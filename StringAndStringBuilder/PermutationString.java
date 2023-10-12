import java.util.ArrayList;

public class PermutationString {
    public static void main(String[] args) {
        permutation("", "abc");
        ArrayList<String> list=new ArrayList<>();
        list=permutationList("", "abc");
        System.out.println(list);
        System.out.println(countPermutation("", "abc"));
    }
    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            permutation(first+ch+second, up.substring(1));
        }
    }
    public static ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> res=new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            res.addAll(permutationList(first+ch+second, up.substring(1)));
        }
        return res;
    }
    public static int countPermutation(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            count=count+countPermutation(first+ch+second, up.substring(1));
        }
        return count;
    }
}
