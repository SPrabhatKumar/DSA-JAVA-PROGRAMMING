public class RangeXor {
    public static void main(String[] args) {
        int ans=xor(9);
        System.out.println(ans);
        //From range a to b xor operation 
        int a =3;
        int b=10;
        int ans2=xor(b)^xor(a-1);
        System.out.println(ans2);
        //only for check other wise it will exceeds tle
        int ans3=0;
        for (int i = 3; i <= b; i++) {
            ans3^=i;
        }
        System.out.println(ans3);
        
    }
    public static int xor(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        return 0;

    }
}
