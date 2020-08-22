package ContainerWithMostWater;

class Violence {
    public int maxArea(int[] height) {
        int max = -1;
        int area = 0;
        int left = 0;
        int right = 0;
        int wide = height.length;
        int blow = wide -1;
        for(left=0; left < wide; left++) {
            blow = wide- 1 - left;
            for(right = wide -1; right> left ; right --) {
                if(height[left] <= height[right]) {
                    area = height[left]*blow;
                    blow --;
                }else{
                    area = height[right]*blow;
                    blow --;
                }
                if(area >= max) {
                    max = area;
                }
            }
        }
        return max;
    }
}