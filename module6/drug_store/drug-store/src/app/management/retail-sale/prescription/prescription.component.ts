import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Prescription} from '../model/prescription';
import {PrescriptionService} from '../service/prescription.service';
import {MatDialog} from '@angular/material/dialog';
import {PrescriptionDetailComponent} from '../prescription-detail/prescription-detail.component';
import {ActivatedRoute, Router} from '@angular/router';
import {DrugOfBill} from '../model/drug-of-bill';

@Component({
  selector: 'app-prescription',
  templateUrl: './prescription.component.html',
  styleUrls: ['./prescription.component.css']
})
export class PrescriptionComponent implements OnInit {
  id: number;
  drugOfBills: DrugOfBill[] = [] ;
  constructor(private http: HttpClient,
              private prescriptionService: PrescriptionService,
              private dialog: MatDialog,
              public router: Router,
              private activatedRoute: ActivatedRoute) {
  }
prescriptions: Prescription[] = [];
  color: any;
  mau: any;
  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.prescriptionService.getAll().subscribe(next => {
      this.prescriptions = next;
    });
    console.log(this.prescriptions);
  }


  showView(id: number) {
    this.id = id;
    this.mau = 'red' ;
    // @ts-ignore
    // this.router.navigate(['/prescription-detail']);
    // this.router.navigate(['/prescription-detail', id]);
    // console.log(id);
  }

  showDetail() {
    this.router.navigate(['/prescription-detail', this.id]);
  }
}
