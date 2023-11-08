//https://leetcode.com/problems/permutations/

var permute = function (nums) {
  let result = [];

  // base case
  // return a copy
  if (nums.length == 1) {
    return [nums.slice()]
  }


  for (let index = 0; index < nums.length; index++) {
    let n = nums.shift()
    let perms = permute(nums)


    for (let p of perms) {
      p.push(n)
      result.push(p)
    }

    // backtrack
    nums.push(n)

  }

  return result
};

const r = permute([1, 2, 3])
console.log(r)
