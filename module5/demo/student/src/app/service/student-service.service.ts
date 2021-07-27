import { Injectable } from '@angular/core';
import {Student} from '../model/student';

@Injectable({
  providedIn: 'root'
})
export class StudentServiceService {
  students: Student[] = [{
    id: 1 , name: 'tam' , dateOfBirth: '1993-05-15' } ,
    {id: 2 , name: 'tấn' , dateOfBirth: '1990-04-03'},
    {id: 3 , name: 'hiếu' , dateOfBirth: '1995-04-03'},
    {id: 4 , name: 'hiếu' , dateOfBirth: '1995-04-03'},
    {id: 5 , name: 'hiếu' , dateOfBirth: '1995-04-03'}] ;
  constructor() { }
  getAll() {
    return this.students;
  }
  save(student: Student): void {
    this.students.push(student);
  }
  delete(id: string): void {
    for (let i = 0; i < this.students.length; i++ ) {
      // @ts-ignore
      if ( this.students[i].id === id) {
        this.students.splice(i, 1);
      }
    }
  }
}
