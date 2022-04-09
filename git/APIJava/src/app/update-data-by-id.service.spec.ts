import { TestBed } from '@angular/core/testing';

import { UpdateDataByIdService } from './update-data-by-id.service';

describe('UpdateDataByIdService', () => {
  let service: UpdateDataByIdService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UpdateDataByIdService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
