import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the Number :");
        // int num=sc.nextInt();
        // System.out.println("Number of Digits is :"+numberOfDigits(num));
        // System.out.println(isArmstrong(num,numberOfDigits(num)));
        for(int i=0;i<100000;i++){
            if(isArmstrong(i, numberOfDigits(i))){
                System.out.println(i+" is ArmStrong Number ");
            }
        }
    }
    public static boolean isArmstrong(int number,int noofdigits){
        int sum=0;
        int temp=number;
        while(number>0){
            int digit=number%10;
            int powerofdigits=(int) Math.pow(digit,noofdigits);
            sum+=powerofdigits;
            number=number/10;
        }
        return sum==temp;
    }
    public static int numberOfDigits(int number){
        // int digit=0;
        int count=0;
        while(number>0){
            int digit=number%10;
            // printDigits(digit); // All Digits will be Print 
            number=number/10;
            count++;
        }
        return count;
    }
    public static void printDigits(int digit){
        System.out.println(digit);
    }
}
