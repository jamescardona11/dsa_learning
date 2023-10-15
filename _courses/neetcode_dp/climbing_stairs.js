function climbingStairs(n){
  return climbingStairsDP(n, new Map())
}

function climbingStairsDP(n, memo){
  if(n < 0) return 0
  if(n == 0) return 1
  if(memo.has(n)){
    return memo.get(n)
  }

  memo.set(n,climbingStairsDP(n-1, memo) + climbingStairsDP(n-2, memo))
  return memo.get(n)
}

/// neetcode solution
// reverse order counting

function climbingStairsCounting(n){
  let one = 1, two = 1
  for(let i=0; i<n-1; i++){
    let temp = one
    one = one + two
    two = temp
  }

  return one
}

const r = climbingStairs(5)
const r2 = climbingStairsCounting(5)
console.log(r)
console.log(r2)