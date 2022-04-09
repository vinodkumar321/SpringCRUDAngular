import { Component, OnInit } from '@angular/core';
import { FetchDataByIdService } from '../fetch-data-by-id.service';
import { User } from '../user';
@Component({
  selector: 'app-fetch-data-by-id',
  templateUrl: './fetch-data-by-id.component.html',
  styleUrls: ['./fetch-data-by-id.component.css']
})
export class FetchDataByIdComponent implements OnInit {

  user:User = new User(); 
  appId?:any = null;
  constructor(private fetchDataById:FetchDataByIdService) { }

  ngOnInit(): void {
  }

  public fetchDataByCustomerId(){ 
      this.fetchDataById.getCustomerDetailsByCustomerId(this.appId).subscribe( (data:User) => {
      console.log(data);
      this.user = data;
      
     }); 
   }
  }