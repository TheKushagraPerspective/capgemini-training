import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { Nav } from './components/nav/nav';
import { Main } from './components/main/main';
import { Footer } from './components/footer/footer';
import { DataBinding } from './components/data-binding/data-binding';
import { Sedan } from './components/sedan/sedan';
import { Luxury } from './components/luxury/luxury';
import { Suvs } from './components/suvs/suvs';
import { DirectivesComponent } from './components/directives-component/directives-component';
import { Parent } from './components/parent/parent';
import { Child } from './components/child/child';


@Component({
  selector: 'app-root',
  imports: [ Nav , Main , Footer , DataBinding , Sedan , Luxury , Suvs , DirectivesComponent , Parent , Child],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('First-Angular-Project');
}
