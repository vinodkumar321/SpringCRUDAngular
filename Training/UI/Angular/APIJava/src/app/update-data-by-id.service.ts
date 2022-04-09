import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UpdateDataByIdService {

  constructor(private http:HttpClient) { }
  baseUrlupdatebyId = 'http://localhost:8080/las/updateCustomerDetailsByCustomerId';

  public updateCustomerDetailsByCustomerId(Id?:any) : Observable<User>{
           return this.http.get<User>(`${this.baseUrlupdatebyId}/${Id}`);
  }

  public getCustomerDetailsByCustomerId(Id?:any) : Observable<User>{
    return this.http.get<User>(`${this.baseUrlupdatebyId}/${Id}`);
   }

  public updateDetailById(user?:User,Id?:any) : Observable<User> {
       return this.http.put<User>(`${this.baseUrlupdatebyId}/${Id}`,user);  
  } 
}
