import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TeacherService {
  private  url = 'http://localhost:3000/teachers';
  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get(this.url);
  }
  search(searchText): Observable<any> {
    return this.http.get(this.url + 'name_like=' + searchText);
  }
}
