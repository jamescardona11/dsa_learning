// https://levelup.gitconnected.com/big-o-notation-merge-sort-in-unity-9dda253c6b13#:~:text=In%20terms%20of%20Big%20O,search%20O%20(log%20n).&text=Let's%20take%20the%20following%20int,%2C%205%2C%2045%2C%2025%7D%3B
// COST
// Steps: SPLIT [1, 172, 91, 2, 45, 3, 10, 19, -12, 38]
// [1, 172, 91, 2, ] [45, 3, 10, 19, -12, 38]  SLICE => O(K) K is end - start
// Overall SPLIT O(log n) , en practica nuestro split es O(K log n)
// Lo máximo que se puede dividir el array es log n
//
// Step: MERGE
// n number of merge operations
// O(N)
//
// Worst Case Time Complexity [ Big-O ]: O(n*log n)
// Best Case Time Complexity [Big-omega]: O(n*log n)
// Average Time Complexity [Big-theta]: O(n*log n)
// Space Complexity: O(n)



function mergeSort(array) {
  // console.log("array",array)
  if(array.length <= 1) return array

  const mid = array.length / 2

  let left = mergeSort(array.slice(0, mid))
  let right = mergeSort(array.slice(mid, array.length))


  let i = 0
  let j = 0
  let result = []
  while (i < left.length || j < right.length){
    if(right[j] && left[i] > right[j]){
      result.push(right[j])
      j++
    } else if(left[i] && left[i] < right[j]) {
      result.push(left[i])
      i++
    }else if(left[i]) {
      result.push(left[i])
      i++
    }else  {
      result.push(right[j])
      j++
    }
  }

  return result

}


let numbers = [1, 172, 91, 2, 45, 3, 10, 19, -12, 38]
// let numbers = [172, 2, 3]

let r = mergeSort(numbers)
console.log(r)