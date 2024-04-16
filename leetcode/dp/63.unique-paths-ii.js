/*
 * @lc app=leetcode id=63 lang=javascript
 *
 * [63] Unique Paths II
 */

// @lc code=start
/**
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
// 41/41 cases passed (52 ms)
// Your runtime beats 79.9 % of javascript submissions
// Your memory usage beats 11.21 % of javascript submissions (50.1 MB)
var uniquePathsWithObstacles = function (obstacleGrid) {
  return countPathsDS(obstacleGrid, 0, 0, new Map());
};

const countPathsDS = (grid, x, y, memo) => {
  if (x === grid.length || y === grid[0].length || grid[x][y] === 1) return 0;
  if (x === grid.length - 1 && y == grid[0].length - 1) return 1;

  const key = x + "," + y;

  if (memo.has(key)) {
    return memo.get(key);
  }

  const sum =
    countPathsDS(grid, x, y + 1, memo) + countPathsDS(grid, x + 1, y, memo);
  memo.set(key, sum);
  return sum;
};
// @lc code=end
