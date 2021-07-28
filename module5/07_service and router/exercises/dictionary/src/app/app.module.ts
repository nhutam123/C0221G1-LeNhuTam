import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DictionaryListComponent } from './dictionary/dictionary-list/dictionary-list.component';
import { DetailComponent } from './dictionary/detail/detail.component';
import { DictionaryCreateComponent } from './ditionary/dictionary-create/dictionary-create.component';
import { CreateComponent } from './dictionary/create/create.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDialog, MatDialogModule} from '@angular/material/dialog';
import { ViewComponent } from './dictionary/view/view.component';

@NgModule({
  declarations: [
    AppComponent,
    DictionaryListComponent,
    DetailComponent,
    DictionaryCreateComponent,
    CreateComponent,
    ViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatDialogModule,
    BrowserAnimationsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
