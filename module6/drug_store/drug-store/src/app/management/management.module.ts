import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HomeComponent} from './home/home.component';
import {NavbarComponent} from './navbar/navbar.component';
import {ContentComponent} from './home/content/content.component';
import {RetailSaleComponent} from './retail-sale/retail-sale/retail-sale.component';
import {PrescriptionComponent} from './retail-sale/prescription/prescription.component';
import {PrescriptionDetailComponent} from './retail-sale/prescription-detail/prescription-detail.component';
import {DeleteDialogComponent} from './retail-sale/delete-dialog/delete-dialog.component';
import {AddDrugComponent} from './retail-sale/add-drug/add-drug.component';



@NgModule({
  declarations: [
    HomeComponent,
    NavbarComponent,
    ContentComponent,
    RetailSaleComponent,
    PrescriptionComponent,
    PrescriptionDetailComponent,
    DeleteDialogComponent,
    AddDrugComponent
  ],
  exports: [
    ContentComponent,
    NavbarComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ManagementModule { }
