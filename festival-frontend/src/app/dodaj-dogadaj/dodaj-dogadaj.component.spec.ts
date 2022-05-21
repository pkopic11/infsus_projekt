import {ComponentFixture, TestBed} from '@angular/core/testing';

import {DodajDogadajComponent} from './dodaj-dogadaj.component';
import {HttpClientTestingModule} from "@angular/common/http/testing";
import {RouterTestingModule} from "@angular/router/testing";
import {FormsModule} from "@angular/forms";

describe('DodajDogadajComponent', () => {
  let component: DodajDogadajComponent;
  let fixture: ComponentFixture<DodajDogadajComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DodajDogadajComponent ],
      imports: [HttpClientTestingModule, RouterTestingModule, FormsModule]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DodajDogadajComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
