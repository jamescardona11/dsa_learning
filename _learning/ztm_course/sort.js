function bucketSort(arr) {
  if (arr.length <= 1) return arr;
  const k = arr.length;

  let min = Number.MAX_VALUE;
  let max = Number.MIN_VALUE;

  arr.forEach((element) => {
    if (element < min) min = element;
    if (element > max) max = element;
  });

  let bucketSize = Math.ceil((max - min) / k);

  const buckets = Array.from({ length: bucketSize }, () => []);

  arr.forEach((element) => {
    let index = Math.floor((element - min) / k);
    index = index == bucketSize ? index - 1 : index;
    buckets[index].push(element);
  });

  let result = [];
  for (let i = 0; i < bucketSize; i++) {
    buckets[i].sort((a, b) => a - b);
    result.push(...buckets[i]);
  }
  return result;
}

let bucket = bucketSort([3, 5, 1, 10, 8, 2, 4]);
console.log(bucket);

function quickSort(arr) {
  if (arr.length <= 1) return arr;

  partition(arr, 0, arr.length - 1);
}

function partition(arr, low, high) {
  let pivot = arr[high];
  let i = low - 1;

  for (let j = low; j <= high; j++) {
    if (arr[j] < pivot) {
      swap(arr, pivot, index);
      i += 1;
    }
  }
}

const swap = (arr, left, right) =>
  ([arr[left], arr[right]] = [arr[right], arr[left]]);
