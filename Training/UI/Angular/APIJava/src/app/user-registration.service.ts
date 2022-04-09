import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserRegistrationService {

  baseUrlsave = 'http://localhost:8080/las/saveCustomerDetails';
  constructor(private http:HttpClient) { }

  public doRegistration(user?:User):Observable<Object>{
      return this.http.post<Object>(`${this.baseUrlsave}`,user);
  }

  
}
