import { Component, inject } from '@angular/core';
import { ApiDataService } from '../../share/api-data-service';
import { FormControl , FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-form-data',
  imports: [ReactiveFormsModule],
  templateUrl: './form-data.html',
  styleUrl: './form-data.css',
})
export class FormData {

  formDataService:ApiDataService = inject(ApiDataService);

  form = new FormGroup({
    name: new FormControl(""),
    email: new FormControl(""),
    avatar: new FormControl(""),
    password: new FormControl(""),
  })


  handleFormData(form: FormGroup) {
    console.log(form);
    // form.value;
    console.log(form.value);

    this.formDataService.sendFormData(form.value).subscribe({
      next: (ele) => {
        console.log(ele);
      },
      error: () => {
        console.log("error occured");
      }
    })
  }
}
