import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CarComponent} from './car/car.component';
import {CreateComponent} from './create/create.component';


const routes: Routes = [
  {path: 'list', component: CarComponent},
  {path: 'create', component: CreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
