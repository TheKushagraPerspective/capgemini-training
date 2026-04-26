import { Component, inject , signal } from '@angular/core';
import { ApiDataService } from '../../share/api-data-service';

@Component({
  selector: 'app-show-data',
  imports: [],
  templateUrl: './show-data.html',
  styleUrl: './show-data.css',
})
export class ShowData {

  ApiData:ApiDataService = inject(ApiDataService);
  getApiData:any = signal([]);

  ngOnInit() {
    this.getDataService();
    // this.postData();
  }

  getDataService() {
    this.ApiData.getData().subscribe({
      next: (ele) => {
        console.log(ele);

        this.getApiData.set(ele);
        console.log(this.getApiData);
      }
    })
  }


  postData() {
    let userData = {
      "title": "New Product",
      "price": 10,
      "description": "A description",
      "categoryId": 72,
      "images": ["https://placehold.co/600x400"]
    };

    this.ApiData.sendData(userData).subscribe({
      next: (res) => {
        console.log("POST SUCCESS:", res);
      },
      error: (err) => {
        console.log("POST ERROR:", err);
      }
    });
  }

}
