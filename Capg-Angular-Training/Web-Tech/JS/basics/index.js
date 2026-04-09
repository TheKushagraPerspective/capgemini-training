// console.log("Hello, This is Kushagra Varshney");


// console.log(5 + "10"); // 6510
// console.log("10" - 5); // 10-5 = 5
// // so internally, javascript coversion is happing so + is considered as concatination thats why concatinate both and number will be converted into string, in case of -, it will convert string into number and then perform subtraction
// console.log("10" / 5); // 10/5 = 2
// console.log("10" * 5); // 10*5 = 50
// // so other than +, all the other operators will perform their operation only


// let a = 30;
// b = 30;
// console.log(a == b);
// console.log(a != b);
// console.log(a === b);
// console.log(a !== b);

// let a2 = 30;
// b2 = "30";
// console.log(a2 == b2);
// console.log(a2 != b2);
// console.log(a2 === b2);
// console.log(a2 !== b2);

// console.log(typeof null)


// console.log(0.1 + 0.2 == 0.3)
// console.log(0.1 + 0.2 === 0.3)
// console.log(0.5 + 0.2 == 0.7)
// console.log(0.5 + 0.2 === 0.7)

// console.log(0.3 + 0.2 == 0.5)

// let id1 = Symbol("abc");
// let id2 = Symbol("abc");

// console.log(typeof id1)
// console.log(id1 == id2)
// console.log(id1 === id2)

// console.log(typeof Number)
// console.log(typeof String)
// console.log(typeof Boolean)
// console.log(typeof Symbol)
// console.log(typeof undefined)

// console.log(true + 40)
// console.log(null + 40)
// console.log(undefined + 40)
// console.log(false + "")
// console.log(false + null)
// console.log(false + undefined)
// console.log(typeof NaN)
// console.log(10/0 - 3)


let marks = 75;

switch (true) {
    case (marks >= 90):
        console.log("O Grade");
        break;
    
    case (marks >= 80):
        console.log("A Grade");
        break;

    case (marks >= 70):
        console.log("B Grade");
        break;

    case (marks >= 60):
        console.log("C Grade");
        break;

    case (marks >= 50):
        console.log("D");
        break;

    default:
        console.log("Fail to Pass the Exam");
        break;
}



let age = 18;

if(age > 100) {
    console.log("Age Invalid OR Too Long");
}
else if(age >= 18) {
    console.log("Eligible to vote...")
}
else {
    console.log("Not Eligible to vote...")
}