import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { FetchDataComponent } from './fetch-data/fetch-data.component';
import { FetchDataByIdComponent } from './fetch-data-by-id/fetch-data-by-id.component';
import { UpdateDataByIdComponent } from './update-data-by-id/update-data-by-id.component';
import { DeleteDataByIdComponent } from './delete-data-by-id/delete-data-by-id.component';
import { AppComponent } from './app.component';
const routes: Routes = [
    
    //{path:"",redirectTo:"register",pathMatch:"full"},
    {path: "", redirectTo: "/", pathMatch: "full"},
    {path:"register",component:RegistrationComponent},
    {path:"fetchData",component:FetchDataComponent},
    {path:"fetchDataById",component:FetchDataByIdComponent},
    {path:"updateDataById",component:UpdateDataByIdComponent},
    {path:"deleteDataById",component:DeleteDataByIdComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
