import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TradingbookComponent } from './tradingbook.component';

describe('TradingbookComponent', () => {
  let component: TradingbookComponent;
  let fixture: ComponentFixture<TradingbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TradingbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TradingbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
