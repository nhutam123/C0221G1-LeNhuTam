import { Component, OnInit } from '@angular/core';
import {StudentServiceService} from '../../service/student-service.service';
import {Student} from '../../model/student';
import {FormControl, FormGroup} from '@angular/forms';
import {NavigationExtras, Route, Router} from '@angular/router';
import {HttpClient} from '@angular/common/http';
import {Teacher} from '../../model/teacher';
import {TeacherService} from '../../service/teacher.service';

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {
  teachers: Teacher[] = [];
  student: any;
  constructor(private studentServiceService: StudentServiceService,
              private router: Router, private http: HttpClient,
              private teacherService: TeacherService) {
    this.student = new FormGroup( {
      name: new FormControl('' , []),
      dateOfBirth: new FormControl('', []),
      teacher: new FormControl('', [])
    });

  }

  ngOnInit(): void {
    this.teacherService.getAll().subscribe(next => {
      this.teachers = next;
    });
  }

  create(): void {
    this.studentServiceService.save(this.student.value).subscribe(() => {
      const navigationExtras: NavigationExtras = {state: {data: 'success'}};
      this.router.navigate(['/list'], navigationExtras);
    });
  }
}
