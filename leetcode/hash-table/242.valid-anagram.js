/*
 * @lc app=leetcode id=242 lang=javascript
 *
 * [242] Valid Anagram
 */

// @lc code=start
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
// Your runtime beats 82.89 % of javascript submissions
// Your memory usage beats 93.38 % of javascript submissions (42.2 MB)
var isAnagram = function(s, t) {
  if(s.length != t.length) return false;

  let letters = new Map()
  for(let i = 0; i < s.length; i++){
    letters.set(s[i] , (letters.get(s[i]) ?? 0) + 1)
    letters.set(t[i] , (letters.get(t[i]) ?? 0) - 1)
  }
  
  const values = Array.from(letters.values());
  return !values.some((e, i, a) => e != 0)
};
// @lc code=end

const r = isAnagram("anagram", "nagaram")
console.log(r)
