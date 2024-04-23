/*
 * @lc app=leetcode id=152 lang=javascript
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
// 190/190 cases passed (64 ms)
// Your runtime beats 28.69 % of javascript submissions
// Your memory usage beats 34.33 % of javascript submissions (50.6 MB)
var maxProduct = function (nums) {
  let res = Math.max(...nums)
  let min = 1
  let max = 1


  for (const n of nums) {
    if (n === 0) {
      min = 1
      max = 1
      continue
    }

    let temp = max * n
    max = Math.max(n * max, n * min, n)
    min = Math.min(temp, n * min, n)

    res = Math.max(res, max)
  }

  return res

};
// @lc code=end

// const r = maxProduct([2, 3, -2, 4])
const r = maxProduct([-2, 0, -1])
console.log(r)