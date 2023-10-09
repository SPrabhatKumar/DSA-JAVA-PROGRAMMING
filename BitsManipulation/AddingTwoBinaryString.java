/**
 * AddingTwoBinaryString
 */
public class AddingTwoBinaryString {

    public static void main(String[] args) {
        String a="101";
        String b="1";
        System.out.println(addBinary(a, b));

    }

    public static String addBinary(String a, String b) {
        int base = 2;
        int ans = 0;
        int i = a.length() - 1;
        while (i >= 0) {
            if (a.charAt(i) == '1' && i==a.length()-1) {
                ans += 1;
            }
            if(a.charAt(i) == '1' && i!=a.length()-1){
                ans+=base;
                base = base * base;
            }
            i--;
        }
        ans/=2;
        System.out.println(ans);
        base=2;
        int ans2 = 0;
        int j = b.length() - 1;
        while (j >= 0) {
            if (a.charAt(j) == '1' && j==b.length()-1) {
                ans2 += 1;
                continue;
            }
            if (a.charAt(j) == '1' && j!=b.length()-1) {
                ans2 += base;
                base = base * base;
            }
            j--;
        }
        ans2/=2;
        System.out.println(ans2);
        ans += ans2;
        return Integer.toBinaryString(ans);
    }

}