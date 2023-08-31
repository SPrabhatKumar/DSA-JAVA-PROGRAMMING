import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int num1=in.nextInt();
        System.out.println("Enter The Second Number:");
        int num2=in.nextInt();
        System.out.println("Enter The Third Number:");
        int num3=in.nextInt();
        int max=Math.max(num3,Math.max(num1,num2));
        System.out.println("Largest Number is :"+max);
    }
}
