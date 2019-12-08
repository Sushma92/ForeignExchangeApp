import { Injectable } from '@angular/core';
import { TradingInfo } from '../trading-info/trading-info';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class TradingInfoService {
  private tradingInfoUrl : string;

  constructor(private http : HttpClient) {
    this.tradingInfoUrl = 'http://localhost:8080/trading-info';
   }

   public findAll(): Observable<TradingInfo[]>{
     return this.http.get<TradingInfo[]>(this.tradingInfoUrl);
   }

   public save(tradingInfo: TradingInfo){
     return this.http.post<TradingInfo>(this.tradingInfoUrl, TradingInfo);
   }
}
