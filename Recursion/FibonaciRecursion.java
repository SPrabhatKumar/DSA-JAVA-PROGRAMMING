public class FibonaciRecursion {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            System.out.println(returnFib(i));
        }
        
    }
    public static long returnFib(int n){
        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-(Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5));
    }
}
