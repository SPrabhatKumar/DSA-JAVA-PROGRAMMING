/**
 * BitsManipulation
 */
public class BitsManipulation {

    public static void main(String[] args) {
        int num=5;
        int pos=3;
        int bitMask=1<<pos;
        // Get Bit
        if((bitMask & num)==0){
            System.out.println("Bits is :0");
        }
        else{
            System.out.println("Bit is :1");
        }
        // Set Bit 
        int newBitMask=bitMask | num;
        System.out.println(newBitMask);

    }
}
