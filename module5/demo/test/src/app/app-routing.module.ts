import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {StudentCreateComponent} from './student/student-create/student-create.component';
import {StudentListComponent} from './student/student-list/student-list.component';
import {HomeComponent} from './home/home.component';
import {TeacherListComponent} from './teacher/teacher-list/teacher-list.component';
import {PatientListComponent} from './patient/patient-list/patient-list.component';
import {CreateComponent} from './patient/create/create.component';


// @ts-ignore
const routes: Routes = [{
  path: '' , component: HomeComponent
},
  {
  path: 'create' , component: CreateComponent
} , {
  path: 'list' , component: StudentListComponent
},
  {
    path: 'teacher/list', component: TeacherListComponent
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
