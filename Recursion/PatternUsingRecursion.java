public class PatternUsingRecursion {
    public static void main(String[] args) {
        print(5);
        triangle2(4, 0);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();
        print(n-1);

    }
    public static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle2(r, c+1);
        }else{
            System.out.println();
            triangle2(r-1, 0);
        }

    }
    public static void triangle2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle2(r, c+1);
            System.out.print("*");
        }else{
            triangle2(r-1, 0);
            System.out.println();
        }

    }
}
