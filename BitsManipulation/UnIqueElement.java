public class UnIqueElement {
    public static void main(String[] args) {
        int arr[]={2,5,6,7,2,5,7};
        System.out.println(ans(arr));
    }
    public static int ans(int arr[]){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
