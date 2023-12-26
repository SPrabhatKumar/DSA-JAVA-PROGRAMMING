public class Hamming_Distance461 {

    public static void main(String[] args) {
        int a=93;
        int b=73;
        int res=a^b;
        System.out.println(Integer.toBinaryString(res));
        System.out.println(res);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(getDigit(res));
    }
    public static int getDigit(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}