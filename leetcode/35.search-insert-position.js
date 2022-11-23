/*
 * @lc app=leetcode id=35 lang=javascript
 *
 * [35] Search Insert Position
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function (nums, target) {
  let left = 0;
  let right = nums.length - 1;

  while (left <= right) {
    let m = Math.floor((left + right) / 2);

    if (nums[m] === target) return m;
    else if (target > nums[m]) {
      left = m + 1;
    } else {
      right = m - 1;
    }
  }

  return left;
};
// @lc code=end

let r = searchInsert([3, 5, 7, 9, 10], 7);

var searchInsert2 = function (nums, target) {
  let left = 0;
  let right = nums.length - 1;

  while (left <= right) {
    let m = Math.floor((left + right) / 2);
    console.log(m);

    if (nums[m] === target) return m;
    else if (target > nums[m]) {
      left = m + 1;
    } else {
      right = m - 1;
    }
  }

  return left;
};

let r2 = searchInsert2([1, 2, 5, 6], 5);
console.log(r2);
