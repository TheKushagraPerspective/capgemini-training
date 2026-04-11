// let obj = {
//     name : "kushagra varshney",
//     age : 23,
//     city : "budaun",
//     isMarried : false,
//     skills : ["HTML" , "CSS" , "JS"]
// }

// console.log(obj)

// let myData = new Object({
//     name : "kushagra varshney",
//     age : 23,
//     city : "budaun",
//     isMarried : false,
//     skills : ["HTML" , "CSS" , "JS"]
// })

// console.log(myData);
// console.log(myData.name);
// console.log(myData.age);
// console.log(myData.city);
// console.log(myData.isMarried);
// console.log(myData.skills);

// myData.gender = "male";   // add a new key:value pair in the obj
// console.log(myData);

// delete myData.isMarried;  // delete the existing key:value pair from the obj
// console.log(myData);


// let outerObj = new Object({
//     outerData : "Random Data",
//     nestedObj : new Object({
//         nestedData : "Nested Random Data"
//     })
// })

// console.log(outerObj);
// console.log(outerObj.outerData);
// console.log(outerObj.nestedObj);
// console.log(outerObj.nestedObj.nestedData);


// let objInArray = [
//     "Kushagra Varshney",
//     new Object({
//         outerData : "Random Data",
//         nestedObj : new Object({
//             nestedData : "Nested Random Data"
//         })
//     })
// ]

// console.log(objInArray);
// console.log(objInArray.at(0));
// console.log(objInArray.at(1));
// console.log(objInArray.at(1).outerData);
// console.log(objInArray.at(1).nestedObj);
// console.log(objInArray.at(1).nestedObj.nestedData);



// let userData = [
//     {id: 101 , name : "kushagra"},
//     {id: 102 , name: "karthik"},
//     {id: 103 , name: "jitendr"}
// ]

// userData.forEach((ele) => {
//     // console.log(ele);
//     console.log(ele.id);
// })


let myData = {
    name : "kushagra varshney",
    age : 23,
    city : "budaun",
    isMarried : false,
    skills : ["HTML" , "CSS" , "JS"]
}

// static methods only
// console.log(Object.keys(myData));    // will return all keys in array format
// console.log(Object.values(myData));  // will return all values in array format
// console.log(Object.entries(myData));  // will return all key:value pair in array format

// myData.gender = "male";   // for now it will add new property
// console.log(myData);

// Object.seal(myData);    // now we have sealed the obj, so now can't add or remove any perperty to the obj
// myData.rating = 5;   // will not added
// delete myData.isMarried;   // will not deleted
// console.log(myData);
// myData.isMarried = true; // but can modified the data of existing obj
// console.log(myData);

// console.log(Object.isSealed(myData));  // will tell whether the obj is sealed or not




// myData.gender = "male";   // for now it will add new property
// console.log(myData);

// Object.freeze(myData);    // now we have sealed the obj, so now can't add or remove any perperty to the obj
// myData.rating = 5;   // will not added
// delete myData.isMarried;   // will not deleted
// console.log(myData);
// myData.isMarried = true; // will not modified the data also of existing obj
// console.log(myData);

// console.log(Object.isFrozen(myData));  // will tell whether the obj is sealed or not





// let normalObj = {
//     name : "kushagra varshney",
//     age : 23,
//     city : "budaun",
//     isMarried : false,
//     skills : ["HTML" , "CSS" , "JS"]
// }

// console.log(normalObj);

// // obj to json
// let jsonObj = JSON.stringify(normalObj);
// console.log(jsonObj);

// // json to obj
// let newObj = JSON.parse(jsonObj);
// console.log(newObj);

// let jsonObject = `{"name":"kushagra varshney","age":23,"city":"budaun","isMarried":false,"skills":["HTML","CSS","JS"]}`;   // structure of json object
// console.log(jsonObject);



// destructuring
let arr = ["red" , "yellow" , "blue"];
let [red , yellow , blue] = [...arr];
console.log(red);
console.log(yellow);
console.log(blue);

let obj = {
    name: "kushagra",
    age: 23,
    isMarried: false
}

let {name , age , isMarried} = {...obj}
console.log(`My Name is ${name}, I'm ${age} of age, Marrige Status: ${isMarried}`);