function printFirstAndSecondElement([first, second]) {
  console.log("First element is " + first + ", second is " + second);
}

function printSecondAndFourthElement([, second, , fourth]) {
  console.log("Second element is " + second + ", fourth is " + fourth);
}

var array = [1, 2, 3, 4, 5];

printFirstAndSecondElement(array);
printSecondAndFourthElement(array);
