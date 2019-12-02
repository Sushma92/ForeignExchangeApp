import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TradininfoComponent } from './tradininfo.component';

describe('TradininfoComponent', () => {
  let component: TradininfoComponent;
  let fixture: ComponentFixture<TradininfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TradininfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TradininfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
