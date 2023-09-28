public class AsciiToCharacter {
    public static void main(String[] args) {
        // String series="";
        // for (int i = 0; i < 26; i++) {
        //     char c=(char)('a'+i);
        //     series+=c;
        // }
        // System.out.println(series);//it takes big O of n^2 time complexity and it is creating a new obj every time 
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c=(char)('a'+i);
            builder.append(c);
        }
        System.out.println(builder.toString());

    }
}
