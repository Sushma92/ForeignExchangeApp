import { TestBed } from '@angular/core/testing';

import { TradingInfoService } from './trading-info.service';

describe('TradingInfoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TradingInfoService = TestBed.get(TradingInfoService);
    expect(service).toBeTruthy();
  });
});
