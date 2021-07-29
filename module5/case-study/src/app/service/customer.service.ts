import { Injectable } from '@angular/core';
import {Customer} from '../model/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customers: Customer[] = [
    {id: 1, name: 'tam', dateOfBirth: '1993-05-15'},
    {id: 2, name: 'tấn', dateOfBirth: '1990-04-03'},
    {id: 3, name: 'hiếu', dateOfBirth: '1995-04-03'},
    {id: 4, name: 'hiếu', dateOfBirth: '1995-04-03'},
    {id: 5, name: 'hiếu', dateOfBirth: '1995-04-03'}
    ];

  constructor() { }
  getAll() {
    return this.customers;
  }
  save(customer) {
    this.customers.push(customer);
  }
  delete(id: string): void {
    for (let i = 0; i < this.customers.length; i++ ) {
      // @ts-ignore
      if ( this.customers[i].id === id) {
        this.customers.splice(i, 1);
      }
    }
  }
  update(customer) {
    for (let i = 0; i < this.customers.length; i++) {
      if (this.customers[i].id === customer.id) {
        this.customers.splice(i, 1 , customer);
      }
    }
  }
}
