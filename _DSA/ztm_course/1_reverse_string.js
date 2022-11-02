function reverse(str) {
  if (!str || str.length < 2) return str;

  let arr = str.split('');
  let arr2 = [];
  for (let i = arr.length - 1; i >= 0; i--) {
    arr2.push(arr[i]);
  }
  return arr.join('');
}

function reverse1(str) {
  let arr = str.split('').reverse();
  console.log(arr);
}

console.log(reverse());
