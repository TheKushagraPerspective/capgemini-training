import { Component } from '@angular/core';
import { Child } from '../child/child';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-parent',
  imports: [CommonModule, Child],
  templateUrl: './parent.html',
  styleUrl: './parent.css',
})
export class Parent {

  parentMessage = "Hello from Parent";
  fruits = ['Apple', 'Banana', 'Mango', 'kiwi'];

  user = {
    name: 'teju',
    age: 230
  };

  childMessage: string[] = [];

  receiveMessage(data: string[]) {
    this.childMessage = data;
  }
}