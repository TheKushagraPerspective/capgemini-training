import { CommonModule } from '@angular/common';
import { Component , Input } from '@angular/core';


@Component({
  selector: 'app-child-component',
  imports: [CommonModule],
  templateUrl: './child-component.html',
  styleUrl: './child-component.css',
})
export class ChildComponent {

  @Input() parentMessage!:string;
}
