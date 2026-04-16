// 1. Primitive : Define a type alias username that represents a simple string
type Username = string;

let user1: Username = "Madhur";
let user2: Username = "Solanki";
let user3: Username = "Coder";


// 2. Object : Create a type alias Car with two properties: brand (string) and year (number)
type Car = {
    brand: string;
    year: number;
};

let car1: Car = { brand: "BMW", year: 2022 };
let car2: Car = { brand: "Audi", year: 2020 };
let car3: Car = { brand: "Tesla", year: 2023 };


// 3. Optional Property : Define a Profile type where bio is optional string and id is a number
type Profile = {
    id: number;
    bio?: string;
};

let p1: Profile = { id: 1, bio: "Developer" };
let p2: Profile = { id: 2 };
let p3: Profile = { id: 3, bio: "Designer" };


// 4. Function : Create a type alias MathOp for a function that takes two numbers and returns a number
type MathOp = (a: number, b: number) => number;

let add: MathOp = (x, y) => x + y;
let sub: MathOp = (x, y) => x - y;
let mul: MathOp = (x, y) => x * y;

console.log(add(10, 5));
console.log(sub(10, 5));
console.log(mul(10, 5));


// 5. Array : Define a type alias PriceList that represents an array of numbers
type PriceList = number[];

let prices1: PriceList = [100, 200, 300];
let prices2: PriceList = [50, 75, 125];
let prices3: PriceList = [999, 1499, 1999];


