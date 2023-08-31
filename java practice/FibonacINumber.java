import java.util.Scanner;

public class FibonacINumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The nth Term :");
        int n=in.nextInt();
        int first=0;
        int second=1;
        int res=0;
//        if(n==0){
//            System.out.println(first);
//        }
//        for (int i = 2; i <n; i++) {
//            res=first+second;
//            first=second;
//            second=res;
//        }
        System.out.println(res);
//        Using While Loop
        int count=2;
        while(count<=n){
            int temp= second;
            second=first+second;
            first=temp;
            count++;
        }
        System.out.println(first);
    }
}
