public class Gcd {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        System.out.println(Gcd(a,b));
        
    }
    public static int Gcd(int a ,int b){
        if(a==0){
            return b;
        }
        return Gcd(b%a, a);
    }
}
