import { Component, OnInit } from '@angular/core';
import {Dogadaj} from "../shared/model/dogadaj";
import {DogadajService} from "../shared/service/dogadaji/dogadaj.service";
import {NavigationExtras, Router} from "@angular/router";

@Component({
  selector: 'app-dogadaj',
  templateUrl: './dogadaj.component.html',
  styleUrls: ['./dogadaj.component.scss']
})
export class DogadajComponent implements OnInit{

  dogadaji: Dogadaj[] = [];

  constructor(
    private dogadajService: DogadajService,
    private router: Router) {

  }

  ngOnInit() {
    this.dogadajService.findAll().subscribe(
      (resp) => {
        console.log(resp);
        this.dogadaji = resp;
      },
      (err) => {
        console.log(err);
      }
    )
  }

  deleteDogadaji(dogadaj: Dogadaj){
    this.dogadaji = this.dogadaji.filter(d => d !== dogadaj);
    console.log(dogadaj);
    this.dogadajService.deleteDogadaj(dogadaj.id).subscribe();
  }


}
