import java.util.Scanner;

/**
 * FindOccurance
 */
public class FindOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str,char element,int index){
        if(index==(str.length())){
            System.out.println("First Element is at index :"+first);
            System.out.println("Last Occurance is at index:"+last);
            return;
        }
        if(str.charAt(index)==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        findOccurance(str, element, index+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String str=sc.nextLine();
        findOccurance(str, 'a', 0);

    }
}