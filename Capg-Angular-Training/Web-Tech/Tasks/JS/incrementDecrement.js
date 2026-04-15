let countValue = document.getElementById("count");
let value = parseInt(countValue.textContent);

let decrement = document.getElementById("decrement");
let increment = document.getElementById("increment");

// initial checking
if(value == 0) {
    decrement.disabled = true;
}
if(value == 10) {
    increment.disabled = true;
}


decrement.addEventListener("click" , () => {
    value--;
    countValue.textContent = value;

    increment.disabled = false;

    if(value == 0) {
        decrement.disabled = true;
    }
});

increment.addEventListener("click" , () => {
    value++;
    countValue.textContent = value;

    decrement.disabled = false;

    if(value == 10) {
        increment.disabled = true;
    }
});