import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './management/home/home.component';
import {RetailSaleComponent} from './management/retail-sale/retail-sale/retail-sale.component';
import {PrescriptionComponent} from './management/retail-sale/prescription/prescription.component';
import {PrescriptionDetailComponent} from './management/retail-sale/prescription-detail/prescription-detail.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'retail-sale', component: RetailSaleComponent},
  {path: 'prescription', component: PrescriptionComponent},
  {path: 'prescription-detail/:id', component: PrescriptionDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
