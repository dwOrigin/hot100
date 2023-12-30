package martix;

public class searchMatrix {
    public static boolean searchMatrixs(int[][] matrix, int target){
        //左下角开始运行，上小右大
        int row=matrix.length-1;
        int column= 0;
        while (row>-1&&column<matrix[0].length){
            if (matrix[row][column]==target)return true;
            if (matrix[row][column]<target)column++;
            else if (matrix[row][column]>target)row--;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]matrix = { {-5}};
        int target= -6;
        System.out.println(searchMatrixs(matrix,target));
    }
}
