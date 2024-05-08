import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

import array.Solution;

public class _Test {
  public static void main(String[] args) {
    Solution solution = new Solution();

    // System.out.println(isValid);
  }

}

class Solution {
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);

    return nums[nums.length / 2];
  }
}