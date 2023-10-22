public class SubarrayDivision {
    public static void main(String[] args) {
        int []arr={3,5,6,4,3,2,4,3,4,1,6,7,1};
        int d=7;
        int m=2;
        int arr1[]={4};
        int d1=4;
        int m1=1;
        System.out.println(birthdayChocolate(arr1, d1, m1));
        System.out.println(birthdayChocolate(arr,d,m));
    }
    public static int birthdayChocolate(int arr[],int d,int m){
        int count=0;
        int segmentSum=0;
        for (int i = 0; i < m; i++) {
            segmentSum+=arr[i];
        }
        if(segmentSum==d){
            count++;
        }
        for (int i = m; i < arr.length; i++) {
            segmentSum-=arr[i-m];
            segmentSum+=arr[i];
            if(segmentSum==d){
                count++;
            }
        }
        return count;
    }
}
