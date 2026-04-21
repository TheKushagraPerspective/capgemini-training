import { Component } from "@angular/core";

@Component({
    selector: 'app-main',
    templateUrl: './main.html',
    styleUrls: ['./main.css'],
})
export class Main{
    taskFieldValue = "";
    taskInputFieldValue = "";

    handleOnTaskField(val : Event) {
        let inputField = val.target as HTMLInputElement;
        this.taskFieldValue = inputField.value;
        this.taskInputFieldValue = inputField.value;
    }
};