package hashmap;

public class totalnum {

   public static int[] twoSum(int[] nums, int target) {
       int tem= nums.length;
        for(int i=0;i<tem;i++)
        {
            if (nums[i]<=target){
                for (int j=i+1;j<tem;j++) {
                    if (nums[i] + nums[j] == target)
                        return new int[]{i, j};
                }
            }
        }
return null;
    }

    public static void main(String[] args) {
        int nums[]= {0,4,3,0};
        int target=0;
        int a[]=twoSum(nums,target);
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }
}