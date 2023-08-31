import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Number :");
        long num=in.nextLong();
        System.out.print("Enter the digit :");
        int d=in.nextInt();
        int counter=0;
        while(num>0){
            int digit= (int) (num%10);
            if(digit==d){
                counter++;
            }
            num=num/10;
        }
        System.out.println("the Digit Occurance is "+counter);


    }
}
