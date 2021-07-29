import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {FormControl, FormGroup} from '@angular/forms';
import {StudentServiceService} from '../service/student-service.service';
import {Student} from '../model/student';

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.css']
})
export class StudentEditComponent implements OnInit {
studentForm: any;
student: Student;
  constructor(@Inject(MAT_DIALOG_DATA) public data,
              private studentServiceService: StudentServiceService,
              ) {
    this.studentForm = new FormGroup( {
      id: new FormControl('', []),
      name: new FormControl('' , []),
      dateOfBirth: new FormControl('', [])
    });

  }

  ngOnInit(): void {
  }

  update() {
    this.student = this.studentForm.value;
    this.studentServiceService.update(this.student.id , this.student ).subscribe(() => {
    });
  }
}
