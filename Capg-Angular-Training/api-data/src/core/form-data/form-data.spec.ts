import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormData } from './form-data';

describe('FormData', () => {
  let component: FormData;
  let fixture: ComponentFixture<FormData>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormData],
    }).compileComponents();

    fixture = TestBed.createComponent(FormData);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
