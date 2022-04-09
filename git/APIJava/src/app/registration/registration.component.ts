import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserRegistrationService } from '../user-registration.service';
@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user:User = new User();
  
  constructor(private userRegistrationService: UserRegistrationService) { }

  ngOnInit(): void {
  }

  public registerNow(){     
      console.log(this.user);
      this.userRegistrationService.doRegistration(this.user).subscribe();
      alert("User Registration Successful");
  }


}
