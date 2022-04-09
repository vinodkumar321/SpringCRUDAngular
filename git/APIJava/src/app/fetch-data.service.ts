import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FetchDataService {

  user:User = new User();
  constructor(private http:HttpClient) { }
  baseUrlget = 'http://localhost:8080/las/getCustomerDetailsAll';
  
  public getCustomerDetailsAll():Observable<User[]>{
      
    return this.http.get<User[]>(`${this.baseUrlget}`);
  }
/*
  public getAll(): Observable<Tutorial[]> {
    return this.http.get<Tutorial[]>(baseUrl);
  } */
}
