public class Sequence {
    public static void findSequence(String str,int index,String newstr){
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(index);
        // to be part
        findSequence(str, index+1, newstr+currchar);
        // not to be part 
        findSequence(str, index+1, newstr);
    }
    public static void main(String[] args) {
        String str="abc";
        findSequence(str, 0, "");
    }
}
 
