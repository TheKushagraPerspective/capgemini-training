export{};
// let a = 10;
// // a = "hello";
// console.log(a);


// let num = 100;
// num = "12";
// num = 23n;

// type inference
// let username = "kushagra varshney";
// let age = 22;
// let skill = null;
// let city = undefined;
// let userData = Symbol("Unique");
// let sal = 1000000n;
// let isQualified = true;

// console.log(username);
// console.log(age);
// console.log(skill);
// console.log(city);
// console.log(userData);
// console.log(sal);
// console.log(isQualified);


// console.log("next line.......")


// type annotation
// let username2:string = "prateek raj";
// let age2:number = 22;
// let skill2:null = null;
// let city2:undefined = undefined;
// let userData2:symbol = Symbol("Unique");
// let sal2:bigint = 1000000n;
// let isQualified2:boolean = false;

// console.log(username2);
// console.log(age2);
// console.log(skill2);
// console.log(city2);
// console.log(userData2);
// console.log(sal2);
// console.log(isQualified2);


// function demo(a:number , b:number) {
//     console.log("Demo...");
//     console.log(a + b);
// }
// demo(10 , 20);


// function stringConcatination(a:string , b:string , c?:string) {
//     console.log(a + b + c);
// }
// stringConcatination("a" , "b");


// function optionalParameter(a:number , b:number , c?:number) {
//     if(c != undefined) {
//         return a + b + c;
//     }
//     else {
//         return a + b + 10;
//     }
// }
// console.log(optionalParameter(10 , 20));


// // create a function which returns only number and which is having 3 argument lastone is optional and 2nd should have one default value
// function sum(num1:number , num2:number = 7 , num3?:number):number {
//        if(num3 != undefined) {
//         return num1 + num2 + num3;
//     }
//     else {
//         return num1 + num2;
//     }
// }
// console.log(sum(7 , 10));


// // create a function which returns and only boolean value which is having 3 parameters
// function isTrue(cond1:boolean , cond2:boolean , cond3:boolean):boolean {
//     return cond1 && cond2 && cond3;
// }
// console.log(isTrue(true , false , true));


// OBJECTS

// let DemoObj : {
//     name : string,
//     age : number,
//     city : string,
//     isMarried ?: boolean,
// } = {
//     name: "Kushagra Varshney",
//     age: 22,
//     city: "Budaun"
// }
// console.log(DemoObj);

// // DemoObj.gender = "male";   // with this structure, we can't add a new property in existing obj


// let DemoObj2 : {
//     name : string,
//     age : number,
//     city : string,
//     isMarried ?: boolean,
// };

// DemoObj2 = {
//     name: "Kushagra Varshney",
//     age: 22,
//     city: "Budaun"
// }
// console.log(DemoObj2);


// object is nothing but a type, mainly used with non-primitive type
// let Person:object;
// Person = {
//     userName : "Kushagra Varshney"
// }
// console.log(Person);

// Person = {
//     userName : "Kushagra Varshney",
//     age: 22
// }
// console.log(Person);

// SPECIAL DATATYPES
// 1. any :- we can assign any type of value in any variable, but there is a catch, any allow some methods to operate on them like toUpperCase(), and others of string/other, so if any variable is not having any string value and you are trying to do toUpperCase() then it will not throw flag at compile time, it will throw an error at runtime

// let anyVariable:any;
// anyVariable = "Kushagra Varshney";
// anyVariable = false;
// anyVariable = "Budaun";
// anyVariable = 22;
// console.log(anyVariable);
// console.log(anyVariable.toUpperCase());


// 2.unknown:- more secure than any, it will first check the type of value before applying the method, and if there is any mismatch in type then at compile time only it will throw an error/flag

// let unknownVariable:unknown;
// unknownVariable = "Kushagra Varshney";
// unknownVariable = false;
// unknownVariable = "Budaun";
// // unknownVariable = 22;
// console.log(unknownVariable);

// // console.log(unknownVariable.toUpperCase());
// // implement using narrowing
// if(typeof unknownVariable == "string") {
//     console.log(unknownVariable.toUpperCase());
// }
// else {
//     console.log("Not a valid type...");
// }





// // create a function with 3 parameters, console all the parameters and make sure that the function should not return anything
// function notReturning(num1:number , str1:string , bool1:boolean):void {
//     console.log(num1);
//     console.log(str1);
//     console.log(bool1);
//     // return "random value";
//     // when we use void as return type of function, then you will not be able to return anything from the function
//     // return undefined; 
//     // with void, we can only return undefined
// }

// console.log(notReturning(7 , "Kushagra Varshney" , true));



// function neverType(num1:number , str1:string , bool1:boolean):never {
//     console.log(num1);
//     console.log(str1);
//     console.log(bool1);

//     throw new Error("404: data not found...");
//     // can not return anything from this function as its return type is never (neither any value nor undefined)
// }

// neverType(7 , "Kushagra Varshney" , true);





// // Q1: create function that doesn't return anything apart from undefined
// function voidFunction(num1:number , str1:string , bool1?:boolean):void {
//     console.log(num1);
//     console.log(str1);

//     return undefined;
// }

// console.log(voidFunction(7 , "Kushagra Varshney"));



// Q2: create a function that never executes
// function neverType(num1:number , str1:string , bool1:boolean):never {
//     console.log(num1);
//     console.log(str1);
//     console.log(bool1);

//     throw new Error("404: data not found...");
//     // can not return anything from this function as its return type is never (neither any value nor undefined)
// }

// neverType(7 , "Kushagra Varshney" , true);



// // Q3: create object with 4 properties and 1 properties should have nested object
// let objInsideObj : {
//     username:string,
//     email:string,
//     addressdetails : {
//         city:string,
//         pincode:number
//     }
// };

// objInsideObj = {
//     username: "Kushagra Varshney",
//     email: "kushagra.varshney@example.com",
//     addressdetails : {
//         city: "budaun",
//         pincode: 243720
//     }
// }
// console.log(objInsideObj);





