import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Pageinfo } from './pageinfo';

describe('Pageinfo', () => {
  let component: Pageinfo;
  let fixture: ComponentFixture<Pageinfo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Pageinfo],
    }).compileComponents();

    fixture = TestBed.createComponent(Pageinfo);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
