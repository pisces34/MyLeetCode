package twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i< nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i< nums.length; i++){
            int aim = target-nums[i];
            if(map.containsKey(aim) && map.get(aim) != i){
                return new int[] {i, map.get(aim)};
            }
        }
        return null;
    }
}
