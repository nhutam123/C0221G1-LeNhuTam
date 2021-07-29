import {Component, OnInit, inject, Inject, Output, EventEmitter} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {StudentServiceService} from '../service/student-service.service';
import {HttpClient} from '@angular/common/http';
import {NavigationExtras, Router} from '@angular/router';
import {Student} from '../model/student';

@Component({
  selector: 'app-dialog-delete',
  templateUrl: './dialog-delete.component.html',
  styleUrls: ['./dialog-delete.component.css']
})
export class DialogDeleteComponent implements OnInit {
  @Output() deleteStudent = new EventEmitter();
  // tslint:disable-next-line:max-line-length
  constructor(@Inject(MAT_DIALOG_DATA) public data,
              private studentServiceService: StudentServiceService ,
              private http: HttpClient ,
              private router: Router) { }

  ngOnInit(): void {
  }

  delete(id: any) {
    this.studentServiceService.delete(id).subscribe();
  }
}
