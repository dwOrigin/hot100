package martix;

public class rotate {
    //先按照对角线进行翻转，然后进行逆序排列就行
    public static void rotates(int[][] matrix){
        int column=matrix.length;
        int row= matrix[0].length;
        int tem;
        for (int i=0;i<row;i++){
            for (int j=i+1;j<column;j++){
                tem=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tem;
            }
        }
        for (int i=0;i<row;i++)matrix[i]=reverse(matrix[i]);
    }
    public static int[] reverse(int[] nums){
        int a;
        for (int i=0;i<=nums.length/2-1;i++){
            a=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=a;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[][]matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotates(matrix);
    }
}
