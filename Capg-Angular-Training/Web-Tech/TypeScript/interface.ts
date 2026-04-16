export{}

interface User {
    username: string,
    age: number,
    skills: string[],
    details?: () => {}
};

let user1:User = {
    username: "kushagra",
    age: 22,
    skills: ["html" , "css" , "js" , "tailwind css" , "ts"],
    details: () => {
        return {city: "punjab" , country: "india"}
    },
}

console.log(user1);
console.log(user1.details?.());


interface clg {
    camp: string
}

interface clg {
    fees?: number
}

interface clg {
    stream?: string
}

let LPU:clg = {
    camp: "Punjab"
}
console.log(LPU);


// inheritance in interface
interface Laptop {
    model:string
}

interface Lenovo extends Laptop {
    brand: string,
    price: number
}

interface HP extends Laptop {
    brand: string,
    price: number
}

let lenovoObj:Lenovo = {
    brand: "Lenovo",
    model: "Lenovo L6",
    price: 39999.99
}
console.log(lenovoObj);

let hpObj:Lenovo = {
    brand: "HP",
    model: "Hp h5",
    price: 49999.99
}
console.log(hpObj);