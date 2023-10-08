function tribo(n){
  let memo = new Map()
  let r = tribo_ds(n, memo)

  console.log(`Final memo ${printMemo(memo)}` )
  return r
}

function tribo_ds(n, memo){
  if(n <= 1) return n
  if(n == 2) return 1
  if(memo.has(n)){
    return memo.get(n)
  }

  let r = tribo_ds(n-1, memo) + tribo_ds(n-2, memo) + tribo_ds(n-3, memo)
  memo.set(n, r)

  return r

}

function printMemo(memo){
  let nodes = [];
  
  let arr = Array.from(memo.values())


  for(let i = 0; i< arr.length; i++) {
    nodes.push(`[${arr[i]}]`);
    
  }
  return nodes.join('->').toString();
}


let r = tribo(100)
console.log(r)