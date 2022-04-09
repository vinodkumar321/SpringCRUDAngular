import { Component,OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Promise';
  API_KEY = "7e31155d79974978b17ab92ffa73ad70";
  Value:any;

  constructor(private httpClient:HttpClient){}

  ngOnInit(): void {
    this.fetchData();
  }

  
}


