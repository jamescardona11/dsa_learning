function summingSquares(n){
  return summingSquaresDS(n,  {})
}

function summingSquaresDS(n, memo){
  if(n == 0 ) return 0
  if(n in memo){
    return memo[n]
  }

  let minSquares = Number.POSITIVE_INFINITY
  let i = 1
  while (i * i <= n){
    let min = 1 + summingSquaresDS(n - i*i,  memo)
    if(min < minSquares){
      minSquares = min
    }

    i = i + 1
  }
  
  memo[n] = minSquares
  return memo[n]
}

const r = summingSquares(50)
console.log(r)
