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
var isAnagram = function (s, t) {
  if (s.length != t.length) return false;
  let map = new Map();
  for (let i = 0; i < s.length; i++) {
    map.set(s[i], (map.get(s[i]) || 0) + 1);
    map.set(t[i], (map.get(t[i]) || 0) - 1);
  }

  // return map;
  return Array.from(map.values()).filter((e) => e != 0).length == 0;
};
// @lc code=end

// Your runtime beats 92.65 % of javascript submissions
// Your memory usage beats 86.24 % of javascript submissions (42.9 MB)

let isA = isAnagram('anagram', 'nagaram');

console.log(isA);
