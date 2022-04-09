import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DeleteDataByIdService {

  constructor(private http:HttpClient) { }
  
  baseUrldeletebyId = 'http://localhost:8080/las/deleteCustomerDetailsByCustomerId';

  public deleteCustomerById(Id?:any) : Observable<User> {
      return this.http.delete<User>(`${this.baseUrldeletebyId}/${Id}`);
  }
}
