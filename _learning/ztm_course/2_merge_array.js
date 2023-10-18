function mergeSortedArrays(arr1, arr2) {
  let result = [];

  let next = true;
  let index1 = 0;
  let index2 = 0;
  while (next) {
    if (arr1[index1] < arr2[index2] || index2 == arr2.length) {
      result[result.length] = arr1[index1];
      index1++;
    } else {
      result[result.length] = arr2[index2];
      index2++;
    }

    if (index1 == arr1.length && index2 == arr2.length) next = false;
  }

  console.log(result);
}

function mergeSortedArrays2(arr1, arr2) {
  let result = [];

  // check input
  if (arr1.length === 0) return arr2;
  if (arr2.length === 0) return arr1;

  let arr1Item = arr1[0];
  let arr2Item = arr2[0];
  let index1 = 1;
  let index2 = 1;

  while (arr1Item || arr2Item) {
    if (arr2Item === undefined || arr1Item < arr2Item) {
      result.push(arr1Item);
      arr1Item = arr1[index1];
      index1++;
    } else {
      result.push(arr2Item);
      arr2Item = arr2[index2];
      index2++;
    }
  }

  console.log(result);
}

let arr1 = [0, 3, 4, 31];
let arr2 = [4, 6, 30];

// mergeSortedArrays(arr1, arr2);
mergeSortedArrays2(arr1, arr2);
