package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class longestConsecutive
{
    public static int longestConstructive(int[] nums){
        if (nums==null) return 0;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int k : nums) {
            int num = map.getOrDefault(k, 1);
        }
        int counter =0;
        for (int i = 1, j = 0; i<nums.length; i++,j++){
                counter=0;
            if (nums[i]-nums[j]==1) {
                counter = map.getOrDefault(nums[j],1);
                counter++;
                map.put(nums[i],counter);
            }
        }
        counter=0;
        for (int num : nums) {
            if (counter < map.getOrDefault(num, 1))
                counter = map.getOrDefault(num,1);
        }
    return counter;
    }
    public static void main(String[] args){
    int [] nums= {};
    int a= longestConstructive(nums);
        System.out.println(a);
    }
}


