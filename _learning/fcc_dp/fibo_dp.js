// Leetcode donde
function fibo(n) {
  let memo = new Map()
  let r = fibo_ds(n, memo)

  console.log(`Final memo ${printMemo(memo)}`)
  return r
}

function fibo_ds(n, memo) {
  // console.log(`n(${n}) = memo(${printMemo(memo)})` )
  if (n <= 1) return n
  if (memo.has(n)) {
    return memo.get(n)
  }

  let r = fibo_ds(n - 1, memo) + fibo_ds(n - 2, memo)
  memo.set(n, r)

  return r

}

function printMemo(memo) {
  let nodes = [];

  let arr = Array.from(memo.values())


  for (let i = 0; i < arr.length; i++) {
    nodes.push(`[${arr[i]}]`);

  }
  return nodes.join('->').toString();
}


let r = fibo(100)
console.log(r)