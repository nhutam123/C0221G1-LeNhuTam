import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {NavigationExtras, Router} from '@angular/router';
import {PatientService} from '../../service/patient.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  PatientFormn: FormGroup;
  teachers: any;

  constructor(private patientService: PatientService,
              private router: Router) {
    this.PatientFormn = new FormGroup( {
      name: new FormControl('' , [Validators.required, Validators.minLength(6)]),
      patientCode: new FormControl('', [Validators.required]),
      medicalRecordCode: new FormControl('', [Validators.required]),
      startTime: new FormControl('', []),
      endTime: new FormControl('', []),
      reason: new FormControl('', []),
      method: new FormControl('', []),
      doctor: new FormControl('', [])
    });
  }

  ngOnInit(): void {
  }

  create() {
    this.patientService.save(this.PatientFormn.value).subscribe(() => {
      const navigationExtras: NavigationExtras = {state: {data: 'success'}};
      this.router.navigate(['/list'], navigationExtras);
    });
  }
}
