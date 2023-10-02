import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int number=sc.nextInt();
        System.out.print("Enter the Base value :");
        int base=sc.nextShort();
        int ans=(int)(Math.log(number)/Math.log(base))+1;
        System.out.println(ans);
        System.out.println("The Number of digits in decimal :"+((int)Math.log10(number)+1));//Number of digits in decimal

        //other method is just count the digits in while loop 
        int digits=0;
        while(number>0){
            number=number/base;
            digits++;
        }
        System.out.println(digits);
    }
}
