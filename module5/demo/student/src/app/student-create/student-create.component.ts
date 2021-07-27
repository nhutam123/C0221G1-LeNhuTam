import { Component, OnInit } from '@angular/core';
import {StudentServiceService} from '../service/student-service.service';
import {Student} from '../model/student';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {
  id: number;
  name: string;
  dateOfBirth: string;
  student: any;
  constructor(private studentServiceService: StudentServiceService) {
    this.student = new FormGroup( {
      name: new FormControl('' , []),
      id: new FormControl('' , []),
      dateOfBirth: new FormControl('', [])
    });
  }

  ngOnInit(): void {
  }

  create(): void {
    this.studentServiceService.save(this.student.value);

  }
}
