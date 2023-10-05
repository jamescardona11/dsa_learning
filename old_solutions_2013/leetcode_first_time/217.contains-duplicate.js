/*
 * @lc app=leetcode id=217 lang=javascript
 *
 * [217] Contains Duplicate
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  const hashSet = new Set();
  for (var n in nums) {
    if (hashSet.has(nums[n])) {
      return true;
    } else {
      hashSet.add(nums[n]);
    }
  }

  return false;
};
// @lc code=end

// first solution
var containsDuplicate2 = function (nums) {
  nums.sort();
  for (var i = 1; i < nums.length; i++) {
    if (nums[i - 1] === nums[i]) {
      return true;
    }
  }

  return false;
};

console.log(containsDuplicate([1, 2, 3, 1]));
console.log(containsDuplicate([1, 2, 3, 4]));
console.log(containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]));
