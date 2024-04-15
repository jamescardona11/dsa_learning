/*
 * @lc app=leetcode id=39 lang=javascript
 *
 * [39] Combination Sum
 */

// @lc code=start
/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */

// 160/160 cases passed (83 ms)
// Your runtime beats 30.27 % of javascript submissions
// Your memory usage beats 69.87 % of javascript submissions (54.2 MB)

var combinationSum = function (candidates, target) {
  let result = []

  function dfs(index, arr, total) {
    if (total === target) {

      // copy and add to result
      result.push([...arr])
    }

    for (let i = index; i < candidates.length; i++) {

      if (total + candidates[i] <= target) {

        arr.push(candidates[i])
        dfs(i, arr, total + candidates[i])
        arr.pop()
      }

    }
  }
  dfs(0, [], 0)

  return result
};
// @lc code=end

