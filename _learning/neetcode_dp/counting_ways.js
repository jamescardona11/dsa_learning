function numDecodings(str){
  return numDecodingsDS(str, str.length, {})
}

function numDecodingsDS(str, k, memo){
  if(k == 0) return 1

  let s = str.length - k
  if(str[s] == '0') return 0
  if(k in memo){
    return memo[k]
  }

  let result = numDecodingsDS(str, k-1, memo)
  if(k >= 2 && parseInt(str.substring(s, s+2)) <= 26){
    result += numDecodingsDS(str, k-2, memo)
  }

  memo[k] = result
  return result
  

}

function numberToChar(n) {
  return String.fromCharCode(64 + number);
}

const r = numDecodings('226')
console.log(r)