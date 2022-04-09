import { TestBed } from '@angular/core/testing';

import { DeleteDataByIdService } from './delete-data-by-id.service';

describe('DeleteDataByIdService', () => {
  let service: DeleteDataByIdService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DeleteDataByIdService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
