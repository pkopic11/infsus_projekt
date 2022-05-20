import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {Mjesto} from "../../shared/model/mjesto";
import {Dogadaj} from "../../shared/model/dogadaj";
import {DogadajService} from "../../shared/service/dogadaji/dogadaj.service";
import {MjestoService} from "../../shared/service/mjesto/mjesto.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-uredi-dogadaj',
  templateUrl: './uredi-dogadaj.component.html',
  styleUrls: ['./uredi-dogadaj.component.css']
})
export class UrediDogadajComponent implements OnInit {

  form!: FormGroup;
  mjesta!: Mjesto[];
  odabranoMjesto!: Mjesto;

  constructor(private dogadajService: DogadajService,
              private mjestoService: MjestoService,
              private formBuilder: FormBuilder,
              private route: ActivatedRoute,
              private router: Router) { }

  ngOnInit(): void {
    this.mjestoService.findAll().subscribe(
      (value) => {
        this.mjesta = value;
      }
    );

    this.form = this.formBuilder.group({
      id: this.formBuilder.control(''),
      naziv: this.formBuilder.control(''),
      trajanjeDani: this.formBuilder.control(''),
      brojUlaznica: this.formBuilder.control(''),
      datumPocetka: this.formBuilder.control(''),
      mjesto: this.formBuilder.control(''),
    });

    this.route.paramMap.subscribe(params => {
      const id = params.get('id');

      if(id){
        this.dogadajService.findById(id).subscribe((result: Dogadaj) => {
          this.form.controls['id'].setValue(result.id);
          this.form.controls['naziv'].setValue(result.naziv);
          this.form.controls['trajanjeDani'].setValue(result.trajanjeDani);
          this.form.controls['brojUlaznica'].setValue(result.brojUlaznica);
          this.form.controls['datumPocetka'].setValue(result.datumPocetka);
          this.form.controls['mjesto'].setValue(this.odabranoMjesto);
        });
      }
    });
  }

  updateDogadaj(){
    console.log(this.form.getRawValue())
    this.dogadajService.updateDogadaj(this.form.getRawValue()).subscribe();
    this.form.reset();
    this.router.navigate(['']);
  }

}
