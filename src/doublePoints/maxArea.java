package doublePoints;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class maxArea {
    public static int maxArea(int[] height) {
    return MAXNUM(0,height.length-1,height);
    }

    public static int MAXNUM(int left, int right, int[] height) {
        int maxnum = min(height[left], height[right]) * (right - left);
        while (left<right)
        {
            maxnum=max(maxnum,min(height[left], height[right]) * (right - left));
            if (height[left]<height[right])left++;
            else right--;
        }
        return maxnum;
    }

    public static void main(String [] args){
        int[] height={1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println(result);
    }
}
