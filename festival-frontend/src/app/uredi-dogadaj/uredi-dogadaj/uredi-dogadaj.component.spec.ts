import {ComponentFixture, TestBed} from '@angular/core/testing';

import {UrediDogadajComponent} from './uredi-dogadaj.component';
import {HttpClientTestingModule} from "@angular/common/http/testing";
import {RouterTestingModule} from "@angular/router/testing";
import {FormBuilder} from "@angular/forms";

describe('UrediDogadajComponent', () => {
  let component: UrediDogadajComponent;
  let fixture: ComponentFixture<UrediDogadajComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UrediDogadajComponent ],
      imports: [HttpClientTestingModule, RouterTestingModule],
      providers: [
        FormBuilder
      ],
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UrediDogadajComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
