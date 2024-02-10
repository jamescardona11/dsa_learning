/*
 * @lc app=leetcode id=746 lang=javascript
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
/**
 * @param {number[]} cost
 * @return {number}
 */
// 284/284 cases passed (60 ms)
// Your runtime beats 44.54 % of javascript submissions
// Your memory usage beats 21.15 % of javascript submissions (50.4 MB)
var minCostClimbingStairs = function (cost) {
  return minCostClimbingStairsDP(cost, -1, new Map())
}

function minCostClimbingStairsDP(cost, i, memo) {
  if (i > cost.length - 1) return 0
  if (memo.has(i)) {
    return memo.get(i)
  }

  let one = cost[i + 1] != null ? cost[i + 1] + minCostClimbingStairsDP(cost, i + 1, memo) : 0
  let two = cost[i + 2] != null ? cost[i + 2] + minCostClimbingStairsDP(cost, i + 2, memo) : 0

  memo.set(i, Math.min(one, two))
  return memo.get(i)
}
// @lc code=end

const r = minCostClimbingStairs([10, 15, 20])
console.log(r)