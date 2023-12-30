package martix;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public static List<Integer>spiralOrders(int[][] matrix){
        int row=matrix.length;
        int column=matrix[0].length;
        List<Integer>res=new ArrayList<>();
        int left=0;
        int right=column-1;
        int up=0;
        int down=row-1;
        for (int i=0;i<row*column;){
            for (int a=left;a<=right;a++) {
                res.add(matrix[up][a]);
                i++;
            }
            if (i==row*column)break;
            up++;
            for (int b=up;b<=down;b++) {
                res.add(matrix[b][right]);
                i++;
            }
            if (i==row*column)break;
            right--;
            for (int c=right;c>=left;c--) {
                i++;
                res.add(matrix[down][c]);
            }
            if (i==row*column)break;
            down--;
            for (int d=down;d>=up;d--) {
                i++;
                res.add(matrix[d][left]);
            }
            if (i==row*column)break;
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        int [][]matrix= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer>res=spiralOrders(matrix);
        for (int i:res) System.out.println(i);
    }
}
