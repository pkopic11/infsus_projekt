import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UrediDogadajComponent } from './uredi-dogadaj.component';

describe('UrediDogadajComponent', () => {
  let component: UrediDogadajComponent;
  let fixture: ComponentFixture<UrediDogadajComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UrediDogadajComponent ]
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
