import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s= "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String [] strarr=s.split(" ");
        System.out.println(Arrays.toString(strarr));
        String last=strarr[strarr.length-1];
        return last.length();
    }
}
 
