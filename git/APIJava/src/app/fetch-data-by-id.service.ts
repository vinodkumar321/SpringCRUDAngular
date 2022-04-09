import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FetchDataByIdService {

  
  constructor(private http:HttpClient) { }
  baseUrlgetbyId = 'http://localhost:8080/las/getCustomerDetailsByCustomerId';

  public getCustomerDetailsByCustomerId(Id?:any) : Observable<User>{
           return this.http.get<User>(`${this.baseUrlgetbyId}/${Id}`);
  }    

}
