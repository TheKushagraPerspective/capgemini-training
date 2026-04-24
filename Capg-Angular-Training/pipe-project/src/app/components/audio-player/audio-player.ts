import { Component, ViewChild, ElementRef } from '@angular/core';

@Component({
  selector: 'app-audio-player',
  imports: [],
  templateUrl: './audio-player.html',
  styleUrl: './audio-player.css',
})
export class AudioPlayer {
  @ViewChild('audioRef') audioRef!: ElementRef<HTMLAudioElement>;

  audioList = [
    { title: 'Track 1', url: 'https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3' },
    { title: 'Track 2', url: 'https://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3' },
    { title: 'Track 3', url: 'https://www.soundhelix.com/examples/mp3/SoundHelix-Song-3.mp3' },
  ];

  currentIndex = 0;
  isPlaying = false;

  get currentTrack() {
    return this.audioList[this.currentIndex];
  }

  play() {
    this.audioRef.nativeElement.play();
    this.isPlaying = true;
  }

  pause() {
    this.audioRef.nativeElement.pause();
    this.isPlaying = false;
  }

  togglePlay() {
    this.isPlaying ? this.pause() : this.play();
  }

  previous() {
    if (this.currentIndex > 0) {
      this.currentIndex--;
      this.audioRef.nativeElement.load();
      if (this.isPlaying) this.play();
    }
  }

  next() {
    if (this.currentIndex < this.audioList.length - 1) {
      this.currentIndex++;
      this.audioRef.nativeElement.load();
      if (this.isPlaying) this.play();
    }
  }
}
