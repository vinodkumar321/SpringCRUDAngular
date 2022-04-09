import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteDataByIdComponent } from './delete-data-by-id.component';

describe('DeleteDataByIdComponent', () => {
  let component: DeleteDataByIdComponent;
  let fixture: ComponentFixture<DeleteDataByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteDataByIdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteDataByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
