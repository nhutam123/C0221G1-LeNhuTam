import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListComponent} from './customer/list/list.component';
import {CreateComponent} from './customer/create/create.component';


const routes: Routes = [
  {path: 'customer/list', component: ListComponent},
  {path: 'customer/create', component: CreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
