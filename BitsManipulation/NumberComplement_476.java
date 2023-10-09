public class NumberComplement_476 {
    public static void main(String[] args) {
        int n=5;
        int bitmask=(1<<getDigits(n))-1;
        int res=n^bitmask;
        System.out.println(res);

        // System.out.println(getDigits(n));
    }
    public static int getDigits(int n){
        return (int)(Math.log(n)/Math.log(2))+1;
    }
}
