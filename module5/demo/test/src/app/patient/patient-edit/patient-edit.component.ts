import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Patient} from '../../model/patient';
import {PatientService} from '../../service/patient.service';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';

@Component({
  selector: 'app-patient-edit',
  templateUrl: './patient-edit.component.html',
  styleUrls: ['./patient-edit.component.css']
})
export class PatientEditComponent implements OnInit {
  PatientFormn: FormGroup;
  patient: Patient;

  constructor(private patientService: PatientService,
              @Inject(MAT_DIALOG_DATA) public data) {
    this.PatientFormn = new FormGroup({
      id: new FormControl(this.data.patient.id, []),
      name: new FormControl(this.data.patient.name, [Validators.required, Validators.pattern('[^0-9]+')]),
      patientCode: new FormControl(this.data.patient.patientCode, [Validators.required]),
      medicalRecordCode: new FormControl(this.data.patient.medicalRecordCode, [Validators.required]),
      startTime: new FormControl(this.data.patient.startTime, [Validators.required]),
      endTime: new FormControl(this.data.patient.endTime, [Validators.required]),
      reason: new FormControl(this.data.patient.reason, [Validators.required]),
      method: new FormControl(this.data.patient.method, [Validators.required]),
      doctor: new FormControl(this.data.patient.doctor, [Validators.required])
    });
  }

  ngOnInit(): void {
  }

  edit() {
    if (this.PatientFormn.valid) {
      this.patient = this.PatientFormn.value;
      this.patientService.update(this.patient.id, this.patient).subscribe();
    }
  }
}
