public class StringPermutation {
    public static void printPermu(String str ,String permu){
        if(str.length()==0){
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            printPermu(newstr, permu+currchar);
        }
    }
    public static void main(String[] args) {
        printPermu( "abc", "");
        
    }
}
