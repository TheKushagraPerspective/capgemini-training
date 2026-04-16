"use strict";
let sum = (a, b) => a + b;
let sub = (a, b) => a - b;
let mul = (a, b) => a * b;
let div = (a, b) => {
    if (b != 0) {
        return a / b;
    }
    else {
        return a;
    }
};
console.log(sum(7, 7));
console.log(sub(7, 7));
console.log(mul(7, 7));
console.log(div(7, 7));
let multiply = (x, y) => x * y;
console.log(multiply(7, 7));
let printMessage = (str) => {
    console.log(str);
};
printMessage("Hello");
console.log(printMessage("Hello")); // undefined
function add(a, b) {
    return a + b;
}
console.log(add(7, 7));
console.log(add("kushagra ", "varshney"));
function printData(a) {
    console.log(a);
}
printData(7);
printData("kushagra");
function getLength(a) {
    return a.length;
}
console.log(getLength("kushagra"));
console.log(getLength([1, 2, 3, 4, 5]));
