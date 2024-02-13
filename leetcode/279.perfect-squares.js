/*
 * @lc app=leetcode id=279 lang=javascript
 *
 * [279] Perfect Squares
 */

// @lc code=start
/**
 * @param {number} n
 * @return {number}
 */
// 588/588 cases passed (179 ms)
// Your runtime beats 39.53 % of javascript submissions
// Your memory usage beats 20.76 % of javascript submissions (55.1 MB)
var numSquares = function (n) {
  return squares(n, {})
};

function squares(n, memo) {
  if (n == 0) return 0
  if (n in memo) return memo[n]

  let minSquares = Number.POSITIVE_INFINITY
  let i = 1
  while (i * i <= n) {
    const min = 1 + squares(n - i * i, memo)
    minSquares = Math.min(min, minSquares)

    i = i + 1
  }

  memo[n] = minSquares

  return memo[n]

}

// @lc code=end

const r = numSquares(12)
console.log(r)