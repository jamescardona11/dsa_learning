/*
 * @lc app=leetcode id=5 lang=javascript
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
/**
 * @param {string} s
 * @return {string}
 */
// 142/142 cases passed (93 ms)
// Your runtime beats 47.77 % of javascript submissions
// Your memory usage beats 58.17 % of javascript submissions (52.6 MB)

var longestPalindrome = function (s) {
  let res = ""
  let resLen = 0



  for (let i = 0; i < s.length; i++) {
    // odd length
    let l = i, r = i
    while (l >= 0 && r < s.length && s[l] === s[r]) {
      if (r - l + 1 > resLen) {
        res = s.substring(l, r + 1)
        resLen = res.length
      }
      l -= 1
      r += 1
    }

    // even length
    l = i, r = i + 1
    while (l >= 0 && r < s.length && s[l] === s[r]) {
      if (r - l + 1 > resLen) {
        res = s.substring(l, r + 1)
        resLen = res.length
      }
      l -= 1
      r += 1
    }
  }

  return res

};
// @lc code=end

let r = longestPalindrome("cbbd")
console.log(r)