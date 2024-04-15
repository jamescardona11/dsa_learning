// Leetcode donde (house robber)
function nonAdjacentSum(nums) {
  return nonAdjacentSumDS(nums, 0, {})
}

function nonAdjacentSumDS(nums, i, memo) {
  if (i >= nums.length) return 0
  if (i in memo) {
    return memo[i]
  }


  memo[i] = Math.max(nums[i] + nonAdjacentSumDS(nums, i + 2, memo), nonAdjacentSumDS(nums, i + 1, memo))
  return memo[i]


}

const nums = [2, 4, 5, 12, 7];
const r = nonAdjacentSum(nums)
console.log(r)
