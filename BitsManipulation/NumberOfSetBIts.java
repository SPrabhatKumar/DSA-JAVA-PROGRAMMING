import java.util.Scanner;

public class NumberOfSetBIts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int count=0;
        System.out.println("Binary of Number is :"+Integer.toBinaryString(n));
        // while(n>0){
        //     if((n & 1)==1){
        //         count++;
        //     }
        //     n=n>>1;
        // }
        // System.out.println(count);

        // Approach-2 will be 
        int res=ans_2(n);
        System.out.println(res);
        // Approach -3 will be 
        int res2=ans_3(n);
        System.out.println(res2);

    }
    public static int ans_2(int n){
        int count =0;
        while(n>0){
            count++;
            n-=(n&-n);
        }
        return count;
    }
    public static int ans_3(int n){
        int count=0;
        while(n>0){
            count++;
            n=(n&(n-1));
        }
        return count;
    }
}
