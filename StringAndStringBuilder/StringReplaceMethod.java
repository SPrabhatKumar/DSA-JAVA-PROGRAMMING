public class StringReplaceMethod {
    public static void main(String[] args) {
        String s="A man, a plan, Pa ca5345476nal: Panama PRABAHT ";
        s=s.replaceAll("[^a-z0-9]"," ");
        System.out.println(s);
    }
}
