var array = [1, 2, 3, 4];

const sum = (preSum, value) => preSum + value;
const product = (preProd, value) => preProd * value;

var sumOfArrayElements = array.reduce(sum, 0);
var productOfArrayElements = array.reduce(product, 1);

console.log("Sum of", array, "is", sumOfArrayElements);
console.log("Product of", array, "is", productOfArrayElements);
