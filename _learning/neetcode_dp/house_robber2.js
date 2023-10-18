function rob(nums){
  let r1until = nums.length - 1
  let rob1 = 0
  let rob2 = 0
  for (let i = 0; i < nums.length; i++) {
    let r1 = i == r1until ? 0 : nums[i] + rob1
    let max = Math.max(r1, rob2)
    rob1 = rob2
    rob2 = max
  }

  return rob2
}


// neetcode solution
function rob2(nums){
  return Math.max(nums[0],robHelper(nums.slice(1)), robHelper(nums.slice(0, nums.length-1)))
}

function robHelper(nums){
  let rob1 = 0
  let rob2 = 0
  for (let i = 0; i < nums.length; i++) {
    let max = Math.max(nums[i] + rob1, rob2)
    rob1 = rob2
    rob2 = max
  }

  return rob2
}


let r = rob2([2,3,2])
// let r = houseRobber([1,2,3,1])
console.log(r)