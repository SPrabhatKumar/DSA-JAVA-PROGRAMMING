import java.util.Scanner;

public class ReverseString {
    public static void strRev(String str,int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        strRev(str,index-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String :");
        String str=sc.next();
        int index=str.length()-1;
        strRev(str,index);

    }
}
