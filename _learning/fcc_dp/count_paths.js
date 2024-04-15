
// Leetcode donde (unique path)
const countPaths = (grid) => {

  return countPathsDS(grid, 0, 0, new Map())
}

// const countPathsR = (grid, x, y) => {
//   if(x >= grid.length || y >= grid.length) return 0
//   if(grid[x][y] === "X") return 0
//   if(x == y && x == grid.length-1) return 1

//   let left = countPathsR(grid, x, y+1)
//   let right = countPathsR(grid, x+1, y)

//   return left + right
// }

const countPathsDS = (grid, x, y, memo) => {
  if (x === grid.length || y === grid[0].length || grid[x][y] === "X") return 0
  if (x === grid.length - 1 && y == grid[0].length - 1) return 1

  const key = x + "," + y


  if (memo.has(key)) {
    return memo.get(key)
  }

  const sum = countPathsDS(grid, x, y + 1, memo) + countPathsDS(grid, x + 1, y, memo)
  memo.set(key, sum)
  return sum
}


let r = countPaths([
  ["O", "O", "X", "O", "O", "O"],
  ["O", "O", "O", "O", "O", "X"],
  ["X", "O", "O", "O", "O", "O"],
  ["X", "X", "X", "O", "O", "O"],
  ["O", "O", "O", "O", "O", "O"],
])

console.log(r)




