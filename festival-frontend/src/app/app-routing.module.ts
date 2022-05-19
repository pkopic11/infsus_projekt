import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {DodajDogadajComponent} from "./dodaj-dogadaj/dodaj-dogadaj.component";
import {DogadajComponent} from "./dogadaj/dogadaj.component";
import {UrediDogadajComponent} from "./uredi-dogadaj/uredi-dogadaj/uredi-dogadaj.component";

const routes: Routes = [
  {path: '', component: DogadajComponent},
  {path: 'dodaj', component: DodajDogadajComponent},
  {path: 'uredi/:id', component: UrediDogadajComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
