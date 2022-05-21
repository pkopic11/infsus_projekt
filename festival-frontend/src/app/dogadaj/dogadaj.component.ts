import {Component, OnInit} from '@angular/core';
import {Dogadaj} from "../shared/model/dogadaj";
import {DogadajService} from "../shared/service/dogadaji/dogadaj.service";

@Component({
  selector: 'app-dogadaj',
  templateUrl: './dogadaj.component.html',
  styleUrls: ['./dogadaj.component.scss']
})
export class DogadajComponent implements OnInit{

  dogadaji: Dogadaj[] = [];

  constructor(
    private dogadajService: DogadajService) {
    this.getDogadaj()
  }

  ngOnInit() {
  }

  getDogadaj(){
    this.dogadajService.findAll().subscribe(
      (resp) => {
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

  searchDogadaj(key: string){
    const results: Dogadaj[] = [];
    for(const event of this.dogadaji){
      if(event.naziv.toLowerCase().indexOf(key.toLowerCase()) != -1
      || event.mjesto.naziv.toLowerCase().indexOf(key.toLowerCase()) != -1){
        results.push(event);
      }
    }
    this.dogadaji = results;
    if(results.length === 0 || !key){
      this.getDogadaj();
    }
  }

  searchDogadajByYear(key: string){
    console.log(key)
    const results: Dogadaj[] = [];
    for(const event of this.dogadaji){
      if(event.datumPocetka.indexOf(key) != -1){
        results.push(event);
      }
    }
    this.dogadaji = results;
    if(results.length === 0 || !key){
      this.getDogadaj();
    }
  }



}
