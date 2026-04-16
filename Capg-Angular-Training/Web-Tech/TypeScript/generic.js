// // normal function
// function Demo(a:string):string {
//     return "Sample Output";
// }
// console.log(Demo("Hello"));
// // generic function
// function user<T>(a: T): T {
//     return a;
// }
// let userData = user<string>("Hello");
// let userData2 = user<number>(7);
// let userData3 = user<boolean>(true);
// let userData4 = user<null>(null);
// console.log(userData);
// console.log(userData2);
// console.log(userData3);
// console.log(userData4);
// // multiple generic type
// function Person<T , L>(name: T , age: L) : [T , L] {
//     return [name , age];
// }
// let p1 = Person<string , number>("kushagra" , 22);
// console.log(p1);
// p1.forEach((ele) => {
//     console.log(ele);
// })
// // generics with interface
// interface User<T> {
//     username:T,
//     age:number,
//     gender:string
// }
// let user1:User<string> = {
//     username: "kushagra",
//     age: 22,
//     gender: "male"
// }
// console.log(user1);
// let user2:User<number> = {
//     username: 101,
//     age: 22,
//     gender: "male"
// }
// console.log(user2);
// // inheritance
// interface info1<T> {
//     username: T
// }
// interface info2<T , L> extends info1<T> {
//     age: L
// }
// let newUser:info2<string , number> = {
//     username: "kushagra",
//     age: 22
// }
// console.log(newUser);
// // generics with class
// class Laptop<T> {
//     model: T;
//     constructor(model: T) {
//         this.model = model;
//     }
// }
// let lapModel = new Laptop<string>("xyz");
// console.log(lapModel);
// typw assertion
let abs = "hello";
console.log(abs.length);
let num = 30;
console.log(typeof num);
export {};
