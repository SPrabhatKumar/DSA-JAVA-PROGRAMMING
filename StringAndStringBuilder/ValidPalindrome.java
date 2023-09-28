public class ValidPalindrome {
    public static void main(String[] args) {
        String name="abccba";
        int start=0;
        int end=name.length()-1;
        while (start<=end) {
            if(name.charAt(start)==name.charAt(end)){
                start++;
                end--;
            }else{
                break;
            }
        }
        if(start>end){
            System.out.println("Valid Palindrome");
        }else{
            System.out.println("Not a Valid Palindrome !");
        }
        
    }
}
