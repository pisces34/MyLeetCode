package twoSum;

import twoSum.Solution;

/**
 * @author pisces
 */
public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,5,5,11};
        int[] res = new int[2];
        res = s.twoSum(nums, 10);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
