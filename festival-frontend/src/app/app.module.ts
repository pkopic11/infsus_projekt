import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DogadajComponent } from './dogadaj/dogadaj.component';
import {HttpClientModule} from "@angular/common/http";
import { DodajDogadajComponent } from './dodaj-dogadaj/dodaj-dogadaj.component';

@NgModule({
  declarations: [
    AppComponent,
    DogadajComponent,
    DodajDogadajComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
