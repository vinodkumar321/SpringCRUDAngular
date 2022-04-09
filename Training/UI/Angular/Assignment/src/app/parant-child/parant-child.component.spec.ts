import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParantChildComponent } from './parant-child.component';

describe('ParantChildComponent', () => {
  let component: ParantChildComponent;
  let fixture: ComponentFixture<ParantChildComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ParantChildComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ParantChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
