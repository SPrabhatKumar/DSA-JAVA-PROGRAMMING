public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(254));
    }
    public static int reverse(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*10+reverse(n/10);
    }
}
