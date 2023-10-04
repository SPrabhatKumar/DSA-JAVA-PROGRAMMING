import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        boolean res=ans(n);
        System.out.println(res);
    }
    public static boolean ans(int n){
        return n!=0 && (n&(n-1))==0;
    }
}
