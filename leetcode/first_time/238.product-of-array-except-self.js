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
var productExceptSelf = function (nums) {
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

let r = productExceptSelf([-1, 1, 0, -3, 3]);
console.log(r);

// Accepted
// 22/22 cases passed (188 ms)
// Your runtime beats 49.13 % of javascript submissions
// Your memory usage beats 64.94 % of javascript submissions (54.1 MB)
