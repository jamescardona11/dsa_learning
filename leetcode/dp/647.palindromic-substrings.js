/*
 * @lc app=leetcode id=647 lang=javascript
 *
 * [647] Palindromic Substrings
 */

// @lc code=start
/**
 * @param {string} s
 * @return {number}
 */
// 132/132 cases passed (55 ms)
// Your runtime beats 97.56 % of javascript submissions
// Your memory usage beats 54.71 % of javascript submissions (50.4 MB)
var countSubstrings = function (s) {
  let count = 0
  for (let i = 0; i < s.length; i++) {
    // odd length
    let l = i, r = i
    while (l >= 0 && r < s.length && s[l] === s[r]) {

      count += 1
      l -= 1
      r += 1
    }

    // even length
    l = i, r = i + 1
    while (l >= 0 && r < s.length && s[l] === s[r]) {
      count += 1
      l -= 1
      r += 1
    }
  }

  return count
};
// @lc code=end

let r = countSubstrings("aaba")
console.log(r)