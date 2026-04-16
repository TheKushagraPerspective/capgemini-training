;
let user1 = {
    username: "kushagra",
    age: 22,
    skills: ["html", "css", "js", "tailwind css", "ts"],
    details: () => {
        return { city: "punjab", country: "india" };
    },
};
console.log(user1);
console.log(user1.details?.());
let LPU = {
    camp: "Punjab"
};
console.log(LPU);
let lenovoObj = {
    brand: "Lenovo",
    model: "Lenovo L6",
    price: 39999.99
};
console.log(lenovoObj);
let hpObj = {
    brand: "HP",
    model: "Hp h5",
    price: 49999.99
};
console.log(hpObj);
export {};
