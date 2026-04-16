// Q1: create an interface person with: name(string) , age(number), then create one object using it.
interface Person {
    name:string;
    age:number;
}

let p1:Person = {
    name: "kushagra",
    age: 22,
}
console.log(p1);
console.log(typeof p1);


// Q2: create a variable status that only allows: "active" or "inactive", try assigning the wrong value and observe the error
type Status = "active" | "inactive";

function currentStatus(status: Status) {
    console.log(status);
}
currentStatus("active");
currentStatus("inactive");
// currentStatus("overactive");



// Q3: create an interface Car with: brand , model, then create 2 Car objects
interface Car {
    brand:string;
    model:string;
}

let bmw:Car = {
    brand: "BMW",
    model: "BMW b6"
}
console.log(bmw);

let mercedes:Car = {
    brand:"Mercedes",
    model: "maybach",
}
console.log(mercedes);



// Q4: create an interface User: name , role -> only "admin" or "user", create one object
type Role = "admin" | "user";

interface User {
    username: string;
    role: Role;
}

let user1:User = {
    username: "kushagra",
    role: "admin"
}
console.log(user1);



// Q5: create an interface Button: text type -> "primary" or "secondary"
type TextType = "primary" | "secondary";

interface Button {
    text: TextType
}

let btn1:Button = {
    text: "primary"
}
console.log(btn1);



// Q6: create an interface Order: id , status -> "pending" or "completed"
type OrderStatus = "pending" | "completed";

interface Order {
    id:number,
    status:OrderStatus
}

let order1:Order = {
    id: 101,
    status: "pending"
}
console.log(order1);