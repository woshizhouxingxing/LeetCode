package com.leetcode.editor.cn;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
// 说明：
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
// 示例 1:
//
// 输入: [2,2,1]
//输出: 1
//
//
// 示例 2:
//
// 输入: [4,1,2,1,2]
//输出: 4
// Related Topics 位运算 哈希表
// 👍 1702 👎 0

//[136]只出现一次的数字
public class P136SingleNumber {
    public static void main(String[] args) {
        Solution solution = new P136SingleNumber().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 任何数和 0 做异或运算，结果仍然是原来的数，即 a ^ 0=a。
         * 任何数和其自身做异或运算，结果是 0，即 a ^ a=0。
         *
         * @param nums
         * @return
         */
        public int singleNumber(int[] nums) {
            int single = 0;
            for (int num : nums) {
                single ^= num;
            }
            return single;
        }

//        public int singleNumber(int[] nums) {
//            Arrays.sort(nums);
//            for (int i = 0; i < nums.length - 2; i += 2) {
//                if (nums[i] != nums[i + 1]) {
//                    return nums[i + 1] == nums[i + 2] ? nums[i] : nums[i + 1];
//                }
//            }
//            return nums[nums.length - 1];
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
