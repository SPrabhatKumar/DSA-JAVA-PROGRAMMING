// https://leetcode.com/problems/add-to-array-form-of-integer/description/v989. Add to Array-Form of Integer

import java.util.ArrayList;
import java.util.List;

/**
 * Add_to_Array_Form_of_Integer
 */
public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int num[]={9,9,9,9,9,9,9,9,9,9};
        long sum=0;
        int k=1;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            sum*=10;
        }
        sum=sum/10+k;
        System.out.println(sum);
        // int count=0;
        // System.out.println(count);
        System.out.println(sum);
        List<Integer> list=new ArrayList<>();
        while(sum>0){
            long digit=sum%10;
            list.add((int)digit);
            sum/=10;
        }
        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list2.add(i,list.get(list.size()-i-1));
        }
        System.out.println(list);
        System.out.println(list2);

    }
     
    
}
