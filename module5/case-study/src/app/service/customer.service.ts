import { Injectable } from '@angular/core';
import {Customer} from '../model/customer';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customers: Customer[] = [];
  private URL = 'http://localhost:3000/customers';
  constructor(private Http: HttpClient) { }
  getAll(): Observable<any> {
    return this.Http.get(this.URL);
  }
  save(customer): Observable<any> {
    return this.Http.post(this.URL, customer);
  }
  delete(id: string): Observable<any> {
    return this.Http.delete(`${this.URL}/${id}`);
  }
  update(customer): Observable<any> {
    return this.Http.patch(`${this.URL}/${customer.id}`, customer);
  }

  search(searchText, dateFrom, dateTo): Observable<any> {
    if (dateFrom === undefined) {
      dateFrom = '1000-12-12';
    }
    return this.Http.get(this.URL +  '?dateOfBirth_gte=' + dateFrom + '&dateOfBirth_lte=' + dateTo + '&name_like=' + searchText );
    // return this.http.get(this.url +  '?dateOfBirth_gte=' + dateFrom + '&dateOfBirth_lte=' + dateTo  );

  }
}
