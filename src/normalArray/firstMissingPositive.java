package normalArray;

public class firstMissingPositive {
    public static int firstMissingPositives(int[] nums){
        int len=nums.length;
        for (int i=0;i<len;i++){
            if (nums[i]<=0)nums[i]=len+1;
        }
        for (int i=0;i<len;i++){
            int t=Math.abs(nums[i]);
            if (t<=len)nums[t-1]=-Math.abs(nums[t-1]);
        }
        for (int i=0;i<len;i++)
            if (nums[i]>0)return i+1;
        return len+1;
    }

    public static void main(String[] args) {
        int[]nums={1};
        System.out.println(firstMissingPositives(nums));
    }
}
