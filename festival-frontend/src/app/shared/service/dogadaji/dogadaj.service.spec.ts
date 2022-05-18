import { TestBed } from '@angular/core/testing';

import { DogadajService } from './dogadaj.service';

describe('DogadajService', () => {
  let service: DogadajService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DogadajService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
