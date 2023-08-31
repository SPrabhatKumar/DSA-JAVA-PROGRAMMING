import java.util.Scanner;

public class EnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Fruit String:");
        String str=in.next();
        switch (str){
            case "Apple":
                System.out.println("Apple is sweet and Round Fruit");
                break;
            case "Banana":
                System.out.println("Banana is Yellowish Sweet Fruit");
                break;
            case "Grape":
                System.out.println("Grapes is small Round Fruit");
                break;
            case "Orange":
                System.out.println("Orange is Sour Fruit");
                break;
            default:
                System.out.println("Enter The Valid Fruit");
        }
        switch (str){
            case "Apple"-> System.out.println("Apple is sweet and Round Fruit");
            case "Banana"-> System.out.println("Banana is Yellowish Sweet Fruit");
            case "Grapes"-> System.out.println("Grapes is small Round Fruit");
            case "orange"-> System.out.println("Orange is Sour Fruit");
            default -> System.out.println("Enter The valid fruit Name");
        }
    }
}
