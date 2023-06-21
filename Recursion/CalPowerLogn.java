 import java.util.Scanner;

public class CalPowerLogn {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calPower(x, n/2) *calPower(x, n/2);
        }
        else{
            return calPower(x, n/2)*calPower(x, n/2)*x;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the X value:");
            int x=sc.nextByte();
            System.out.print("\nEnter The N value :");
            int n=sc.nextByte();
            int result =calPower(x, n);
            System.out.println(result);
        }

    }

