import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DogadajComponent } from './dogadaj/dogadaj.component';
import {HttpClientModule} from "@angular/common/http";
import { DodajDogadajComponent } from './dodaj-dogadaj/dodaj-dogadaj.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { UrediDogadajComponent } from './uredi-dogadaj/uredi-dogadaj/uredi-dogadaj.component';

@NgModule({
  declarations: [
    AppComponent,
    DogadajComponent,
    DodajDogadajComponent,
    UrediDogadajComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
