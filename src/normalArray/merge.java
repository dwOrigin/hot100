package normalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class merge {
    public int[][] merge(int[][]intervals){
        List<int[]>res=new ArrayList<>();
        int left, right;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i=0;i<intervals.length;i++){
            left=intervals[i][0];
            right=intervals[i][1];
            if (res.size()==0||left>res.get(res.size()-1)[1]) res.add(new int[]{left,right});
            else res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],right);
        }
    return res.toArray(new int[res.size()][]);
    }


}
