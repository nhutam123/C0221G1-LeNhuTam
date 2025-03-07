import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProducerService {
  private URl = 'http://localhost:3000/producers';

  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(this.URl);
  }
}
