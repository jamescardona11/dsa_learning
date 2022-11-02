const directory = [
  {"name": "maggie", "age": 14, "id": 0, "phone": "123456"},
  {"name": "joseph", "age": 24, "id": 1, "phone": "123236"},
  {"name": "margaret", "age": 11, "id": 2, "phone": "145456"},
  {"name": "elizabeth", "age": 61, "id": 3, "phone": "552456"},
  {"name": "julio", "age": 24, "id": 4, "phone": "1781816"},
  {"name": "kevin", "age": 64, "id": 5, "phone": "12919"},
  {"name": "martin", "age": 71, "id": 6, "phone": "12349191"},
  {"name": "aaron", "age": 30, "id": 7, "phone": "1290116"},
]

const registration = [
  {"name": "maggie", "age": 14, "id": 0, "email": "magie@notreal.com", "confirmed": true},
  {"name": "elizabeth", "age": 61, "id": 3, "email": "elizabeth@notreal.com", "confirmed": false},
  {"name": "martin", "age": 71, "id": 6, "email": "martin@notreal.com", "confirmed": false},
  {"name": "aaron", "age": 30, "id": 7, "email": "aaron@notreal.com", "confirmed": true},
]


const  mapArray = (array, key) => new Map(
	array.map(e => {
    return [e[key], e];
  }),
);

const join = (leftArray, rightArray, key) => {
  const leftItsLarge = leftArray.length > rightArray.length;
  const maxIndex = leftItsLarge ? leftArray.length : rightArray.length;
  
  const mapArr = leftItsLarge ?  mapArray(rightArray, key) : mapArray(leftArray, key);
  const tempArr = leftItsLarge ? leftArray : rightArray;
  
  
  const output = [];
  
  for(let i = 0; i < maxIndex; i++){
    let k = tempArr[i][key];
    if(mapArr.has(k)){
      output.push({ ...mapArr.get(k), ...tempArr[i] })
    }
  }
  console.log(output)
}

join(directory, registration, "name")