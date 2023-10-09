import java.util.ArrayList;
import java.util.Scanner;

public class FactorOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        // factor01(n);
        factorMethod02(n);
    }

    public static void factor01(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    public static void factorMethod02(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i*i<=n; i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i +" ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
