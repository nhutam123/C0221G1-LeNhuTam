import {Component, OnInit} from '@angular/core';
import {Patient} from '../../model/patient';
import {PatientService} from '../../service/patient.service';
import {DialogDeleteComponent} from '../../dialog-delete/dialog-delete.component';
import {MatDialog} from '@angular/material/dialog';
import {StudentEditComponent} from '../../student/student-edit/student-edit.component';
import {PatientEditComponent} from '../patient-edit/patient-edit.component';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit {
  patients: Patient[] = [];
  config: any;

  constructor(private patientService: PatientService,
              private dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.patientService.getAll().subscribe(next => {
      this.patients = next;
    });
    this.config = {
      itemsPerPage: 3,
      currentPage: 1
    };
    console.log(this.patients);
  }

  openDeleteDialog(patient) {
    const dialog = this.dialog.open(DialogDeleteComponent, {
      height: '250px', width: '300px',
      data: {patient}
    });
    dialog.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }
  openEditDialog(patient: Patient) {
    const dialog1 = this.dialog.open(PatientEditComponent, {
      height: '530px', width: '500px',
      data: {patient}
    });
    dialog1.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }

  pageChanged(event: number) {
    this.config.currentPage = event;
  }

  openDialog1(patient: Patient) {
  }
}
