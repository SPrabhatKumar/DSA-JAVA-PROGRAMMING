public class PascalTrianglenthElement {
    public static void main(String[] args) {
        System.out.println(nthElementPascal(6, 3));
        System.out.println(nthElementPascal(2, 1));
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(nthElementPascal(i-1, j-1));
            }
            System.out.println();
        }
    }
    public static int nthElementPascal(int r,int c){
        if(c>r/2){
            c=r-c;
        }
        long num=1;
        long denomi=1;
        for (int i =c; i>=1; i--) {
            num=num*r;
            denomi=denomi*c;
            c--;
            r--;
        }
        // System.out.println("nums:"+num);
        // System.out.println("denomi:"+denomi);
        return (int)(num/denomi);
    }
}
