public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(pat̥hCount(3, 3));

    }
    public static int pat̥hCount(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=pat̥hCount(r-1, c);
        int right=pat̥hCount(r,c-1);
        return left+right;
    }
}
