package doublePoints;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>>result = new ArrayList<>();
        int right =nums.length-1;
        for (int i=0;i<right;i++){
            right = nums.length-1;
            int middle=i+1;
            while (middle<right){
                int temp = nums[i]+nums[middle]+nums[right];
                if (temp<0)middle++;
                else if (temp==0) {
                    result.add(Arrays.asList(nums[i], nums[middle], nums[right]));
                    middle++;
                }
                else right--;
            }
        }
        //去重
        Set l= new HashSet(result);
        result.clear();
        result.addAll(l);
        return result;
    }
    public static void main(String[] args) {
        int [] nums={-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> tem= threeSum(nums);
        for (int i=0;i< tem.size();i++){
            System.out.println(tem.get(i));
        }
    }
}
