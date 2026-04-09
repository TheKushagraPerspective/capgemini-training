// ================= VAR =================
var a;  // declaration possible and undefined
console.log(a);

a = 20;   // initialization possible and a = 20 now
console.log(a);

var b = 10; // declaration + initialization possible
console.log(b);

var c = 30;
var c; // redeclaration possible, value is the previous one
console.log(c);

c = 40; // reinitialization possible
console.log(c);

var c = 50; // redeclaration + reinitialization possible
console.log(c);



// ================= LET =================
// console.log(a1); // ❌ ReferenceError (Temporal Dead Zone)
// let a1;   // declaration possible but NOT hoisted like var

let a1;  // declaration possible and undefined (after declaration)
console.log(a1);

a1 = 20;   // initialization possible and a1 = 20 now
console.log(a1);

let b1 = 10; // declaration + initialization possible
console.log(b1);

let c1 = 30;
// let c1; ❌ redeclaration NOT possible
console.log(c1);

c1 = 40; // reinitialization possible
console.log(c1);

// let c1 = 50; ❌ redeclaration + reinitialization NOT possible



// ================= CONST =================
// const a2; ❌ declaration without initialization NOT possible

const a2 = 20;  // declaration + initialization mandatory
console.log(a2);

// a2 = 30; ❌ reinitialization NOT possible

const b2 = 10; // declaration + initialization possible
console.log(b2);

const c2 = 30;
// const c2; ❌ redeclaration NOT possible
console.log(c2);

// c2 = 40; ❌ reinitialization NOT possible

// const c2 = 50; ❌ redeclaration + reinitialization NOT possible


// SCOPE of var = global, and let = script/local , and const = script/local



// bare declaration
fullName = "Kushagra Varshney";
console.log(fullName);

