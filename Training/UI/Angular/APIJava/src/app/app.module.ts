import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { UserRegistrationService } from './user-registration.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FetchDataService } from './fetch-data.service';
import { FetchDataComponent } from './fetch-data/fetch-data.component';
import { FetchDataByIdComponent } from './fetch-data-by-id/fetch-data-by-id.component';
import { UpdateDataByIdComponent } from './update-data-by-id/update-data-by-id.component';
import { DeleteDataByIdComponent } from './delete-data-by-id/delete-data-by-id.component';
@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    FetchDataComponent,
    FetchDataByIdComponent,
    UpdateDataByIdComponent,
    DeleteDataByIdComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserRegistrationService,FetchDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
