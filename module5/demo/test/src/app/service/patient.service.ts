import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
private URL = 'http://localhost:3000/patients';
  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(this.URL);
  }

  save(value): Observable<any> {
   return  this.http.post(this.URL, value);
  }

  delete(id: any): Observable<any> {
    return this.http.delete(`${this.URL}/${id}`);
  }

  update(id, patient): Observable<any> {
    return this.http.patch(`${this.URL}/${id}`, patient);
    console.log(id, patient);
  }
}
