package normalArray;

public class productExceptSelf {
    public static int[] productExceptSelfss(int[] nums){
        int len=nums.length;
        int []left=new int[len];
        int []right=new int[len];
        int[] res= new int [len];
        left[0]=1;
        right[len-1]=1;
        for (int i=1;i<len;i++)
            left[i]=left[i-1]*nums[i-1];
        for (int j=len-2;j>=0;j--)
            right[j]=right[j+1]*nums[j+1];
        for (int i=0;i<len;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }
    public static void main(String[]args){
        int[]nums={1,2,3,4,5};
       int []re= productExceptSelfss(nums);
       for (int i:re) System.out.println(i);
    }
}
