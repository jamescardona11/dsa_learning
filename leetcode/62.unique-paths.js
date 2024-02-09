/*
 * @lc app=leetcode id=62 lang=javascript
 *
 * [62] Unique Paths
 */

// @lc code=start
/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
// 63/63 cases passed (66 ms)
// Your runtime beats 15.51 % of javascript submissions
// Your memory usage beats 5.19 % of javascript submissions (51 MB)
var uniquePaths = function (m, n) {
  return countPathsDS(m, n, 0, 0, {})
};

function countPathsDS(m, n, x, y, memo) {
  if (x == m || y == n) return 0
  if (x === m - 1 && y == n - 1) return 1

  const key = x + "," + y
  if (key in memo) {
    return memo[key]
  }

  const sum = countPathsDS(m, n, x, y + 1, memo) + countPathsDS(m, n, x + 1, y, memo);
  memo[key] = sum
  return sum;

}

// // @lc code=end
// let r = uniquePaths(3, 7)

// console.log(r)




