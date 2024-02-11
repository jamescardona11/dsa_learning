/*
 * @lc app=leetcode id=198 lang=javascript
 *
 * [198] House Robber
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
// 70/70 cases passed (59 ms)
// Your runtime beats 20.11 % of javascript submissions
// Your memory usage beats 53.75 % of javascript submissions (48.5 MB)
var rob = function (nums) {
  return robDS(nums, 0, {})
};

function robDS(nums, i, memo) {
  if (i >= nums.length) return 0
  if (i in memo) return memo[i]

  memo[i] = Math.max(nums[i] + robDS(nums, i + 2, memo), robDS(nums, i + 1, memo))

  return memo[i]

}
// @lc code=end

const r = rob([1, 2, 3, 1])
console.log(r)