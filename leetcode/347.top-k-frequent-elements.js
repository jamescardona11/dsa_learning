/*
 * @lc app=leetcode id=347 lang=javascript
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function (nums, k) {
  if (nums.length === k) return nums;

  let map = new Map();
  let result = [];

  for (let i = 0; i < nums.length; i++) {
    if (map.get(nums[i]) == -1) continue;
    if (map.get(nums[i]) + 1 >= k) {
      result.push(nums[i]);
      map.set(nums[i], -1);
    } else {
      map.set(nums[i], (map.get(nums[i]) || 0) + 1);
    }
  }

  // console.log(map);
  return result;
};
// @lc code=end

console.log(topKFrequent([1, 1, 1, 2, 2, 3], 2));
