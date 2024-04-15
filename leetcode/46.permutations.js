/*
 * @lc app=leetcode id=46 lang=javascript
 *
 * [46] Permutations
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number[][]}
 */

// 26/26 cases passed (76 ms)
// Your runtime beats 26.28 % of javascript submissions
// Your memory usage beats 68.66 % of javascript submissions (53.1 MB)
var permute = function (nums) {
  let result = [];

  // base case
  // return a copy
  if (nums.length == 1) {
    return [nums.slice()]
  }

  for (let index = 0; index < nums.length; index++) {
    let n = nums.shift() // first element
    let perms = permute(nums)

    for (let p of perms) {
      p.push(n)
      result.push(p)
    }

    nums.push(n)
  }

  return result
};
// @lc code=end

