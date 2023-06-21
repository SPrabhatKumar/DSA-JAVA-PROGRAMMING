import java.util.Scanner;
/**
 * MoveAllX
 * Time Complexity we have traverse on time to all character it become O(n) and Maximum the value of count can be n 
 * so-O(n+N)->O(2n)->O(n)
 */
public class MoveAllX {
    public static void moveAllX(String str,int index,String newstr,int count,char ch){
        if(index==str.length()-1){
            for(int i=0;i<=count;i++){
                newstr+=ch;
            }
            System.out.println(newstr);
            return ;
        }
        if(str.charAt(index)==ch){
            count++;
        }
        else{
            newstr+=str.charAt(index);
        }
        moveAllX(str, index+1, newstr, count, ch);
    }
    public static void printAllX(String newstr){

    }

    public static void main(String[] args) {
        String str="xprabhatkumarxxyyjajfskx";
        String newstr="";
        moveAllX(str, 0, newstr, 0, 'x');
        
    }
}
