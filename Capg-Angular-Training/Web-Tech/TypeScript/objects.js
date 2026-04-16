"use strict";
class DemoClass {
    username = "abc";
    age = 40;
}
;
let userData = new DemoClass();
console.log(userData);
console.log(userData.username);
console.log(userData.age);
class UserInput {
    username;
    age;
    constructor(username, age) {
        this.username = username;
        this.age = age;
    }
    getDetais() {
        return `Name: ${this.username} and Age: ${this.age}`;
    }
}
let userObj = new UserInput("kushagra", 22);
console.log(userObj);
console.log(userObj.getDetais());
