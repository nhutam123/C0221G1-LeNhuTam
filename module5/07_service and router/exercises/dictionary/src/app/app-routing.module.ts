import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DictionaryListComponent} from './dictionary/dictionary-list/dictionary-list.component';
import {CreateComponent} from './dictionary/create/create.component';


const routes: Routes = [{
  path: 'dictionary/list', component: DictionaryListComponent
},
  {path: 'dictionary/create', component: CreateComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
