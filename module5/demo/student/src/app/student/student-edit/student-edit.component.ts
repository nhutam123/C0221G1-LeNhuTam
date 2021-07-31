import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {FormControl, FormGroup} from '@angular/forms';
import {StudentServiceService} from '../../service/student-service.service';
import {Student} from '../../model/student';
import {Teacher} from '../../model/teacher';
import {TeacherService} from '../../service/teacher.service';

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.css']
})
export class StudentEditComponent implements OnInit {
studentForm: any;
student: Student;
  teachers: Teacher[] = [];
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
  constructor(@Inject(MAT_DIALOG_DATA) public data,
              private studentServiceService: StudentServiceService,
              private teacherService: TeacherService
              ) {
    this.studentForm = new FormGroup( {
      id: new FormControl(data.id, []),
      name: new FormControl(data.name , []),
      dateOfBirth: new FormControl(data.dateOfBirth, []),
      teacher: new FormControl(data.teacher, [])
    });

  }

  ngOnInit(): void {
    this.teacherService.getAll().subscribe(next => {
      this.teachers = next;
    });
  }

  update() {
    this.student = this.studentForm.value;
    this.studentServiceService.update(this.student.id , this.student ).subscribe(() => {
    });
  }

}
