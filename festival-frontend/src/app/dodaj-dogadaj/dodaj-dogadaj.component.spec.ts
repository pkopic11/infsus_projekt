import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DodajDogadajComponent } from './dodaj-dogadaj.component';

describe('DodajDogadajComponent', () => {
  let component: DodajDogadajComponent;
  let fixture: ComponentFixture<DodajDogadajComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DodajDogadajComponent ]
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
