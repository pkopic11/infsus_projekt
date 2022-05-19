import { TestBed } from '@angular/core/testing';

import { MjestoService } from './mjesto.service';

describe('MjestoService', () => {
  let service: MjestoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MjestoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
