package martix;

public class searchMatrix {
    public static boolean searchMatrixs(int[][] matrix, int target){
        int left =-1;
        int right=-1;
        int rows=matrix.length;
        int columns=matrix[0].length;
        int central=Math.min(rows,columns);
        for (int i=0;i<central-1;i++){
            if (matrix[i][i]==target)
                return true;
            if (matrix[i][i]<target&&matrix[i+1][i+1]>target){
                left=i;
                right=i;
                break;
            }
        }
        for (int i=right+1;i<rows;i++ ) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == target) return true;
            }
        }
        for (int i=left+1;i<columns;i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[j][i] == target) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target= 33;
        System.out.println(searchMatrixs(matrix,target));
    }
}
