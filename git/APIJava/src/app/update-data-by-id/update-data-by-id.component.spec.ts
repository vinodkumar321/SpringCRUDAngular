import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateDataByIdComponent } from './update-data-by-id.component';

describe('UpdateDataByIdComponent', () => {
  let component: UpdateDataByIdComponent;
  let fixture: ComponentFixture<UpdateDataByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateDataByIdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateDataByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
