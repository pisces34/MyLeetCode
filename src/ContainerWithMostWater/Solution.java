package ContainerWithMostWater;

class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            area = Math.min(height[left], height[right])*(right-left);
            ans = Math.max(area, ans);
            if(height[left] >= height[right]) {
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}
