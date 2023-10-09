

function sumPossible(arr, amount) {
  let memo = new Map()

  const r =  sum(arr, amount, memo)
  console.log(`Final memo ${printMemo(memo)}` )

  return r

}

function sum(arr, amount, memo) {
  if(amount == 0) return true
  if(amount < 0) return false
  if(memo.has(amount)){
    return memo.get(amount)
  }
  
  
  
  for(let i = 0; i< arr.length; i++)  {
    if(arr[i] > amount) {
      continue
    }
    
    if(sum(arr, amount - arr[i], memo)){
      memo.set(amount, true)
      return true
    }
    
  }
  memo.set(amount, false)
  return false
}

function printMemo(memo){
  let nodes = [];
  
  let arr = Array.from(memo.values())


  for(let i = 0; i< arr.length; i++) {
    nodes.push(`[(${i}) ${arr[i]}]`);
    
  }
  return nodes.join('->').toString();
}


const r = sumPossible([5,12,4], 8)
// const r = sumPossible([10, 8, 265, 24], 271)
console.log(r)