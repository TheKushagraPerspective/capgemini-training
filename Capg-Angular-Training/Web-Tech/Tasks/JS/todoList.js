let inputTask = document.querySelector("#taskInput");
let addTaskBtn = document.querySelector("#addTaskBtn");
let list = document.querySelector("#listTask");


addTaskBtn.addEventListener("click" , () => {
    let inputData = inputTask.value;

    if(inputData != "") {
        let li = document.createElement("li");

        li.innerHTML = `
                        ${inputData} 
                        <button class="deleteTask">Delete</button> 
                        <button class="completeTask">Completed</button>
                    `;
        
        list.appendChild(li);
        inputTask.value = "";
    }
});


list.addEventListener("click" , (e) => {
    if(e.target.classList.contains('deleteTask')) {
        e.target.parentElement.remove();
    }

    if(e.target.classList.contains("completeTask")) {
        e.target.parentElement.style.textDecoration = "line-through";
    }
})