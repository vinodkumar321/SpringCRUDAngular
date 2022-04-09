import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FetchDataByIdComponent } from './fetch-data-by-id.component';

describe('FetchDataByIdComponent', () => {
  let component: FetchDataByIdComponent;
  let fixture: ComponentFixture<FetchDataByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FetchDataByIdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FetchDataByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
