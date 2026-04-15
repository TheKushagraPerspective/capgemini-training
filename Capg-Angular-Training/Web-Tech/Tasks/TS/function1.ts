export{}

function str(name:string , role:string = "user" , gender?:string) {
    return `Name: ${name}, Role: ${role}`;
}

console.log(str("kushagra varshney" , "CEO"));