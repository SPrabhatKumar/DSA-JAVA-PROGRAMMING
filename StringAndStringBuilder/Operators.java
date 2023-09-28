import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');// it will converts char value in its ascii value and then do addition
        System.out.println("a"+"b");// it will concatinate the strings;
        System.out.println((char)('a'+3));  
        System.out.println("a"+new ArrayList<>());
        System.out.println("A"+ new Integer(59));
    }
}
