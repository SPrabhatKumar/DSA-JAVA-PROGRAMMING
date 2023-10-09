public class BinaryStringToNumber {
    public static void main(String[] args) {
        String a="1001";
        System.out.println(decimalNumber(a));
    }
    public static int decimalNumber(String number){
        int res=0;
        int index=number.length()-1;
        int base=2;    
        while(index>=0){
            if(number.charAt(index)=='1' && index==number.length()-1){
                res=1;
                index--;
                continue;
            }
            if(number.charAt(index)=='1'){
                res+=base;
            }
            base*=base;
            index--;

        }
        return res;
    }
}
