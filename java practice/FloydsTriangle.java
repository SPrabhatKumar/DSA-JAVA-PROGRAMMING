public class FloydsTriangle {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        // System.out.println("1");
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
    }
}
