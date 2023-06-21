public class Stringode {
    public static void main(String[] args) {
        String st1 = "Prabhat Kumar Singh";
        String st2 = "prabhat Kumar Singh";
        // if(st1 == st2){
        // System.out.println("Strings Are Equal ");
        // }
        // else{
        // System.out.println("String Are Not Equal !");
        // }
        if (st1.compareTo(st2) == 0) {
            // if s1 > s2, it returns positive number
            // if s1 < s2, it returns negative number
            // if s1 == s2, it returns 0
            System.out.println("String is Equal ");
        } else {
            System.out.println("String is Not equal !");
        }
        if (new String("Prabhat") == new String("Prabhat")) {
            System.out.println("String is Equal ");
        } else {
            System.out.println("String is Not is Equal");
        }
    }
}
