/*
 * @lc app=leetcode id=125 lang=javascript
 *
 * [125] Valid Palindrome
 */

// @lc code=start
/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function (s) {
  s = s.replace(/[^0-9a-z]/gi, '').toLowerCase();

  const length = s.length;

  if (!length) return true;

  for (let i = 0; i < length / 2; i++) {
    if (s[i] !== s[length - 1 - i]) {
      return false;
    }
  }

  return true;
};
// @lc code=end

console.log(isPalindrome('ab_a'));
// console.log(isPalindrome('A man, a plan, a canal: Panama'));
