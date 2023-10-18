function houseRobber(nums) {
  return houseRobberDP(nums, nums.length-1, {})
}

function houseRobberDP(nums, i, memo) {
  if(i == 0 || i == 1) return nums[i]

  if(i in memo){
    return memo[i]
  }

  let max =  Math.max(houseRobberDP(nums, i-1,memo), nums[i] + houseRobberDP(nums, i-2,memo))
  memo[i] = max
  return memo[i]
}

// neetcode 
function rob(nums){
  let rob1 = 0
  let rob2 = 0
  for (const n of nums) {
    let max = Math.max(n + rob1, rob2)
    rob1 = rob2
    rob2 = max
  }

  return rob2
}


let r = rob([1,2,3,1])
// let r = houseRobber([1,2,3,1])
console.log(r)