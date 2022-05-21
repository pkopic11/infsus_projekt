import {TestBed} from '@angular/core/testing';

import {DogadajService} from './dogadaj.service';
import {HttpClientTestingModule} from "@angular/common/http/testing";

describe('DogadajService', () => {
  let service: DogadajService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    service = TestBed.inject(DogadajService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
