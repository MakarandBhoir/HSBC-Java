var array = ["red", "blue", "green"];
var copyOfArray = [...array, "black"];

console.log("Copy of", array, "is", copyOfArray);
console.log("Are", array, "and", copyOfArray, "same?", array === copyOfArray);
