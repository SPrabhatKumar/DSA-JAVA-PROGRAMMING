import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        subStringSet("", "abc");
        ArrayList<String> list = new ArrayList<>();
        subStringSet1("", "abc", list);
        System.out.println(list);
        System.out.println(subStringSet2("", "abc"));

    }

    public static void subStringSet(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subStringSet(p + ch, up.substring(1));
        subStringSet(p, up.substring(1));
    }

    public static void subStringSet1(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        } else {
            char ch = up.charAt(0);
            subStringSet1(p + ch, up.substring(1), list);
            subStringSet1(p, up.substring(1), list);
        }
    }

    public static ArrayList<String> subStringSet2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subStringSet2(p + ch, up.substring(1));
        ArrayList<String> right = subStringSet2(p, up.substring(1));
        left.addAll(right);
        return left;

    }
}
