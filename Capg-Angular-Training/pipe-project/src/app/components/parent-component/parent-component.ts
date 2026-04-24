import { Component , inject } from '@angular/core';
import { ChildComponent } from '../child-component/child-component';
import { DatashareService } from '../../services/datashare-service';

interface User {
  name?:string,
  age?:number,
  gender?:string,
  isMarried?:boolean
}

@Component({
  selector: 'app-parent-component',
  imports: [ChildComponent],
  templateUrl: './parent-component.html',
  styleUrl: './parent-component.css',
})
export class ParentComponent {

  parentToChild:string = "Hello, from parent";


  userData = inject(DatashareService);

  


  

}
