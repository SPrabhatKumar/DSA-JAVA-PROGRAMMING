import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.FieldBorder;

/**
 * FibonaciSeries
 */
class FibonaciSeries1{
    void printFibonaci(int n){
        int first=0;
        int second=1;
        int next_term=0;
        int sum=0;
        System.out.print("0\t1");
        for(int i=0;i<n-2;i++){
            next_term=first+second;
            first=second;
            second=next_term;
            sum=sum+next_term;
            System.out.print( "\t"+next_term);
        }
        System.out.println("\nSum of Fibonacci Series is :"+(sum+1));

    }
}
public class FibonaciSeries {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The N Term :");
        int n=sc.nextInt();
        FibonaciSeries1 fb1=new FibonaciSeries1();
        fb1.printFibonaci(n);

    }
}