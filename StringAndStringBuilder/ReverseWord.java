// Input: s = “geeks quiz practice code” 
// Output: s = “code practice quiz geeks”

import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String ns[]=s.split(" ");
        System.out.println(Arrays.toString(ns));
        StringBuffer str=new StringBuffer();
        for(String ele:ns){
            str.append(reverse(ele));
            str.append(" ");
        }
         
        System.out.println(str.toString().substring(0, s.length()));
         
    }
    public static String reverse(String str){
        StringBuffer revstr=new StringBuffer();
        revstr.append(str);
        revstr.reverse();  
        return revstr.toString(); 
    }
}
