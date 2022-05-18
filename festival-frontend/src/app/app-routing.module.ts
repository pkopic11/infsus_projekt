import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {DodajDogadajComponent} from "./dodaj-dogadaj/dodaj-dogadaj.component";
import {DogadajComponent} from "./dogadaj/dogadaj.component";

const routes: Routes = [
  {path: 'dodaj', component: DodajDogadajComponent},
  {path: '', component: DogadajComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
