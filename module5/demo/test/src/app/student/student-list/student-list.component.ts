import { Component, OnInit } from '@angular/core';
import {Student} from '../../model/student';
import {MatDialog, MatDialogRef} from '@angular/material/dialog';
import {DialogDeleteComponent} from '../../dialog-delete/dialog-delete.component';
import {StudentServiceService} from '../../service/student-service.service';
import {DialogViewComponent} from '../../dialog-view/dialog-view.component';
import {NavigationExtras, Router} from '@angular/router';
import {StudentEditComponent} from '../student-edit/student-edit.component';
import {TeacherService} from '../../service/teacher.service';
import {Teacher} from '../../model/teacher';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  student: Student ;
  teachers: Teacher[] = [];
  // @ts-ignore

  // tslint:disable-next-line:no-unused-expression
  students: Student[];
  config: any;
  searchText = '';
  data = '';
  dateFrom: string;
  dateTo: string ;
  type = null;
  id = '';
  constructor(public dialog: MatDialog ,
              private studentServiceService: StudentServiceService,
              private router: Router,
              private teacherService: TeacherService) {
    this.config = {
      itemsPerPage: 3,
      currentPage: 1
    };
    const state = this.router.getCurrentNavigation().extras.state as {data: string};
    if (state != null) {
      this.data = state.data;
    }
  }
  pageChanged(event) {
    this.config.currentPage = event;
  }
  ngOnInit(): void {
    this.getAll();
    this.getAllTeach();
  }

  create() {

  }

  openDialog(id , name) {
    const dialog = this.dialog.open(DialogDeleteComponent , {
      height: '250px' , width: '300px',
      data: {id , name}
    });
    dialog.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }

  openDialog1(id: number, name: string, dateOfBirth: string , teacher) {
    const dialog1 = this.dialog.open(DialogViewComponent , {
      height: '350px' , width: '430px' ,
      data: {id , name , dateOfBirth , teacher}
    });
  }
  getAll() {
     this.studentServiceService.getAll().subscribe(next => {
      this.students = next;
    });
  }
  getAllTeach() {
    this.teacherService.getAll().subscribe(next => {
      this.teachers = next;
    });
  }

  openEditDialog(student) {
    const dialog1 = this.dialog.open(StudentEditComponent , {
      height: '370px' , width: '400px' ,
      data: {student}
    });
    dialog1.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }

  search() {
    if (this.type === null) {
      this.id = '';
    } else {
      this.id = this.type.id;
    }
    this.studentServiceService.search(this.searchText, this.dateFrom, this.dateTo, this.id).subscribe(next => {
      this.students = next;
      console.log(this.type.id);
    });
  }
}
