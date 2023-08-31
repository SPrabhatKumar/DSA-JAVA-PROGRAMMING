import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to Check");
        int num=in.nextInt();
        boolean res=isPalindrome(num);
        System.out.println(res);
    }

    private static boolean isPalindrome(int num) {
        int temp=num;
        int res=0;
        while(num>0){
            int rem=num%10;
            num/=10;
            res=res*10+rem;
        }
        if(temp==res){
            return true;
        }
        else{
            return false;
        }
    }
}
