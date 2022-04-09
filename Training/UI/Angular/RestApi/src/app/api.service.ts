import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  API_KEY = "7e31155d79974978b17ab92ffa73ad70";
  constructor(private httpClient: HttpClient) { }

  public getNews(){

    return this.httpClient.get(`https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=${this.API_KEY}`);
   } 
}
