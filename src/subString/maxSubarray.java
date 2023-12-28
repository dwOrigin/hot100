package subString;

public class maxSubarray {
    public static int maxSubArray(int[] nums){
        int numslen=nums.length;
        int [] sums = new int[numslen];
        sums[0]=nums[0];
        for (int i=1;i<numslen;i++)//初始化
            sums[i]=Math.max(nums[i],nums[i]+sums[i-1]);
        int max= Integer.MIN_VALUE;
        for (int i: sums)
        {
            if (i>max)max=i;
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
