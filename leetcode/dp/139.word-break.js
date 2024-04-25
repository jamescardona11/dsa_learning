/*
 * @lc app=leetcode id=139 lang=javascript
 *
 * [139] Word Break
 */

// @lc code=start
/**
 * @param {string} s
 * @param {string[]} wordDict
 * @return {boolean}
 */
// 46/46 cases passed (62 ms)
// Your runtime beats 44.59 % of javascript submissions
// Your memory usage beats 72.21 % of javascript submissions (50.9 MB)
var wordBreak = function (s, wordDict) {
  const wordSet = new Set(wordDict);
  const memo = new Map();

  return wordBreakDS(s, wordSet, 0, memo)

};

function wordBreakDS(s, wordSet, i, memo) {
  if (i === s.length) return true;
  if (memo.has(i)) return memo.get(i);

  for (let end = i + 1; end <= s.length; end++) {
    const word = s.substring(i, end);
    if (wordSet.has(word) && wordBreakDS(s, wordSet, end, memo)) {
      memo.set(i, true);
      return true;
    }
  }

  memo.set(i, false);
  return false;
};
// @lc code=end


const r = wordBreak("leetcode", ["leet", "code"])
console.log(r)