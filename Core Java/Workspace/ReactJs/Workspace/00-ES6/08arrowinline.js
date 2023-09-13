var array = [1, 2, 3, 4];

var sumOfArrayElements = array.reduce((preSum, value) => preSum + value, 0);
var productOfArrayElements = array.reduce(
  (preProd, value) => preProd * value,
  1
);

console.log("Sum of", array, "is", sumOfArrayElements);
console.log("Product of", array, "is", productOfArrayElements);
