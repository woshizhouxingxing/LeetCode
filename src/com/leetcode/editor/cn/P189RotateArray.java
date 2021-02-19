package com.leetcode.editor.cn;
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//
//
//
// 进阶：
//
//
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
// 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
//
//
//
//
// 示例 1:
//
//
//输入: nums = [1,2,3,4,5,6,7], k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
//
//
// 示例 2:
//
//
//输入：nums = [-1,-100,3,99], k = 2
//输出：[3,99,-1,-100]
//解释:
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100]
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 2 * 104
// -231 <= nums[i] <= 231 - 1
// 0 <= k <= 105
//
//
//
//
// Related Topics 数组
// 👍 878 👎 0

import java.util.Arrays;

//[189]旋转数组
public class P189RotateArray {
    public static void main(String[] args) {
        Solution solution = new P189RotateArray().new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 5);
        System.out.println(Arrays.toString(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //数组翻转解法
        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        private void reverse(int[] nums, int start, int end) {
            int temp;
            while (start < end) {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start += 1;
                end -= 1;
            }
        }


//        public void rotate(int[] nums, int k) {
//            //旋转次数根据数组长度先取模，去掉重复的旋转
//            k = k % nums.length;
//            //k与数组长度的一半进行比较，确定向右旋转还是向左旋转
//            if (k >= nums.length / 2) {
//                rightRotate(nums, k);
//            } else {
//                leftRotate(nums, nums.length - k);
//            }
//
//        }
//
//        private void rightRotate(int[] nums, int k) {
//            int temp;
//            for (int i = 0; i < k; i++) {
//                temp = nums[nums.length - 1];
//                for (int j = nums.length - 1; j > 0; j--) {
//                    nums[j] = nums[j - 1];
//                }
//                nums[0] = temp;
//            }
//        }
//
//        private void leftRotate(int[] nums, int k) {
//            int temp;
//            for (int i = 0; i < k; i++) {
//                temp = nums[0];
//                for (int j = 0; j < nums.length - 1; j++) {
//                    nums[j] = nums[j + 1];
//                }
//                nums[nums.length - 1] = temp;
//            }
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
