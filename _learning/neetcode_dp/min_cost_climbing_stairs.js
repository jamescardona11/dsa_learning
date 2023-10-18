function minCostClimbingStairs(cost){
  return minCostClimbingStairsDP(cost, -1, new Map())
}

function minCostClimbingStairsDP(cost, i, memo){
  if(i > cost.length-1) return 0
  if(memo.has(i)){
    return memo.get(i)
  }

  let one = cost[i+1] != null ? cost[i+1] + minCostClimbingStairsDP(cost, i+1, memo) : 0
  let two = cost[i+2] != null ? cost[i+2] + minCostClimbingStairsDP(cost, i+2, memo) : 0
  
  memo.set(i, Math.min(one, two))
  return memo.get(i)
}

/// neetcode reverse order
// add a position at end with 0 cost and execute reverse order

function minCostClimbingStairsReverse(cost){
  cost = [...cost, 0]
  for(let i = cost.length - 3; i >= 0; i--){
    cost[i] += Math.min(cost[i+1],cost[i+2])
  }

  return Math.min(cost[0], cost[1])
  
}



const r = minCostClimbingStairsReverse([1,100,1,1,1,100,1,1,100,1])
// const r = minCostClimbingStairsReverse([10,15,20])
console.log(r)