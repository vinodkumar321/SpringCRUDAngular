import { Routes } from "@angular/router";
import { AttributeDirectiveComponent } from "./attribute-directive/attribute-directive.component";
import { ChildParentComponent } from "./child-parent/child-parent.component";
import { ComponentDirectiveComponent } from "./component-directive/component-directive.component";
import { CustomPipeComponent } from "./custom-pipe/custom-pipe.component";
import { HttpComponent } from "./http/http.component";
import { OneWayBindingComponent } from "./one-way-binding/one-way-binding.component";
import { PipesComponent } from "./pipes/pipes.component";
import { ParantChildComponent } from "./parant-child/parant-child.component";
import { ReactiveFormsComponent } from "./reactive-forms/reactive-forms.component";
import { RoutingComponent } from "./routing/routing.component";
import { TemplateFormsComponent } from "./template-forms/template-forms.component";
import { ServiceComponent } from "./service/service.component";
import { StructuralDirectivesComponent } from "./structural-directives/structural-directives.component";
export const appRoutes:Routes=[
    {path:'Attribute Directive',component:AttributeDirectiveComponent},
    {path:'ChildParent',component:ChildParentComponent},
    {path:'CustomPipe',component:CustomPipeComponent},
    {path:'Component Directive',component:ComponentDirectiveComponent},
    {path:'Http',component:HttpComponent},
    {path:'One-way Binding',component:OneWayBindingComponent},
    {path:'Pipes',component:PipesComponent},
    {path:'ParentChild',component:ParantChildComponent},
    {path:'ReactiveForms',component:ReactiveFormsComponent},
    {path:'Routing',component:RoutingComponent},
    {path:'TemplateForms',component:TemplateFormsComponent},
    {path:'Service',component:ServiceComponent},
    {path:'Structural Directives',component:StructuralDirectivesComponent},
    {path:'*',redirectTo:'Attribute Directive',pathMatch:"full"},
]