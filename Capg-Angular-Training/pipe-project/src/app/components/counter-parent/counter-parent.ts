import { Component } from '@angular/core';
import { CounterChild } from '../counter-child/counter-child';

@Component({
  selector: 'app-counter-parent',
  imports: [CounterChild],
  templateUrl: './counter-parent.html',
  styleUrl: './counter-parent.css',
})
export class CounterParent {
  count = 0;

  updateCount(val: number) {
    this.count = val;
  }
}
