public class IsPowerOfThree {
    public static void main(String[] args) {
        int n=27;
        System.out.println(isPower(n));

    }
    public static boolean isPower(int n){
        return Math.log10(n)/Math.log10(3)%1==0;
    }
}
