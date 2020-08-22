package twoSum;
import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 结果数组
        int[] res = new int[2];
        // 克隆传入数组
        int[] temp = nums.clone();
        // 对临时数组从小到大排序
        Arrays.sort(temp);
        // 初始化左右指针
        int i = 0, j = temp.length - 1;
        // 不重合
        while (i < j) {
            // 两数之和大于目标值, 将右边的指针左移
            if (temp[i] + temp[j] > target) {
                j--;
            } else if (temp[i] + temp[j] < target) {
                i++;
            } else {
                break;
            }
        }
        // n为数组总长度
        int n = temp.length;
        // 循环找出临时数组中在传入数组中的下标, 并赋值给结果数组
        // i<n, i=n, 保证找到一个后不再重复指向同一个,"移走"指针
        for (int k = 0; k < n; k++) {
            if (i < n && temp[i] == nums[k]) {
                res[0] = k;
                i = n;
            } else if (j < n && temp[j] == nums[k]) {
                res[1] = k;
                j = n;
            }
        }
        return res;
    }
}
