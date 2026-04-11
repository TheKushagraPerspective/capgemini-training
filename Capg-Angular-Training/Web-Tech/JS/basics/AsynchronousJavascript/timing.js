// console.log("Written before the set timeout code...")


// setTimeout((a , b) => {
//     console.log("How are you!")
//     console.log(a + b);
// },1000 , 7 , 7);


// console.log("Written after the set timeout code...")



// // Q:- create a timer function which executes only once after 5 sec, which takes two arguments to perform the mathematical operation
// let num1 = parseInt(prompt("Enter num1: "));
// console.log(typeof num1);
// let num2 = parseInt(prompt("Enter num2: "));
// console.log(typeof num2);

// let timer = setTimeout((num1 , num2) => {
//     document.writeln(`Addition of ${num1} and ${num2} is ${num1 + num2}`);
// } , 5000 , num1 , num2);

// console.log("timer id " , timer); // timer is having the details of this setTimeout like id and all, by using this we can clear the timer also

// clearTimeout(timer)


console.log("Written before the set time interval code...");


let timerOfInterval = setInterval(() => {
    console.log("SetInterval execution...")
} , 5000);


console.log("Written after the set time interval code...");
clearInterval(timerOfInterval);