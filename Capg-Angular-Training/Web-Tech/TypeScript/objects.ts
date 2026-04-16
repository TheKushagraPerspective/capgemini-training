class DemoClass {
    username:string = "abc";
    age:number = 40;
};

let userData = new DemoClass();
console.log(userData);
console.log(userData.username);
console.log(userData.age);



class UserInput {
    username:string;
    age:number;

    constructor(username:string , age:number) {
        this.username = username;
        this.age = age;
    }

    getDetais() {
        return `Name: ${this.username} and Age: ${this.age}`;
    }
}

let userObj = new UserInput("kushagra" , 22);
console.log(userObj);
console.log(userObj.getDetais());

// homework:- access modifiers :- public(by default it is there) , private , protected