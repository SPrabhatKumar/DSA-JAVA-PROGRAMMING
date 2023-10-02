public class EvenOrOdd {
    public static void main(String[] args) {
        int n=86;
        System.out.println(isodd(n));
        System.out.println(isEven(n));
    }

    public static boolean isodd(int n ){
        return (n & 1)==1;
    }
    public static boolean isEven(int n){
        return (n & 1) !=1;
    }
}
