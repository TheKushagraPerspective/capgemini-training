import { Component } from '@angular/core';
import { NgClass, NgStyle , CommonModule } from '@angular/common';


interface User {
  name:string,
  age:number,
  city:string,
  isMarried:boolean,
}



@Component({
  selector: 'app-directives-component',
  imports: [NgClass, NgStyle , CommonModule],
  templateUrl: './directives-component.html',
  styleUrl: './directives-component.css',
})
export class DirectivesComponent {
  
  className : string = 'paraClass';
  toggleFunction(){
    this.className = "SecondClass";
  }

  isLogged:boolean=true;
  isActive:boolean=true;
  isDisabled:boolean=false;

  toggleLogin() {
    // this.toggleActive();
    // this.toggleDisabled();
    this.isLogged = !this.isLogged;
  }

  toggleActive() {
    this.isActive = !this.isActive;
  }

  toggleDisabled() {
    this.isDisabled = !this.isDisabled;
  }


  ngIfToggle:boolean = false;



  userDetails: User[] = [
    // {
    //   name: "kushagra" , age: 22, city: "budaun", isMarried: false
    // },
    // {
    //   name: "kartik" , age: 23, city: "alwar", isMarried: true
    // },
    // {
    //   name: "jitendra" , age: 99, city: "palwal", isMarried: false
    // },
    // {
    //   name: "tejas" , age: 1, city: "giddalur", isMarried: true
    // }
  ]


  annoNgIf:boolean = true;
  apiStatus:string = "wrong-api";

  

}
