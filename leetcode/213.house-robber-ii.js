/*
 * @lc app=leetcode id=213 lang=javascript
 *
 * [213] House Robber II
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */

// 75/75 cases passed (37 ms)
// Your runtime beats 99.55 % of javascript submissions
// Your memory usage beats 43.84 % of javascript submissions (47.9 MB)
function rob(nums) {
  return Math.max(nums[0], robHelper(nums.slice(1)), robHelper(nums.slice(0, nums.length - 1)))
}

function robHelper(nums) {
  let rob1 = 0
  let rob2 = 0
  for (let i = 0; i < nums.length; i++) {
    let max = Math.max(nums[i] + rob1, rob2)
    rob1 = rob2
    rob2 = max
  }

  return rob2
}



// @lc code=end

const r = rob([1, 2, 1, 1]
)
console.log(r)