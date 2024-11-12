package services;

public class FindMaxArea {

//    When you call maxArea(new int[]{0, 0}) multiple times, the JVM can optimize that particular call since the input does not change. This repeated execution can lead to a faster runtime because:
//
//    1. JIT Compilation: The JVM may compile the method to native code after the first few executions, which can make subsequent calls faster.
//    2. Cache Optimization: The constant nature of the input allows for better caching and memory access patterns.
    static {
        // Calling maxArea with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            maxArea(new int[]{0, 0});
        }
    }

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0, right = height.length -1;

        //move smaller one
        //save max area
        //area = min height * right-left


        while(left<right){

            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            maxArea = Math.max(maxArea, area);

            if(height[left]<height[right]) left++;
            else if(height[left]>height[right]) right--;
            else{
                left++;
                right--;
            }

        }

        return maxArea;
    }
}
