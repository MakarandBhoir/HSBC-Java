const greetingPoster = new Promise((resolve, reject) => {
  console.log("Inside Promise (proof of being eager)");
  let flag = false;
  if (flag) resolve("Welcome! Nice to meet you.");
  else reject("There is some error");
});

console.log("Before calling then on Promise");

greetingPoster
  .then((res) => console.log(`Greeting from promise: ${res}`))
  .catch((error) => console.log(error));
