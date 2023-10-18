function numDecodings(str){
  return numDecodingsDS(str, 0)
}

function numDecodingsDS(str, index){
  if(str.length == 0) return 1
  
  let i = index
  let left = str[i]
  while(left == '0'){
    left = str[++i]
  }
  
  let right = str[++i]
  while(right == '0'){
    right = str[++i]
  }

  if(i < str.length && parseInt(`${right}${str[++i]}`) <= 26 ){
    right += str[i]
  }
  
  
  // i++
  // while(i < str.length && str[i] == '0'){
  //   i++
  // }
  // let right = str[i] + str[i+1]
  
  console.log(left)
  console.log(right)

  // const count = numDecodingsDS(str, i+1) + numDecodingsDS(str, 1)
  

}

function numberToChar(n) {
  return String.fromCharCode(64 + number);
}

const r = numDecodings('226')
console.log(r)