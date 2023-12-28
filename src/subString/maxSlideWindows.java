package subString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class maxSlideWindows {
    public static int[] maxSlideWindow(int[] nums, int k){
        PriorityQueue<int[]>pq=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]?o2[0]-o1[0]:o2[1]-o1[1];
            }
        });
        for (int i=0;i<k;i++){
            pq.offer(new int[]{nums[i],i});
        }//初始化
        int [] result= new int[nums.length-k+1];
        result[0]=pq.peek()[0];
        for (int i=k;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            while (pq.peek()[1]<=i-k)//这个地方比较的是位于队列顶部的数据的信息，如果说当前的队列顶部元素不是当前的窗口下的数据，然后就会被
                pq.poll();
            result[i-k+1]=pq.peek()[0];
        }
        return result;
    }


    public static void main(String[] args) {
        int []nums={9,10,9,-7,-4,-8,2,-6};
        int k = 5;
        int[] t= maxSlideWindow(nums,k);
        for (int i:t)
            System.out.println(i);
    }
}
