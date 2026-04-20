import { Component, input } from '@angular/core';

type Demo = {
  demo: string,
  city: string,
}


interface CarData {
  readonly brand:string,
  model?:string,
  price:number,
}


@Component({
  selector: 'app-data-binding',
  imports: [],
  templateUrl: './data-binding.html',
  styleUrl: './data-binding.css',
})
export class DataBinding {
  username: string = "kushagra";
  mobile:number = 9876543210;

  user:Demo = {
    demo: "Demo Data",
    city: "Budaun",
  }

  imageUrl:string = "https://images.unsplash.com/photo-1520975916090-3105956dac38?w=1200";
  isHidden:boolean = true;

  carDetails:CarData = {
    brand: "BMW",
    price: 500,
  }

  updateCar() {
    // this.carDetails.brand = "Audi";   // not able to update this property as it is readable only
    this.carDetails.price = 54154;
  }


  // create a boolean property logged in and based on the value show msg success or failed with the help of the interpolation
  // event binding
  isLogged:boolean = false;

  toggleLogin() {
    if(this.isLogged) {
      this.isLogged = false;
    } 
    else {
      this.isLogged = true;
    }
  }

  // passing class name using property binding
  classname:string = "container";

  userNameData = "";

  showUserData() {
    this.userNameData = "Kushagra Varshney";
  }


  inputDataValue:string = "";
  handleInput(val: Event) {
    let inputData = val.target as HTMLInputElement;
    this.inputDataValue = inputData.value;
  }
}
