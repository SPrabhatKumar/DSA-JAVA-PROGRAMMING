import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequePalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(checkPalindrome(str));
    }
    static boolean checkPalindrome(String str){
        Deque<Character> chdequeue=new ArrayDeque<>();
        for(char c:str.toCharArray()){
            chdequeue.add(c);
        }
        while(chdequeue.size()>1){
            Character first=chdequeue.pollFirst();
            Character last=chdequeue.pollLast();
            if(first!=last){
                return false;
            }
        }
        return true;       
    }
}
