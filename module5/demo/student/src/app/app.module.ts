import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentListComponent } from './student/student-list/student-list.component';
import { NgxPaginationModule } from 'ngx-pagination';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDialog, MatDialogModule} from '@angular/material/dialog';
import { DialogDeleteComponent } from './dialog-delete/dialog-delete.component';
import { StudentCreateComponent } from './student/student-create/student-create.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { DialogViewComponent } from './dialog-view/dialog-view.component';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import { LoginDialogComponent } from './login-dialog/login-dialog.component';
import { NavbarComponent } from './navbar/navbar.component';
import {HttpClientModule} from '@angular/common/http';
import { StudentEditComponent } from './student/student-edit/student-edit.component';
import { HomeComponent } from './home/home.component';
import { TeacherListComponent } from './teacher/teacher-list/teacher-list.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    DialogDeleteComponent,
    StudentCreateComponent,
    DialogViewComponent,
    LoginDialogComponent,
    NavbarComponent,
    StudentEditComponent,
    HomeComponent,
    TeacherListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgxPaginationModule,
    MatDialogModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {

}
