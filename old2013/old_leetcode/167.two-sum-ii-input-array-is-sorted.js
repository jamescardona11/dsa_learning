/*
 * @lc app=leetcode id=167 lang=javascript
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (numbers, target) {
  let left = 0;
  let right = numbers.length - 1;

  while (left < right) {
    // if (numbers[right] > target) {
    //   right--;
    //   continue;
    // }

    if (numbers[left] + numbers[right] < target) {
      left++;
      continue;
    }

    if (numbers[left] + numbers[right] > target) {
      right--;
      continue;
    }

    return [left + 1, right + 1];
  }
};
// @lc code=end

let r = twoSum([2, 3, 5, 7, 10, 11, 15], 15);

console.log(r);
