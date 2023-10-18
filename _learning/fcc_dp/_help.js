
 function printMemo(memo){
  let nodes = [];
  
  let arr = Array.from(memo.values())


  for(let i = 0; i< arr.length; i++) {
    nodes.push(`[${arr[i]}]`);
    
  }
  return nodes.join('->').toString();
}

