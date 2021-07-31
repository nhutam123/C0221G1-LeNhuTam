import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './customer/list/list.component';
import { CreateComponent } from './customer/create/create.component';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import { NavbarComponent } from './navbar/navbar.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDialogModule} from '@angular/material/dialog';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import { DialogDeleteComponent } from './customer/dialog-delete/dialog-delete.component';
import { UpdateComponent } from './customer/update/update.component';
import { ViewComponent } from './customer/view/view.component';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    CreateComponent,
    EmployeeListComponent,
    NavbarComponent,
    DialogDeleteComponent,
    UpdateComponent,
    ViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    MatDialogModule,
    NgxPaginationModule,
    BrowserAnimationsModule,
    Ng2SearchPipeModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
