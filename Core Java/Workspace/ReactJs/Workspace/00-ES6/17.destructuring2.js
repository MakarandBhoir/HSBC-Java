function printBasicInfo({ firstName, lastName, profession }) {
  console.log(firstName + " " + lastName + " - " + profession);
}

var person = {
  firstName: "Makarand",
  lastName: "Bhoir",
  age: 35,
  children: 1,
  profession: "Teacher",
};

printBasicInfo(person);
