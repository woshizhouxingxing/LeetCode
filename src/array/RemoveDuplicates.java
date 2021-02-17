package array;

/**
 * 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * @author xiongbiao
 * @date 2021/2/17 19:39
 */
public class RemoveDuplicates {
  public static int removeDuplicates(int[] nums) {
    //如果数组长度为0直接返回
    if (nums.length == 0) {
      return 0;
    }
    //数组长度不为0，计数为1，#记录数值为nums[count-1]=nums[0],这个不用写
    int count = 1;
    //从下标1开始循环
    for (int j = 1; j < nums.length; j++) {
      //如果循环当前数值不等于之前记录的值
      if (nums[count - 1] != nums[j]) {
        //记录数值，下标为count，然后计数加1
        nums[count] = nums[j];
        count = count + 1;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[] {1, 2, 2, 3}));
  }
}
