public class SkipaCharacter {
    public static void main(String[] args) {
        skip("", "bbaccad");
        System.out.println(skip2("bbaccad"));
    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }
    public static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip2(up.substring(1));
        }
        else{
            return ch+skip2(up.substring(1));
        }
    }
}
