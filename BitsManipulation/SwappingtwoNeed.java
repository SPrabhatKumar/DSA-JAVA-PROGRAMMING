public class SwappingtwoNeed {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("using Bits manipulation:"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Addition & and Substraction:"+a+" "+b);
    }
}
