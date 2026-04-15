export{}

// Function Overloads (multiple signatures)
function display(value: string): string;
function display(value: number): string;
function display(value: boolean): string;

// Single Implementation
function display(value: any): string {
    if (typeof value === "string") {
        return "String value: " + value;
    } else if (typeof value === "number") {
        return "Number value: " + value;
    } else if (typeof value === "boolean") {
        return "Boolean value: " + value;
    } else {
        return "Unknown type";
    }
}

// Function Calls
console.log(display("Hello"));
console.log(display(100));
console.log(display(true));



function Demo(a:number, b:number):number;
function Demo(a:string, b:string):string;

function Demo(a:any, b:any):any{
    return a+b;
}

Demo(10, 20);
Demo("Teja", "reddy");