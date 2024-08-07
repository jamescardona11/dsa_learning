/*
 * @lc app=leetcode id=416 lang=javascript
 *
 * [416] Partition Equal Subset Sum
 *
 * https://leetcode.com/problems/partition-equal-subset-sum/description/
 *
 * algorithms
 * Medium (46.22%)
 * Likes:    12083
 * Dislikes: 239
 * Total Accepted:    818.1K
 * Total Submissions: 1.8M
 * Testcase Example:  '[1,5,11,5]'
 *
 * Given an integer array nums, return true if you can partition the array into
 * two subsets such that the sum of the elements in both subsets is equal or
 * false otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,5,11,5]
 * Output: true
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,3,5]
 * Output: false
 * Explanation: The array cannot be partitioned into equal sum subsets.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canPartition = function (nums) {
  if (nums.length % 2 != 0) return false
  let dp = new Set()
  const half = array.reduce((sum, current) => sum + current, 0) / 2;

  canPartitionDS(nums, 0, {})


};

function canPartitionDS(nums, sum, half, memo) {
  if (nums.length === 0) return false
  if (sum === half) return

  if (i in memo) return memo[i]

  let lArray = array.filter((element, index) => index !== i);
  let rArray = array.filter((element, index) => index !== i + 1);

  let left = nums[i] + canPartitionDS(lArray, i + 1, half, memo)
  let right = nums[i + 1] canPartitionDS(nums, i + 1, half, memo)


}

// @lc code=end

