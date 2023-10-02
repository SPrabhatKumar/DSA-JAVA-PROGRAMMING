import java.util.Scanner;

public class PascalsTriangles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth row:");
        int n=sc.nextInt();
        System.out.println(1<<(n-1));

    }
}
