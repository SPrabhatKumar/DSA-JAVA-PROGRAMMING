import java.util.Scanner;

/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {
    public static void hanoiTower(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("Transfer disk  "+n+" from " +source+ " to " +destination);
            return;
        }
        hanoiTower(n-1, source, destination, helper);
        System.out.println("Transfer disk "+n+ " from "+source+" to "+destination);
        hanoiTower(n-1,  helper,source, destination);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The N Value :");
        int n=sc.nextInt();
        hanoiTower(n, "S", "H", "D");
        
    }
}