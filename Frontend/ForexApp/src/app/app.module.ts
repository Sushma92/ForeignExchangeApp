import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { TradingbookComponent } from './tradingbook/tradingbook.component';
import { TradininfoComponent } from './tradininfo/tradininfo.component';

import { RouterModule } from '@angular/router';

import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    TradingbookComponent,
    TradininfoComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormBuilder,
    FormGroup,
    Validators
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
