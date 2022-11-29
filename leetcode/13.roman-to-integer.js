/*
 * @lc app=leetcode id=13 lang=javascript
 *
 * [13] Roman to Integer
 */

// @lc code=start
/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  let roman = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };
  let total = 0;
  let index = 0;
  while (index < s.length) {
    let left = roman[s[index]];
    let right = roman[s[index + 1]];
    if (left < right) {
      index += 2;
      total += right - left;
    } else {
      total += left;
      index++;
    }
  }

  return total;
};
// @lc code=end

// Accepted
// 3999/3999 cases passed (221 ms)
// Your runtime beats 94.18 % of javascript submissions
// Your memory usage beats 87.45 % of javascript submissions (46.6 MB)

let r1 = romanToInt('MCMXCIV');
console.log(r1);
