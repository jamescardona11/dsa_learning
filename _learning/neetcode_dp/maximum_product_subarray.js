function maximumProduct(arr){
  let gMax = 1
  let gMin = 1
  let max = 1
  let min = 1
  
  for (let i = 0; i < arr.length; i++) {
    if(arr[i] < 0){
      gMax = Math.max(gMax, max)
      max = 1
    }

    if(arr[i] == 0){
      gMin = Math.max(gMin, min)
      min = 1
      continue;
    }
    
    max = Math.max(max, max * arr[i])
    min *= arr[i] 
  }

  return Math.max(gMax, gMin, max, min)
}


const r = maximumProduct([2,3,0,-2,-4])
console.log(r)