import { Component, OnInit } from '@angular/core';
import {StudentServiceService} from '../service/student-service.service';
import {Student} from '../model/student';
import {FormControl, FormGroup} from '@angular/forms';
import {NavigationExtras, Route, Router} from '@angular/router';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {

  student: any;
  constructor(private studentServiceService: StudentServiceService, private router: Router, private http: HttpClient) {
    this.student = new FormGroup( {
      name: new FormControl('' , []),
      dateOfBirth: new FormControl('', [])
    });

  }

  ngOnInit(): void {
  }

  create(): void {
    this.studentServiceService.save(this.student.value).subscribe(() => {
      const navigationExtras: NavigationExtras = {state: {data: 'success'}};
      this.router.navigate(['/list'], navigationExtras);
    });
  }
}
