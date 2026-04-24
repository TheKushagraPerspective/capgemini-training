import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PipeComponent } from './components/pipe-component/pipe-component';
import { TemplateDrivenForm } from './components/template-driven-form/template-driven-form';
import { ReactiveFormsComponent } from './components/reactive-forms/reactive-forms';
import { AudioPlayer } from './components/audio-player/audio-player';
import { CounterParent } from './components/counter-parent/counter-parent';
import { ContentWrapper } from './components/content-wrapper/content-wrapper';
import { ExamPreparation } from './components/exam-preparation/exam-preparation';
import { ChildComponent } from './components/child-component/child-component';
import { ParentComponent } from './components/parent-component/parent-component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet , PipeComponent , TemplateDrivenForm , ReactiveFormsComponent , AudioPlayer, CounterParent, ContentWrapper , ExamPreparation , ChildComponent , ParentComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipe-project');
}
