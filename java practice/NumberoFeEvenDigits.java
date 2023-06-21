import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberoFeEvenDigits {
    public static void main(String[] args) {
        Method2 m2=new Method2();
        int arr[]={12,43,654,24,5,2332,532523,543,3,4,5};
        System.out.println(m2.numberOfEvenDigit(arr));
        String strarr[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            strarr[i]=String.valueOf(arr[i]);
        }
        System.out.println(Arrays.toString(strarr));
        int count=0;
        for (String string : strarr) {
            if(string.length()%2==0){
                count++;
            }
        }
        System.out.println("The Number of Even Digit Number in the Array is :"+count);
    }
}
class Method2{
    int count=0;
    public int numberOfEvenDigit(int arr[]){
        for (int i : arr) {
            if(even(i)%2==0){
                count++;
            }
            
        }
        return count;
    }
    private int even(int i) {
        int digit=0;
        while(i>0){
            digit++;
            i=i/10;
        }
        return digit;
    }
}
