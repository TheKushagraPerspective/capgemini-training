// Q1:- create a function to print welcome message (return welcome message)
function welcomeMessage() {
    return "Welcome to JavaScript!";
}

console.log(welcomeMessage());



// Q2:- create an anonymous function ans store inside a variable and it should return table of one particular number
let table = function(num) {
    let result = "";
    for (let i = 1; i <= 10; i++) {
        result += num + " x " + i + " = " + (num * i) + "\n";
    }
    return result;
};

console.log(table(5));




// Q3:- create one nested function
// grand parent
// parent
// child
// grand child
// and pass value to each other
function grandParent(a) {
    function parent(b) {
        function child(c) {
            function grandChild(d) {
                return a + b + c + d;
            }
            return grandChild(4);
        }
        return child(3);
    }
    return parent(2);
}

console.log(grandParent(1)); // Output: 10





// Q4: create one function WOF which accept one callback function and perform some operation
function WOF(callback) {
    console.log("Before callback");
    callback();
    console.log("After callback");
}

// callback function
function greet() {
    console.log("Hello from callback!");
}

WOF(greet);




// Q5: create a function which returns multiplication of two number
function multiply(a, b) {
    return a * b;
}

console.log(multiply(5, 3)); // 15



// Q6: create a function which compare two values and return small value
function findSmall(a, b) {
    if (a < b) {
        return a;
    } else {
        return b;
    }
}

console.log(findSmall(10, 5)); // 5



// Q7: create a function which returns the number whether even or odd
function checkEvenOdd(num) {
    if (num % 2 === 0) {
        return "Even";
    } else {
        return "Odd";
    }
}

console.log(checkEvenOdd(7)); // Odd
console.log(checkEvenOdd(10)); // Even