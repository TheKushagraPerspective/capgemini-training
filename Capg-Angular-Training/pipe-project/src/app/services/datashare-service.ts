import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class DatashareService {

  demoVariable: string = "Demo data";

  userObj = {
    name: "kushagra varshney",
    age: 22,
    gender: "male",
    isMarried: false,
  };
  
}
