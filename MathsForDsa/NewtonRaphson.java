import java.util.Scanner;

public class NewtonRaphson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        System.out.println(findsqrt(n));
    }
    public static double findsqrt(int n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.1){
                break;
            }
            x=root;
        }
        return root;
    }
}
