import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,94,24,654,42,76,1};
        System.out.println(targetIndices(arr, 1));

    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        Collections.sort(list);
        List<Integer> list2 = new ArrayList<>();
        for (Integer ele : list) {
            if (ele == target) {

                list2.add(list.indexOf(ele));
            }
        }
        return list2;
    }

}