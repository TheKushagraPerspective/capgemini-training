// Q1: create a function type that accept two numbers and return a number
type calculation = (num1:number , num2:number) => number;

let sum:calculation = (a , b) => a + b;
let sub:calculation = (a , b) => a - b;
let mul:calculation = (a , b) => a * b;
let div:calculation = (a , b) => {
    if(b != 0) {
        return a / b;
    }
    else {
        return a;
    }
}

console.log(sum(7,7));
console.log(sub(7,7));
console.log(mul(7,7));
console.log(div(7,7));


// Q2: create a variable multiply using a function type and implement it using an arrow function
type multi = (num1:number , num2:number) => number;

let multiply:multi = (x , y) => x * y;
console.log(multiply(7 , 7));



// Q3: create a function type that accept a string and return void. store it in a variable called printMessage;
type voidReturn = (str:string) => void;

let printMessage:voidReturn = (str) => {
    console.log(str);
}
printMessage("Hello");
console.log(printMessage("Hello"));  // undefined



// Q4: create a function add with two overloaded signatures: 
// first will accept two number, second will accept two string

function add(num1:number , num2:number) : number;
function add(str1:string , str2:string) : string;

function add(a:any , b:any):any {
    return a + b;
}

console.log(add(7 , 7));
console.log(add("kushagra " , "varshney"));



// Q5: create a overloaded function and print: first accept string , second accept number and print these value

function printData(a:number): number;
function printData(a:string): string;

function printData(a : any) : any {
    console.log(a);
}
printData(7);
printData("kushagra");



// Q6: create a overloaded function getLength: first will accept string, second will accept array, return length

function getLength(a:string): string;
function getLength(a:number[]): number;

function getLength(a : any) : any {
    return a.length;
}

console.log(getLength("kushagra"));
console.log(getLength([1,2,3,4,5]));