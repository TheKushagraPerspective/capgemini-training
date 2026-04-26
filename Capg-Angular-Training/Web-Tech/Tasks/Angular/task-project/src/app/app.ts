import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Nav } from './components/nav/nav';
import { Sedan } from './components/sedan/sedan';
import { Luxury } from './components/luxury/luxury';
import { Suvs } from './components/suvs/suvs';
import { Button } from './components/button/button';
import { Electronics } from './components/electronics/electronics';
import { Home } from './components/home/home';
import { Feedback } from './components/home-child/feedback/feedback';
import { Pageinfo } from './components/home-child/pageinfo/pageinfo';
import { Profile } from './components/home-child/profile/profile';
import { PageNotFound } from './components/page-not-found/page-not-found';
import { Product } from './components/product/product';
import { ShowData } from './components/show-data/show-data';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet , Nav , Sedan , Luxury , Suvs , Button , Electronics , Home , Feedback , Pageinfo , Profile , PageNotFound , Product , ShowData],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('task-project');
}
