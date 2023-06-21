public class RemoveDuplicates {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicate(String str,int index,String newstr){
        if(index==str.length()-1){
            System.out.println(newstr);
            return ;
        }
        char currentchar=str.charAt(index);
        if(map[currentchar-'a']==true){
            removeDuplicate(str, index+1, newstr);
        }else{
            newstr+=currentchar;
            map[currentchar-'a']=true;
            removeDuplicate(str, index+1, newstr);
        }
        
    }
    public static void main(String[] args) {
        String str="aabbccdeffdd";
        removeDuplicate(str, 0, "");
        
    }
}
