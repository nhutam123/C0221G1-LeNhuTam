import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {StudentCreateComponent} from './student-create/student-create.component';
import {StudentListComponent} from './student-list/student-list.component';


// @ts-ignore
const routes: Routes = [{
  path: 'create' , component: StudentCreateComponent
} , {
  path: 'list' , component: StudentListComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
