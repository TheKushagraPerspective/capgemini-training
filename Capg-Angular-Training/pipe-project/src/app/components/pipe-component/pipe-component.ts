import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

interface User {
  name:string,
  age:number,
  city:string,
  description:string,
  salary:number,
}

@Component({
  selector: 'app-pipe-component',
  imports: [CommonModule],
  templateUrl: './pipe-component.html',
  styleUrl: './pipe-component.css',
})
export class PipeComponent {


  userDetails:User[] = [
    {name:"kushagra" , age:22 , city:"budaun", description:"nwabo ka shr", salary:709000},
    {name:"Kartik" , age:23 , city:"abc", description:"abc great", salary:809000},
    {name:"Jitendra" , age:21 , city:"xyz", description:"xyz wonderfull", salary:909000},
    {name:"Tejas" , age:24 , city:"pqrs", description:"pqrs excellent", salary:1009000},
  ]


  changenob(val : Event) {
    let value = val.target as HTMLInputElement;
    this.userDetails[0].name = value.value as string;
  }

}
