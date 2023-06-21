import java.util.*;
public class StringReplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String 1:");
        String str1=sc.nextLine();
        System.out.println("Enter String 2:");
        String str2=sc.nextLine();
        int siz1=str1.length();
        int siz2=str2.length();
        int result=siz1+siz2;
        System.out.println("Combined Size is :"+result);
    }
}
