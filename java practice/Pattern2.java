public class Pattern2{
    public static void main(String[] args) {
        int rows=5;
        int columns=4;
        for(int i=1;i<=columns;i++){
            for(int j=1;j<=rows;j++) {
                if(i==1 || j==1 || i==columns || j==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }       
        System.out.println();
        }
    }
}