import java.util.Scanner;

public class primeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= number) {
            if (number % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > number;
    }
}
