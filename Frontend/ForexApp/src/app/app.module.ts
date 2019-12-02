import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { TradingbookComponent } from './tradingbook/tradingbook.component';
import { TradininfoComponent } from './tradininfo/tradininfo.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router'

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    TradingbookComponent,
    TradininfoComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
