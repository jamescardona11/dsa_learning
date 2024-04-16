/*
 * @lc app=leetcode id=509 lang=javascript
 *
 * [509] Fibonacci Number
 */

// @lc code=start
/**
 * @param {number} n
 * @return {number}
 */

// 31/31 cases passed (52 ms)
// Your runtime beats 71.55 % of javascript submissions
// Your memory usage beats 66.79 % of javascript submissions (48.5 MB)
var fib = function (n) {
  let memo = new Map()
  let r = fibo_ds(n, memo)


  return r
};

function fibo_ds(n, memo) {
  if (n <= 1) return n
  if (memo.has(n)) {
    return memo.get(n)
  }

  let r = fibo_ds(n - 1, memo) + fibo_ds(n - 2, memo)
  memo.set(n, r)

  return r

}
// @lc code=end

