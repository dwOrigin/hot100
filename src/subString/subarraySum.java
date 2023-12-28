package subString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class subarraySum {
    public static int subarraySums(int[] nums, int k){
        Map<Integer,Integer>map= new HashMap<>();
        int [] sums= new int[nums.length+1];
        sums[0]=0;
        for (int j=0;j<nums.length;j++){
            sums[j+1]=nums[j]+sums[j];
        }
        int result=0;
        for (int i=0;i<=nums.length;i++){
            int t= sums[i]-k;
            if (map.containsKey(t))result+=map.get(t);
            map.put(sums[i],map.getOrDefault(sums[i],0)+1);
        }

        return result;
    }

    public static void main(String[] args) {
        int [] nums= {1, 1, 1};
        int k=3;
        System.out.println(subarraySums(nums,k));
    }
}
////\
/*
* 利用hashmap的方式将原本的数组存储并可以随时访问到，可以在不便历的情况下完全访问到所有的可能的情况
* 然后通过使用转换为两数之和的方式，
*
* */