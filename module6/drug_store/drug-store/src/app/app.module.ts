import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './management/home/home.component';
import { NavbarComponent } from './management/navbar/navbar.component';
import { ContentComponent } from './management/home/content/content.component';
import { RetailSaleComponent } from './management/retail-sale/retail-sale/retail-sale.component';
import { PrescriptionComponent } from './management/retail-sale/prescription/prescription.component';
import { PrescriptionDetailComponent } from './management/retail-sale/prescription-detail/prescription-detail.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDialogModule} from '@angular/material/dialog';
import { DeleteDialogComponent } from './management/retail-sale/delete-dialog/delete-dialog.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AddDrugComponent } from './management/retail-sale/add-drug/add-drug.component';
import {ManagementModule} from './management/management.module';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatDialogModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    ManagementModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
