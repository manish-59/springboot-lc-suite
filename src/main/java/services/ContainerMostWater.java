package services;

public class ContainerMostWater {

    //11

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int ans = 0;
        while(l < r){
            int h = Math.min(height[l], height[r]);
            ans = Math.max(ans, h * (r-l));
            while(l<r && height[l]<=h){
                l++;
            }
            while(l<r && height[r]<=h){
                r--;
            }
        }
        return ans;
    }
}
