import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-exam-preparation',
  imports: [FormsModule],
  templateUrl: './exam-preparation.html',
  styleUrl: './exam-preparation.css',
})
export class ExamPreparation {

  // two-way binding
  name:string = "";
}
