import java.util.Scanner;
public class Table1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Table Name:");
        int n=sc.nextInt();
        
        for(int j=1;j<=n;j++)
            for(int i=1;i<=10;i++){
                System.out.printf("%dx%d=%d",j,i,j*i);
                System.out.println();

        }
        System.out.println();

    }
}
