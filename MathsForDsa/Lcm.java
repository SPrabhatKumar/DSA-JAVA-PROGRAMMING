public class Lcm {
    public static void main(String[] args) {
        int res=lcmOfNumber(2,9);
        System.out.println(res);
        
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
    public static int lcmOfNumber(int a,int b){
        return (a*b)/gcd(a, b);
    }
}
