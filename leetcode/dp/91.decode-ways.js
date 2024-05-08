/*
 * @lc app=leetcode id=91 lang=javascript
 *
 * [91] Decode Ways
 */

// @lc code=start
/**
 * @param {string} s
 * @return {number}
 */
// 269/269 cases passed (42 ms)
// Your runtime beats 98.88 % of javascript submissions
// Your memory usage beats 82.58 % of javascript submissions (49.2 MB)
var numDecodings = function (s) {
  // console.log(s[0] === "1")

  return dfs(s, 0, new Map())

}

const dfs = (s, i, memo) => {
  if (i === s.length) return 1;
  if (s[i] === "0") return 0
  if (i in memo) return memo[i]


  let res = dfs(s, i + 1, memo)
  if (i + 1 < s.length && Number(s.substring(i, i + 2)) <= 26) {
    res += dfs(s, i + 2, memo)
  }

  memo[i] = res
  return res
}



// @lc code=end

const r = numDecodings("111111111111111111111111111111111111111111111")
console.log(r)