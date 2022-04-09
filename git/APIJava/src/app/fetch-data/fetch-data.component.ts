import { Component, Input, OnInit } from '@angular/core';
import { FetchDataService } from '../fetch-data.service';
import { User } from '../user';

@Component({
  selector: 'app-fetch-data',
  templateUrl: './fetch-data.component.html',
  styleUrls: ['./fetch-data.component.css']
})
export class FetchDataComponent implements OnInit {
  
  users?: User[]; 
  user?: User;
  constructor(private fetchDataService : FetchDataService) { }

  ngOnInit(): void {
  }

  public fetchData(){
     
     this.fetchDataService.getCustomerDetailsAll().subscribe((data:User[]) => {
      console.log(data);
      this.users = data;
      
  });
  }

}
