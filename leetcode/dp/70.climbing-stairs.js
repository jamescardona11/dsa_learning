/*
 * @lc app=leetcode id=70 lang=javascript
 *
 * [70] Climbing Stairs
 */

// @lc code=start
/**
 * @param {number} n
 * @return {number}
 */
// 45/45 cases passed (54 ms)
// Your runtime beats 41.99 % of javascript submissions
// Your memory usage beats 19.15 % of javascript submissions (48.5 MB)
var climbStairs = function (n) {
  return climbingStairsDP(n, new Map());
};

function climbingStairsDP(n, memo) {
  if (n < 0) return 0;
  if (n == 0) return 1;
  if (memo.has(n)) {
    return memo.get(n);
  }

  memo.set(n, climbingStairsDP(n - 1, memo) + climbingStairsDP(n - 2, memo));
  return memo.get(n);
}

// @lc code=end
