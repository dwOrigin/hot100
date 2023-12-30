package normalArray;

public class rotate {
    public static void rotate(int[] nums, int k){
        int len=nums.length;
        if (len<k)k=k%len;
        nums=reverse(0,len-k-1,nums);
        nums=reverse(len-k,len-1,nums);
        nums=reverse(0,len-1,nums);
    }
    public static int [] reverse(int left, int right, int[] T){
        int[]tem= new int[right+1];
        for (int i=0;i<=right-left;i++){
            tem[left+i]=T[right-i];
        }
        for (int j=left;j<=right;j++)
            T[j]=tem[j];
        return T;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for (int i:nums)
            System.out.println(i);
    }
}
