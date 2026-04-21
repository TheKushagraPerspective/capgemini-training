import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-child',
  imports: [CommonModule],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child {

  @Input() message!: string;
  @Input() fruits!: string[];
  @Input() user!: { name: string; age: number };

  @Output() sendData = new EventEmitter<string[]>();

  sendMessageToParent() {
    this.sendData.emit(['Apple', 'Banana', 'Mango', 'kiwi']);
  }
}