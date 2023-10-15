function minCostClimbingStairs(n){
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

const r = minCostClimbingStairs(5)
console.log(r)