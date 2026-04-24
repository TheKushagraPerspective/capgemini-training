import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-counter-child',
  imports: [],
  templateUrl: './counter-child.html',
  styleUrl: './counter-child.css',
})
export class CounterChild {
  @Input() count = 0;
  @Output() countChange = new EventEmitter<number>();

  increment() {
    this.countChange.emit(this.count + 1);
  }

  decrement() {
    this.countChange.emit(this.count - 1);
  }
}
