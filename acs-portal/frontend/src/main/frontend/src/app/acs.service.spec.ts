import { TestBed, inject } from '@angular/core/testing';

import { AcsService } from './acs.service';

describe('AcsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AcsService]
    });
  });

  it('should be created', inject([AcsService], (service: AcsService) => {
    expect(service).toBeTruthy();
  }));
});
