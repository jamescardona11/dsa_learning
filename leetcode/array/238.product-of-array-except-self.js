/*
 * @lc app=leetcode id=238 lang=javascript
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number[]}
 */
// 22/22 cases passed (79 ms)
// Your runtime beats 87 % of javascript submissions
// Your memory usage beats 15.54 % of javascript submissions (56.2 MB)
var productExceptSelf = function(nums) {
  const res = [];

  let prefix = 1;
  for (let i = 0; i < nums.length; i++) {
    res.push(prefix);
    prefix *= nums[i];
  }

  let postfix = 1;
  for (let i = nums.length - 1; i >= 0; i--) {
    res[i] *= postfix;
    postfix *= nums[i];
  }

  return res;
    
};
// @lc code=end

let r = productExceptSelf([1, 2, 3, 4]);
// console.log(r);