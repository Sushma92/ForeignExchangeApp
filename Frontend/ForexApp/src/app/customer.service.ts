import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Customer } from './customer';
import { Observable } from 'rxjs';

@Injectable()
export class CustomerService {

  private customersUrl : string;

  constructor(private http : HttpClient) {
    this.customersUrl = 'http://localhost:7000/customers';
   }

   public findAll() Observable<Customer[]>{
     return this.http.get<Customer[]>(this.customersUrl);
   }

   public save(customer : Customer){
     return this.http.post<Customer[]>(this.customersUrl, customer);
   }
}
