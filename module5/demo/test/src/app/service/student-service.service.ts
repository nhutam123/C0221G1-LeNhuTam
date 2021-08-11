import { Injectable } from '@angular/core';
import {Student} from '../model/student';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentServiceService {
  public url = 'http://localhost:8080/list';
  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(this.url);
  }
  save(student: Student): Observable<any> {
     return   this.http.post(this.url, student);
  }
  delete(id: any): Observable<any> {
    return this.http.delete(`${this.url}/${id}`);
  }
  update(id , student): Observable<any> {
    return this.http.patch(`${this.url}/${id}`, student);
  }
  search(searchText, dateFrom , dateTo, id): Observable<any> {
    if (dateFrom === undefined) {
      dateFrom = '1000-12-12';
    }
    // tslint:disable-next-line:max-line-length
    return this.http.get(this.url +  '?dateOfBirth_gte=' + dateFrom + '&dateOfBirth_lte=' + dateTo + '&name_like=' + searchText
    + '&teacher.id_like=' + id);
    // return this.http.get(this.url +  '?dateOfBirth_gte=' + dateFrom + '&dateOfBirth_lte=' + dateTo  );

  }
}
