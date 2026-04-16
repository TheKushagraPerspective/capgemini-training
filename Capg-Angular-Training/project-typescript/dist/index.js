"use strict";
// Object.defineProperty(exports, "__esModule", { value: true });
console.log("This is sample text for testing purpose");
// type assertion
let username = "kushagra varshney";
// console.log(username.toUpperCase());   // directly we can't use this
console.log(username.toUpperCase()); // developer insisting that it is a string type so take it as a string
// another example of assertion
let a = "hello";
console.log(a.length);
// a = true;
a = true;
if (a) {
    console.log("this is boolean value");
}
else {
    console.log("this is not boolean value");
}
let head = document.getElementById("heading");
head.style.background = "yellow";
//# sourceMappingURL=index.js.map