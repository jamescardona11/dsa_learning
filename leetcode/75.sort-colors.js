/*
 * @lc app=leetcode id=75 lang=javascript
 *
 * [75] Sort Colors
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function (nums) {
  let c0 = 0;
  let c2 = nums.length - 1;
  let i = 0;

  while (i <= c2) {
    if (nums[i] === 0) {
      swap(nums, i, c0);
      c0++;
      i++;
    } else if (nums[i] === 2) {
      swap(nums, i, c2);
      c2--;
    } else {
      i++;
    }
  }

  return nums;
};

var swap = function (nums, i, j) {
  let temp = nums[i];
  nums[i] = nums[j];
  nums[j] = temp;
};
// @lc code=end

var nums = [2, 0, 2, 1, 1, 0];
let r = sortColors(nums);
console.log(r);
