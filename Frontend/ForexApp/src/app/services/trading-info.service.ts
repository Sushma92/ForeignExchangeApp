import { Injectable } from '@angular/core';
import { TradingInfo } from '../trading-info/trading-info';

@Injectable()
export class TradingInfoService {
  private tradeInfoUrl : string;

  constructor(private http : HttpClient) {
    this.tradingInfoUrl = 'http://localhost:7000/customers';
   }

   public findAll() Observable<Customer[]>{
     return this.http.get<Customer[]>(this.tradingInfoUrl);
   }

   public save(tradingInfo : TradingInfo){
     return this.http.post<Customer[]>(this.tradingInfoUrl, TradingInfo);
   }
}
