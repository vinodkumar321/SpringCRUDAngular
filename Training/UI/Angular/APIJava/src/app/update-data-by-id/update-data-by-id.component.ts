import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UpdateDataByIdService } from '../update-data-by-id.service';
@Component({
  selector: 'app-update-data-by-id',
  templateUrl: './update-data-by-id.component.html',
  styleUrls: ['./update-data-by-id.component.css']
})
export class UpdateDataByIdComponent implements OnInit {

  constructor(private updateDataService:UpdateDataByIdService) { }
  appId?:any = null;
  user:User = new User();
  ngOnInit(): void {
       
  }

  public updateDataByCustomerId(){ 
    this.updateDataService.getCustomerDetailsByCustomerId(this.appId).subscribe( (data:User) => {
      console.log(data);
      this.user = data; 
     });
  }
  
    public updateDetailsById(){
      console.log(this.user);
      this.updateDataService.updateDetailById(this.user,this.appId).subscribe();
      alert("Update to Customer Details Successful");
    }
}