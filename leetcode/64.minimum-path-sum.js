/*
 * @lc app=leetcode id=64 lang=javascript
 *
 * [64] Minimum Path Sum
 */

// @lc code=start
/**
 * @param {number[][]} grid
 * @return {number}
 */
// 62/62 cases passed (79 ms)
// Your runtime beats 19.66 % of javascript submissions
// Your memory usage beats 5.07 % of javascript submissions (58.5 MB)
var minPathSum = function (grid) {
  return minPathSumDS(grid, 0, 0, {})
};

function minPathSumDS(grid, x, y, memo) {
  if (x == grid.length || y == grid[0].length) return Number.POSITIVE_INFINITY
  if (x == grid.length - 1 && y == grid[0].length - 1) return grid[x][y]

  const key = x + "," + y
  if (key in memo) {
    return memo[key]
  }

  memo[key] = grid[x][y] + Math.min(
    minPathSumDS(grid, x, y + 1, memo),
    minPathSumDS(grid, x + 1, y, memo)
  )

  return memo[key]
}
// @lc code=end

let r = minPathSum([[1, 3, 1], [1, 5, 1], [4, 2, 1]])
console.log(r)