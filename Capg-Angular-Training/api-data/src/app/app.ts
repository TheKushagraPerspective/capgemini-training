import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ShowData } from '../core/show-data/show-data';
import { FormData } from '../core/form-data/form-data';
import { Nav } from '../core/nav/nav';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet , ShowData , FormData , Nav],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('api-data');
}
