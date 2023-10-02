import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth magic number:");
        int n=sc.nextInt();
        int ans=0;
        int base=5;
        while(n>0){
            int lastbit=n&1;
            // System.out.println(lastbit);
            n=n>>1;
            ans=ans+lastbit*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
