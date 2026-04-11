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


// let marks = 75;

// switch (true) {
//     case (marks >= 90):
//         console.log("O Grade");
//         break;
    
//     case (marks >= 80):
//         console.log("A Grade");
//         break;

//     case (marks >= 70):
//         console.log("B Grade");
//         break;

//     case (marks >= 60):
//         console.log("C Grade");
//         break;

//     case (marks >= 50):
//         console.log("D");
//         break;

//     default:
//         console.log("Fail to Pass the Exam");
//         break;
// }



// let age = 18;

// if(age > 100) {
//     console.log("Age Invalid OR Too Long");
// }
// else if(age >= 18) {
//     console.log("Eligible to vote...")
// }
// else {
//     console.log("Not Eligible to vote...")
// }




// // named function :- A function that has a name.
// function demo(a , b , ...c) {
//     console.log(a + b , c[0])
//     return "demo return";
// }

// demo(10 , 20 , 30 , 40 , 50)


// // anonymous function :- A function without a name
// let x = function() {
//     console.log("This is anonymous");
// }

// x();

// // Function Expression :- When a function is stored inside a variable
// let add = function(a, b) {
//     return a + b;
// };

// console.log(add(2, 3));


// // Nested Functions (Closure Concept) :- A function inside another function
// // debugger;
// function outer() {
//     let count = 0;

//     function inner() {
//         // console.log(count);
//         return count++;
//     }

//     return inner;
// }

// let result = outer();
// console.log(result());
// console.log(result());


// debugger;
// function Bank(bmoney) {
//     function rbi(Rmoney) {
//         console.log("Bank + RBI: " , bmoney + Rmoney);
        
//         function sbi(Smoney) {
//             console.log("Bank + SBI: " , bmoney + Smoney);

//             let total = bmoney + Rmoney + Smoney;
//             return total;
//         }

//         return sbi(0.5);
//     }

//     return rbi(0.3);
// }

// console.log("Bank + RBI + SBI: " , Bank(0.7));


// // arrow function
// let arrow = () => {
//     console.log("This is am arrow function")
// }

// arrow()


// let arrow2 = () => console.log("This is am arrow function")

// arrow2()


// let arrow3 = () => "This is am arrow function"

// console.log(arrow3());




// let str = "'hello'";
// console.log(str)

// let str2 = "hello";
// console.log(str2)

// let str3 = '"hello"';
// console.log(str3)

// let str4 = `hello, This is kushagra varshney ${str}
// new line
// new line`;
// console.log(str4)


// let backTicks = function(name , age , city) {
//     console.log(`My Name is ${name}, and I'm ${age} of age, and I'm from ${city} city.`)
// }

// backTicks("Kushagra Varshney" , 23 , "Budaun");


// let userName = "Kushagra Varshney";
// // traditional for loop
// for(let i = 0 ; i < userName.length ; i++) {
//     console.log(userName[i]);
//     console.log(userName.at(i));
//     console.log(userName.charAt(i));
// }

// console.log();

// // for-of loop
// for(let ch of userName) {
//     console.log(ch);
// }


// wap to reverse a string
let originalString = "reversed string";

let reversedString = "";
for(let i = originalString.length - 1 ; i >= 0 ; i--) {
    reversedString += originalString.charAt(i);
}
console.log(reversedString);

let reversedString2 = "";
for(let ch of originalString) {
    reversedString2 = ch + reversedString2;
}
console.log(reversedString2);

// let reversedString3 = originalString.split("").reverse().toString().replaceAll("," , "");
let reversedString3 = originalString.split("").reverse().join("");
console.log(reversedString3);


// let newString = "Hello World";
// console.log(newString.toUpperCase());
// console.log(newString.toLowerCase());
// console.log(newString.indexOf('l'));
// console.log(newString.lastIndexOf('l'));
// console.log(newString.charAt(2));
// console.log(newString.at(2));
// console.log(newString.charAt(-3));
// console.log(newString.at(-3));


// let fullString = "kushagravarshney.tech@gmail.com";
// let idx = fullString.indexOf('@');

// let subString = fullString.substring(0 , idx);
// console.log(subString);
// let subString2 = fullString.slice(0 , idx);
// console.log(subString2);

// let subString3 = fullString.substring(6 , 3);    // substring will not take -ve index, if you pass then it will convert it into 0, and if starting index is greater then ending index then it will swap the indexes
// console.log(subString3);
// let subString5 = fullString.slice(-6);
// console.log(subString5);
// let subString4 = fullString.slice(6 , 3);
// console.log(subString4);
// let subString6 = fullString.slice(-2 , 5);
// console.log(subString6);


// let username = "    kushagra    varshney     ";
// console.log(username);
// console.log(username.trim());
// console.log(username.trimStart());
// console.log(username.trimEnd());


// let username2 = "Java is a programming language, Java is OOPS based programming language";
// console.log(username2.replace("Java" , "Javascript"));
// console.log(username2);
// console.log(username2.replaceAll("Java" , "Javascript"));
// console.log(username2);

let arr = [1,2,"kushagra"];
console.log(arr);


let arr2 = new Array(3,4,"varshney");
console.log(arr2)


arr.push(10);
console.log(arr);

arr.pop();
console.log(arr);

arr.unshift(20);
console.log(arr);

arr.unshift(30 , 40);
console.log(arr);

arr.shift();
console.log(arr);

arr.splice(1 , 2 , 100);
console.log(arr);

arr.reverse();
console.log(arr);


let newArray = ["k" , "u" , "s" , "h" , "a" , "g" , "r" , "a" , " " , "v" , "a" , "r" , "s" , "h" , "n" , "e" , "y"];
let newArray2 = newArray.join("");
console.log(newArray);
console.log(newArray2);

let arrToString = newArray.toString().replaceAll("," , "");
console.log(arrToString);


let maxAndMinNumber = (arr) => {
    let maxElement = Number.MIN_SAFE_INTEGER;
    let minElement = Number.MAX_SAFE_INTEGER;
    for(let num of arr) {
        if(maxElement < num) {
            maxElement = num;
        }
        if(minElement > num) {
            minElement = num;
        }
    }

    return {maxElement , minElement};
}

let maxArray = [15 , 531 , -51 , 3516 , 7];
console.log(maxAndMinNumber(maxArray));
console.log("Min Element in the array: " + maxAndMinNumber(maxArray).minElement , ", Max Element in the array: " , maxAndMinNumber(maxArray).maxElement);


let OddAndEven = [15 , 531 , -50 , 3516 , 7];
let even = [] , odd = [];
for(let num of OddAndEven) {
    if(num % 2 == 0) {
        even.push(num);
    }
    else {
        odd.push(num);
    }
}

console.log(even);
console.log(odd);


let newArray3 = ["k" , "u" , "s" , "h" , "a" , "g" , "r" , "a" , " " , "v" , "a" , "r" , "s" , "h" , "n" , "e" , "y"];
let forEachArray = newArray3.forEach((ele , index , array) => {
    console.log(ele);
    // console.log(index);
    // console.log(array);
    return ele;   // will not return anything
});
console.log(forEachArray);



// Define a proper array
let myArray = [10, 20, 30];

// Use .map() if you want to return a new array
let mappedArray = myArray.map((ele, index, array) => {
    console.log(ele);   // current element
    console.log(index); // current index
    console.log(array); // the full array
    return ele;         // this value goes into the new array
});
console.log(mappedArray); // Output: [10, 20, 30]



let data = [20 , 40 , 50 , 60];
let sumOfArray = data.reduce((acc , ele) => {
    return acc + ele;
} , 0);
console.log(sumOfArray);