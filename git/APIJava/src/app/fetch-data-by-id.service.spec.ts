import { TestBed } from '@angular/core/testing';

import { FetchDataByIdService } from './fetch-data-by-id.service';

describe('FetchDataByIdService', () => {
  let service: FetchDataByIdService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FetchDataByIdService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
