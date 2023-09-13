var array = [1, 2, 3, 4];

function sum(preSum, value) {
  // alert(`preSum: ${preSum}  - value: ${value}`);
  return preSum + value;
}

function product(preProd, value) {
  // alert(`preProd: ${preProd}  - value: ${value}`);
  return preProd * value;
}

var sumOfArrayElements = array.reduce(sum, 0);
var productOfArrayElements = array.reduce(product, 1);

console.log("Sum of", array, "is", sumOfArrayElements);
console.log("Product of", array, "is", productOfArrayElements);
