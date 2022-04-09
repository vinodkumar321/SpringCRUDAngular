import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { appRoutes } from './app.route';
import { RouterModule, Routes } from '@angular/router';
import { AttributeDirectiveComponent } from './attribute-directive/attribute-directive.component';
import { ChildParentComponent } from './child-parent/child-parent.component';
import { CustomPipeComponent } from './custom-pipe/custom-pipe.component';
import { ComponentDirectiveComponent } from './component-directive/component-directive.component';
import { HttpComponent } from './http/http.component';
import { OneWayBindingComponent } from './one-way-binding/one-way-binding.component';
import { PipesComponent } from './pipes/pipes.component';
import { ParantChildComponent } from './parant-child/parant-child.component';
import { ReactiveFormsComponent } from './reactive-forms/reactive-forms.component';
import { RoutingComponent } from './routing/routing.component';
import { TemplateFormsComponent } from './template-forms/template-forms.component';
import { ServiceComponent } from './service/service.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { ProductService } from './product.service';
@NgModule({
  declarations: [
    AppComponent,
    AttributeDirectiveComponent,
    ChildParentComponent,
    CustomPipeComponent,
    ComponentDirectiveComponent,
    HttpComponent,
    OneWayBindingComponent,
    PipesComponent,
    ParantChildComponent,
    ReactiveFormsComponent,
    RoutingComponent,
    TemplateFormsComponent,
    ServiceComponent,
    StructuralDirectivesComponent,
  ],
  imports: [
    BrowserModule,FormsModule,RouterModule.forRoot(appRoutes)
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
