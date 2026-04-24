import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-forms',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './reactive-forms.html',
  styleUrls: ['./reactive-forms.css']
})
export class ReactiveFormsComponent {

  form = new FormGroup({
    name: new FormControl<string>("", Validators.required),

    email: new FormControl<string>("", [
      Validators.required,
      Validators.email,
      Validators.maxLength(50)
    ]),

    password: new FormControl<string>("", [
      Validators.required,
      Validators.minLength(8)
    ]),

    gender: new FormControl<string>("", Validators.required),

    country: new FormControl<string>("", Validators.required),

    skills: new FormControl<string[]>([]) // ✅ FIXED TYPE
  });

  handleform(form: FormGroup) {
    if (form.invalid) {
      form.markAllAsTouched();
      return;
    }

    console.log("Form Submitted:", form.value);
  }

  // ✅ FIXED METHOD (NO ERROR NOW)
  onCheckboxChange(event: Event) {
    const target = event.target as HTMLInputElement;

    const skills = this.form.get('skills')?.value || [];

    if (target.checked) {
      skills.push(target.value);
    } else {
      const index = skills.indexOf(target.value);
      if (index >= 0) skills.splice(index, 1);
    }

    this.form.get('skills')?.setValue(skills);
  }

  resetForm() {
    this.form.reset();
  }
}