/*
 * @lc app=leetcode id=724 lang=javascript
 *
 * [724] Find Pivot Index
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function (nums) {
  let output = [];
  if (!nums.length) return -1;

  output.push(nums[0]);
  for (var i = 1; i < nums.length; i++) {
    output.push(output[i - 1] + nums[i]);
  }

  if (output[nums.length - 1] - output[0] === 0) return 0;

  let index = -1;
  for (var i = 1; i < nums.length; i++) {
    if (output[i - 1] === output[nums.length - 1] - output[i]) {
      index = i;
      break;
    }
  }

  return index;
};
// @lc code=end

let a = pivotIndex([0]);
console.log(a);
