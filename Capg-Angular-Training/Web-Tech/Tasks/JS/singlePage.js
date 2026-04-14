let toggleBtn = document.querySelector("#toggleBtn");
let products = document.querySelector("#products");

toggleBtn.addEventListener("click", () => {
    document.body.classList.toggle("light");
    toggleBtn.classList.toggle("fa-moon");
    toggleBtn.classList.toggle("fa-sun");
});

async function loadProducts() {
    let res = await fetch("https://fakestoreapiserver.reactbd.org/api/products");
    let data = await res.json();
    data.data.forEach((item) => {
        let card = document.createElement("div");
        card.classList.add("card");
        card.innerHTML = `<img src="${item.image}" alt="${item.title}"><p>${item.title}</p>`;
        products.appendChild(card);
    });
}

loadProducts();