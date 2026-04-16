export{}

let arr = [40 , true , "Kushagra"];
console.log(arr);
console.log(arr.at(0));


let arr2:number[] = [7 , 7 , 7];
console.log(arr2);

let arr3:string[] = ["kushagra" , "varshney"];
console.log(arr3);

let arr4:boolean[] = [true , false];
console.log(arr4);
arr4.push(true);
console.log(arr4);


let arr5:(number | boolean)[] = [7 , true , 7 , false];
console.log(arr5);
console.log(typeof arr5);

const arr6:readonly number[] = [1 , 2 , 3];
console.log(arr6);
console.log(arr6.at(1));
// arr6.push(50); // cannot do the operations like pop , push , update as this array is only for reading purpose (constant array it is)


// array of the object
let arrObj:{name : string}[] = [
    {name : "abc"},
    {name : "xyz"}
];
console.log(arrObj);


// tuple
// it will restrict the size of the array also
let arrTuple:[string , number , boolean] = ["Kushagra" , 22 , true ];
console.log(arrTuple);



