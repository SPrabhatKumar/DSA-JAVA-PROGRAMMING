import java.util.Scanner;

public class CommonDivisor {
    public static void GreatestCommonDivisor(int num1,int num2){
        int commondivisor=1;
        if(num1<0 || num2<0){
            System.out.println("Invalid Number");
            return;
        }
        if(num1>=num2){
            for(int i=1;i<=num1;i++){
                if(num1%i==0 & num2%i==0){
                    commondivisor=i;
                }
            }
        }
        else{
            for(int i=1;i<=num2;i++){
                if(num1%i==0 & num2%i==0){
                    commondivisor=i;
                }

            }
        }
        System.out.println("Greatest Common Divisor is :"+commondivisor);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number :");
        int num1=sc.nextShort();
        System.out.println("Enter The Second Number :");
        int num2=sc.nextByte();
        GreatestCommonDivisor(num1, num2);
    }
}
