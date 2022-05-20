import {Component, OnInit} from '@angular/core';
import {Dogadaj} from "../shared/model/dogadaj";
import {Mjesto} from "../shared/model/mjesto";
import {DogadajService} from "../shared/service/dogadaji/dogadaj.service";
import {MjestoService} from "../shared/service/mjesto/mjesto.service";
import {Router} from "@angular/router";
import {NgForm} from "@angular/forms";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-dodaj-dogadaj',
  templateUrl: './dodaj-dogadaj.component.html',
  styleUrls: ['./dodaj-dogadaj.component.scss']
})
export class DodajDogadajComponent implements OnInit {

  mjesta!: Mjesto[];
  dogadaji!: Dogadaj;
  odabranoMjesto!: Mjesto;

  constructor(private dogadajService: DogadajService,
              private mjestoService: MjestoService,
              private router: Router) {
    this.mjestoService.findAll().subscribe(
      (value) => {
        this.mjesta = value;
      }
    )
  }

  ngOnInit(): void {
  }

  addDogadaj(registerForm: NgForm){
    let d = registerForm.value
    d.mjesto = this.odabranoMjesto;
    this.dogadajService.addDogadaj(d).subscribe(
      (response) => {
        registerForm.reset();
        this.router.navigate(['']);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        registerForm.reset();
      }
    )
  }

}
