import { Component, OnInit } from '@angular/core';
import { TradingInfo } from './trading-info';
import { TradingInfoService } from '../services/trading-info.service';

@Component({
  selector: 'app-trading-info',
  templateUrl: './trading-info.component.html',
  styleUrls: ['./trading-info.component.css']
})
export class TradingInfoComponent implements OnInit {

  tradingInfo : TradingInfo[];

  constructor(private tradingInfoService : TradingInfoService) {

   }

  ngOnInit() {
    this.tradingInfoService.findAll().subscribe(data => {this.tradingInfo = data;})
  }

}
