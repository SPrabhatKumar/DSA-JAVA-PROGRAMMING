import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CountBinary {
    public static void main(String[] args) {
        String str="010100";
        ArrayList<String> res= subseq("",str);
        HashSet<String> set=new HashSet<>();
        for (int i=0;i<res.size();i++){
            if(isEqual(res.get(i))){
                if(res.get(i)!=""){
                    set.add(res.get(i));
                }
            }

        }
//        System.out.println(Arrays.toString());
        System.out.println(set);

    }

    public static ArrayList<String> subseq(String p,String up){
        if(up.length()==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseq(p+ch,up.substring(1));
        ArrayList<String> right=subseq(p,up.substring(1));
        left.addAll(right);
        return left;


    }
    public static boolean isEqual(String str){
        if(str.length()==1){
            return false;
        }
        int zero=0;
        int one=0;
        for(char c:str.toCharArray()){
            if(c=='0'){
                zero++;
            }
            if(c=='1'){
                one++;
            }
        }
        return zero==one? true:false;
    }
}
