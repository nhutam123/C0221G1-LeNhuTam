import {Component, OnInit, inject, Inject, Output, EventEmitter} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {StudentServiceService} from '../service/student-service.service';
import {HttpClient} from '@angular/common/http';
import {NavigationExtras, Router} from '@angular/router';
import {PatientService} from '../service/patient.service';


@Component({
  selector: 'app-dialog-delete',
  templateUrl: './dialog-delete.component.html',
  styleUrls: ['./dialog-delete.component.css']
})
export class DialogDeleteComponent implements OnInit {
  @Output() deleteStudent = new EventEmitter();
  constructor(@Inject(MAT_DIALOG_DATA) public data,
              private patientService: PatientService,
              private http: HttpClient ,
              private router: Router) { }

  ngOnInit(): void {
  }

  delete(id: any) {
    this.patientService.delete(id).subscribe();
  }
}
