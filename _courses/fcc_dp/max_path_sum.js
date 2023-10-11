function maxPathSum(grid){
  let memo = {}
  let r = maxPathSumDP(grid, 0, 0, 0, memo)

  console.log(memo)
  return r
}

function maxPathSumDP(grid, x, y, amount, memo) {
  if(x == grid.length || y == grid[0].length) return Number.NEGATIVE_INFINITY
  if(x === grid.length - 1 && y == grid[0].length - 1) return grid[x][y]

  const key = x + "," + y
  if(key in memo){
    return memo[key]
  }


  memo[key] = grid[x][y] + Math.max(
    maxPathSumDP(grid, x, y+1, amount, memo), 
    maxPathSumDP(grid, x+1, y, amount, memo)
    )
  return memo[key]
  
}


let r = maxPathSum([
  [1, 3, 12],
  [5, 1, 1],
  [3, 6, 1],

])

console.log(r)