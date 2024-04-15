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
  if (nums.length <= 1) return nums;

  const buckets = Array.from({ length: nums.length + 1 }, () => []);
  const map = new Map();

  for (let i = 0; i < nums.length; i++) {
    map.set(nums[i], (map.get(nums[i]) || 0) + 1);
  }

  for (let entry of map) {
    buckets[entry[1]].push(entry[0]);
  }

  let result = [];

  for (let i = buckets.length; i >= 0; --i) {
    if (buckets[i]) result.push(...buckets[i]);
    if (result.length == k) break;
  }

  return result;
};

// @lc code=end

// Accepted
// 21/21 cases passed (130 ms)
// Your runtime beats 51.81 % of javascript submissions
// Your memory usage beats 43.26 % of javascript submissions (46.1 MB)

let r = topKFrequent([-1, -1], 1);
console.log(bucket);

// https://leetcode.com/problems/top-k-frequent-elements/discuss/607122/JavaScript-simple-solution-94-64
