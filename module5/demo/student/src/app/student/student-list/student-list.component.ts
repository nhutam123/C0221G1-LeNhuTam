import { Component, OnInit } from '@angular/core';
import {Student} from '../../model/student';
import {MatDialog, MatDialogRef} from '@angular/material/dialog';
import {DialogDeleteComponent} from '../../dialog-delete/dialog-delete.component';
import {StudentServiceService} from '../../service/student-service.service';
import {DialogViewComponent} from '../../dialog-view/dialog-view.component';
import {NavigationExtras, Router} from '@angular/router';
import {StudentEditComponent} from '../student-edit/student-edit.component';

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
  searchText = '';
  data = '';
  dateFrom: string;
  dateTo: string ;

  constructor(public dialog: MatDialog ,
              private studentServiceService: StudentServiceService,
              private router: Router) {
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

  openEditDialog(id: any, name: any, dateOfBirth: any, teacher) {
    const dialog1 = this.dialog.open(StudentEditComponent , {
      height: '370px' , width: '400px' ,
      data: {id , name , dateOfBirth, teacher}
    });
    dialog1.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }

  search() {
    this.studentServiceService.search(this.searchText, this.dateFrom, this.dateTo).subscribe(next => {
      this.students = next;
      console.log(this.students);
    });
  }
}
