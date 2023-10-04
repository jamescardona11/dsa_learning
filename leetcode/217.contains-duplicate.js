/*
 * @lc app=leetcode id=217 lang=javascript
 *
 * [217] Contains Duplicate
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {boolean}
 */
// Your runtime beats 57.99 % of javascript submissions
// Your memory usage beats 72.2 % of javascript submissions (52.7 MB)
var containsDuplicate = function(nums) {
  const d = new Set()

  for(let i = 0; i < nums.length; i++ ){
    if(d.has(nums[i])){
      return true
    }
    d.add(nums[i])
  }

  return false
    
};
// @lc code=end


const r = containsDuplicate([1,2,3,4])
console.log(r)
