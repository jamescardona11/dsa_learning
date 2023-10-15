function minCostClimbingStairs(n){
  return minCostClimbingStairsDP(n, new Map())
}

function minCostClimbingStairsDP(n, memo){
  if(n < 0) return 0
  if(n == 0) return 1
  if(memo.has(n)){
    return memo.get(n)
  }

  memo.set(n,minCostClimbingStairsDP(n-1, memo) + minCostClimbingStairsDP(n-2, memo))
  return memo.get(n)
}

const r = minCostClimbingStairs(5)
console.log(r)