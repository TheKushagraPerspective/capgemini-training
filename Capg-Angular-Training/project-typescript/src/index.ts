console.log("This is sample text for testing purpose");


// type assertion
let username:unknown = "kushagra varshney";
// console.log(username.toUpperCase());   // directly we can't use this
console.log((username as string).toUpperCase());   // developer insisting that it is a string type so take it as a string

// another example of assertion
let a:any = "hello";
console.log(a.length);
a = <boolean>true;
if(a) {
    console.log("this is boolean value");
}
else {
    console.log("this is not boolean value");
}


let head = document.getElementById("heading") as HTMLHeadElement;
head.style.background = "yellow";