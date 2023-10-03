/*
 * @lc app=leetcode id=41 lang=javascript
 *
 * [41] First Missing Positive
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function (nums) {};
// @lc code=end

//# first solution
// 173/173 cases passed (167 ms)
// Your runtime beats 14.84 % of javascript submissions
// Your memory usage beats 8.19 % of javascript submissions (61.4 MB)

// second solution MAP => SET
// 173/173 cases passed (172 ms)
// Your runtime beats 12.35 % of javascript submissions
// Your memory usage beats 24.5 % of javascript submissions (55.9 MB)

var firstMissingPositiveFS = function (nums) {
  let map = new Set();
  for (let i = 0; i < nums.length; i++) {
    map.add(nums[i]);
  }

  for (let i = 1; i <= nums.length + 1; i++) {
    if (!map.has(i)) return i;
  }

  // return 1;
};

// third solution
//173/173 cases passed (126 ms)
//Your memory usage beats 77.29 % of javascript submissions (47 MB)
//Your runtime beats 57.13 % of javascript submissions

var firstMissingPositiveTS = function (nums) {
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] < 0) nums[i] = 0;
  }

  for (let i = 0; i < nums.length; i++) {
    let v = Math.abs(nums[i]);
    if (1 <= v <= nums.length)
      if (nums[v - 1] > 0) nums[v - 1] *= -1;
      else if (nums[v - 1] === 0) nums[v - 1] = -1 * (nums.length + 1);
  }

  for (let i = 1; i < nums.length + 1; i++) {
    if (nums[i - 1] >= 0) return i;
  }

  return nums.length + 1;
};

// let r = firstMissingPositive([7, 8, 9, 11, 12]);
let r = firstMissingPositive([3, -3, 6, 3, 2]);

console.log(r);
