import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { RouterModule } from '@angular/router';

import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Customer } from './customer';
import { CustomerService } from './customer.service';
import { TradingInfoService } from './services/trading-info.service';
import { TradingInfoComponent } from './trading-info/trading-info.component';


@NgModule({
  declarations: [
    AppComponent,
    TradingInfoComponent
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormBuilder,
    FormGroup,
    Validators
  ],
  providers: [CustomerService,
    TradingInfoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
