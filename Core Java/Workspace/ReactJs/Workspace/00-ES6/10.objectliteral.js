const color = "red";
const point = {
  x: 5,
  y: 10,
  //color: color,
  color,
  ["prop_" + 42]: 42,
  toString() {
    return "X=" + this.x + ", Y=" + this.y + ", color=" + this.color;
  },
};

console.log("The point is " + point);
console.log("The dynamic property is " + point.prop_42);
