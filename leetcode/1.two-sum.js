/*
 * @lc app=leetcode id=1 lang=javascript
 *
 * [1] Two Sum
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  if(nums.length === 2) return [0,1]

  let output = new Map();
  for(let i = 0; i < nums.length; i++) {
    if(output.has(target-nums[i])){
      return [output.get(target-nums[i]),i]
    }
    
    output.set(nums[i], i)
  }
  

  return [-1, -1]
};
// @lc code=end

const r = twoSum([2,7,11,15], 9)
console.log(`Result ${r}`)