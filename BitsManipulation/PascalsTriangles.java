import java.util.Scanner;
// PascalsTriangles
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1

public class PascalsTriangles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth row:");
        int n=sc.nextInt();
        System.out.println(1<<(n-1));

    }
}
