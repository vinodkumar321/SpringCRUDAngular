import { Component, OnInit } from '@angular/core';
import { DeleteDataByIdService } from '../delete-data-by-id.service';
import { User } from '../user';
@Component({
  selector: 'app-delete-data-by-id',
  templateUrl: './delete-data-by-id.component.html',
  styleUrls: ['./delete-data-by-id.component.css']
})
export class DeleteDataByIdComponent implements OnInit {

  appId?:any;
  
  user = <any> {};
  
  constructor(private deleteDataByIdService:DeleteDataByIdService) { }

  ngOnInit(): void {
  }

  public deleteDataById(){
    this.deleteDataByIdService.deleteCustomerById(this.appId).subscribe( (data:User) => {
      console.log(data);
      this.user = data;
      alert("Data Deletion is Successful");
     }); 
  }

}
