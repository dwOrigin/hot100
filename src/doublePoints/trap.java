package doublePoints;

public class trap {
    public static int trap(int[] height){
       int[]leftMax=new int[height.length];
       int[]rightMax= new int[height.length];
       leftMax[0]=height[0];
       for (int i=1;i<height.length;i++){
           leftMax[i]=Math.max(leftMax[i-1],height[i]);
       }
       rightMax[height.length-1]=height[height.length-1];
       for (int j=height.length-2;j>0;j--){
           rightMax[j]=Math.max(height[j],rightMax[j+1]);
       }
       int trap=0;
       for (int t=0;t<height.length-1;t++){
           trap+=Math.min(leftMax[t],rightMax[t])-height[t];
       }
       return trap;
    }

    public static void main(String[] args) {
        int[]height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
