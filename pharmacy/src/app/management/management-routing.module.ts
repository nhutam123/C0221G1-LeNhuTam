import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';




const routes: Routes = [
  {
    path: 'sale-retail',
    loadChildren: () => import('./sale-retail/sale-retail.module').then(module => module.SaleRetailModule)
  },
  {
    path: 'common',
    loadChildren: () => import('./common/common.module').then(module => module.CommonModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ManagementRoutingModule { }
