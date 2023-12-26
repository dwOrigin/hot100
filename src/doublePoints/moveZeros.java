package doublePoints;

public class moveZeros {
    public static void moveZeroes(int[] nums){
        int k= nums.length-1;
        for (int i=nums.length-1;i>=0;i--)
        {
            if (nums[i]==0){
                for (int j=i; j<=k-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[k]=0;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums= {0};
        moveZeroes(nums);
        for (int i:nums)
            System.out.println(i);
    }
}




/// 官方解法//////////////////////////////////////
/*
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

作者：力扣官方题解
        链接：https://leetcode.cn/problems/move-zeroes/
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
// 如果是当前的数值不是0的话，那么left和right所指向的就是同一个位置，此时就不需要去通过查找去实现
//如果说是没有在相同的位置的话，就需要对其位置进行变换，同时可以实现多个0的同时变换