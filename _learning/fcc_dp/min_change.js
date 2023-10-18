

function minChange(arr, amount) {
  let memo = new Map()

  const r =  sum(arr, amount, memo)
  console.log(`Final memo ${printMemo(memo)}` )
  

  return r

}

function sum(arr, amount, memo) {
  if(amount == 0) return 0
  if(amount < 0) return -1
  if(memo.has(amount)){
    return memo.get(amount)
  }
  
  
  let minCoins = -1
  for(let i = 0; i< arr.length; i++)  {
    let subCoins = sum(arr, amount - arr[i], memo)
    
    if(subCoins != -1){
      let numCoins = subCoins + 1
      if(numCoins < minCoins || minCoins == -1){
        minCoins = numCoins
      }
    }
    
  }
  memo.set(amount, minCoins)
  return minCoins
}

function printMemo(memo){
  let nodes = [];
  
  let arr = Array.from(memo.values())


  for(let i = 0; i< arr.length; i++) {
    nodes.push(`[(${i}) ${arr[i]}]`);
    
  }
  return nodes.join('->').toString();
}


const r = minChange([1, 5, 4, 12], 8)
// const r = minChange([10, 8, 265, 24], 271)
console.log(r)