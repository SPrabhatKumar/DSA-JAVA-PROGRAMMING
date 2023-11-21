import java.util.Scanner;

public class claimSteps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value:");
        int n=sc.nextInt();
        System.out.println("Enter the m value:");
        int m=sc.nextInt();
        int count=0;
        while (n>0) {
            if(n>m){
                n=n-m;
            }else{
                n=n-1;
            }
            count++;
        }
        System.out.println(count);
        
         

        
    }
}
