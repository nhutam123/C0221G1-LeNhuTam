import { Component, OnInit } from '@angular/core';
import {StudentServiceService} from '../../service/student-service.service';
import {FormControl, FormGroup} from '@angular/forms';
import {NavigationExtras, Route, Router} from '@angular/router';
import {HttpClient} from '@angular/common/http';
import {Teacher} from '../../model/teacher';
import {TeacherService} from '../../service/teacher.service';
import {Validators} from '@angular/forms';

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {
  teachers: Teacher[] = [];
  teacher = null;
  studentForm: FormGroup;
  constructor(private studentServiceService: StudentServiceService,
              private router: Router, private http: HttpClient,
              private teacherService: TeacherService) {
  }

  ngOnInit(): void {
    this.studentForm = new FormGroup( {
      name: new FormControl('' , [Validators.required, Validators.minLength(6)]),
      dateOfBirth: new FormControl('', [Validators.required]),
      teacher: new FormControl(this.teacher, [Validators.required])
    });
    this.teacherService.getAll().subscribe(next => {
      this.teachers = next;
    });
    console.log(this.studentForm);
  }

  create(): void {
    this.studentServiceService.save(this.studentForm.value).subscribe(() => {
      const navigationExtras: NavigationExtras = {state: {data: 'success'}};
      this.router.navigate(['/list'], navigationExtras);
    });
  }
}
