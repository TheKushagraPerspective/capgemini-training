// let id1 = document.getElementById("id1");
// console.log(id1);

// let span = document.getElementsByTagName("span");
// console.log(span);

// let h1 = document.getElementsByTagName("h1");
// console.log(h1);
// console.log(typeof h1);

// // not able to perform bcz currently h1 is a collection not the array, first convert it into array then use array methods and functionality
// // h1.forEach((ele) => {
// //     console.log(ele);
// // });

// let h1Array = Array.from(h1);
// console.log(h1Array);
// console.log(typeof h1Array);

// h1Array.forEach((ele , index) => {
//     if(index % 2 == 0) {
//         ele.style.color = "yellow";
//         ele.style.backgroundColor = "brown";
//     }
//     else {
//         ele.style.color = "brown";
//         ele.style.backgroundColor = "yellow";
//     }
//     // ele.style.display = "inline";
// });


// let p = document.querySelector(".paragraph");
// console.log(p);
// p.style.backgroundColor = "yellow";


// let pre = document.querySelector("#pre2");   // using id name
// console.log(pre);

// let pre = document.querySelector(".pre1");   // using class name
// console.log(pre);

// let pre = document.querySelector("pre");       // using tag name
// console.log(pre);

// let pre = document.querySelectorAll(".pre1");  // using id name, will return nodelist
// console.log(pre);

// pre.forEach((ele) => {
//     console.log(ele);
// })

// let pre = document.querySelectorAll("#pre2");  // using class name, will return nodelist
// console.log(pre);

// pre.forEach((ele) => {
//     console.log(ele);
// })

// let pre = document.querySelectorAll("pre");  // using tag name, will return nodelist
// console.log(pre);

// pre.forEach((ele) => {
//     console.log(ele);
// })


let btn = document.getElementById("btn");

btn.addEventListener(("click") , () => {
    if(btn.style.color === "black"){
        btn.style.color = "white";
        btn.style.backgroundColor = "black";
    }
    else {
        btn.style.color = "black";
        btn.style.backgroundColor = "white";
    }
})


let input = document.querySelector("input");

input.addEventListener("input" , (ele) => {
    let inputFieldData = ele.target.value;
    console.log(inputFieldData);

    document.body.style.backgroundColor = inputFieldData;
})