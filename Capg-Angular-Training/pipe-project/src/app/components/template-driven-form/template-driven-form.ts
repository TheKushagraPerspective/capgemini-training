import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';

type user={
  countryname:string,countrycode:number
}


@Component({
  selector: 'app-template-driven-form',
  imports: [FormsModule , CommonModule],
  templateUrl: './template-driven-form.html',
  styleUrl: './template-driven-form.css',
})
export class TemplateDrivenForm {

  handleForm(formRef: NgForm) {
    if(formRef.valid) {
      console.log("Form Submitted: " , formRef.value);
    }
    else {
      console.log("Form Invalid");
    }
  }

  country:user[]=[
    {countryname:"ind",countrycode:8005},
    {countryname:"d",countrycode:8005},
    {countryname:"drs",countrycode:8005},
    {countryname:"rt",countrycode:8005},
    {countryname:"rg",countrycode:8005},
    {countryname:"yh",countrycode:8005},
  ]

  resetForm(formRef: NgForm) {
    formRef.reset();
  }
}