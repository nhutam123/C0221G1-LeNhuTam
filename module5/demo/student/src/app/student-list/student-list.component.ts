import { Component, OnInit } from '@angular/core';
import {Student} from '../model/student';
import {MatDialog} from '@angular/material/dialog';
import {DialogDeleteComponent} from '../dialog-delete/dialog-delete.component';
import {StudentServiceService} from '../service/student-service.service';
import {DialogViewComponent} from '../dialog-view/dialog-view.component';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  student: Student ;
  // @ts-ignore

  // tslint:disable-next-line:no-unused-expression
  students: Student[];
  config: any;
  searchText: any;

  constructor(public dialog: MatDialog , private studentServiceService: StudentServiceService) {
    this.config = {
      itemsPerPage: 3,
      currentPage: 1
    };
  }
  pageChanged(event) {
    this.config.currentPage = event;
  }
  ngOnInit(): void {
    this.getAll();
  }

  create() {

  }

  openDialog(id , name) {
    let dialog = this.dialog.open(DialogDeleteComponent , {
      height: '250px' , width: '300px',
      data: {id , name}
    });
  }

  openDialog1(id: number, name: string, dateOfBirth: string) {
    let dialog1 = this.dialog.open(DialogViewComponent , {
      height: '300px' , width: '400px' ,
      data: {id , name , dateOfBirth}
    });
  }
  getAll() {
    this.students = this.studentServiceService.getAll();
  }
}
