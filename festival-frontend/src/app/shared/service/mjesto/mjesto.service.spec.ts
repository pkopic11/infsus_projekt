import {TestBed} from '@angular/core/testing';

import {MjestoService} from './mjesto.service';
import {HttpClientTestingModule} from "@angular/common/http/testing";

describe('MjestoService', () => {
  let service: MjestoService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    service = TestBed.inject(MjestoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
