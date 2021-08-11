import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CarService {
  private URL = 'http://localhost:3000/cars';
  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(this.URL);
  }
  create(car): Observable<any> {
    return this.http.post(this.URL, car);
  }
  delete(id): Observable<any> {
    return this.http.delete(`${this.URL}/${id}`);
  }
  edit(car , id): Observable<any> {
    return this.http.patch(`${this.URL}/${id}`, car);
  }
}
