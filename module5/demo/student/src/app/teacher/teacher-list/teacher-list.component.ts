import { Component, OnInit } from '@angular/core';
import {TeacherService} from '../../service/teacher.service';
import {Teacher} from '../../model/teacher';

@Component({
  selector: 'app-teacher-list',
  templateUrl: './teacher-list.component.html',
  styleUrls: ['./teacher-list.component.css']
})
export class TeacherListComponent implements OnInit {
  teachers: Teacher[] = [];
  config: any;
  searchText: any;
  data: any;
  constructor(private teacherService: TeacherService) {
    this.config = {
      itemsPerPage: 3,
      currentPage: 1
    };
  }

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.teacherService.getAll().subscribe(next => {
      this.teachers = next;
      console.log(this.teachers);
    });
  }

  openDialog(id: any, name: any) {
  }

  openDialog1(id: any, name: any) {
  }

  openEditDialog(id: any, name: any) {
  }

  pageChanged($event: number) {
  }
}
