import {Component, Inject, OnInit} from '@angular/core';
import {DeleteDialogComponent} from '../delete-dialog/delete-dialog.component';
import {MatDialog} from '@angular/material/dialog';
import {Router} from '@angular/router';
import {DrugOfBill} from '../model/drug-of-bill';
import {DrugService} from '../service/drug.service';
import {Drug} from '../model/drug';
import {AddDrugComponent} from '../add-drug/add-drug.component';

@Component({
  selector: 'app-retail-sale',
  templateUrl: './retail-sale.component.html',
  styleUrls: ['./retail-sale.component.css']
})
export class RetailSaleComponent implements OnInit {
data: DrugOfBill[] = [];
total = 0;
drugs: Drug[] = [];
drug = null;
drugOfBill: DrugOfBill;
  drug1: Drug;
  constructor(public dialog: MatDialog,
              private router: Router,
              private drugService: DrugService
              ) {
    const state = this.router.getCurrentNavigation().extras.state as {data};
    if (state != null) {
      this.data = state.data;
    }
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < this.data.length; i++) {
      this.total += this.data[i].quantity * this.data[i].drug.price;
    }
  }

  ngOnInit(): void {
    this.getAllDrug();

  }



  openDeleteDialog() {
    const dialog = this.dialog.open(DeleteDialogComponent , {
      height: '250px' , width: '300px',
      data: {}
    });
  }
  getAllDrug() {
    this.drugService.getAll().subscribe(next => {
      this.drugs = next;
    });
  }

  getDrug(tam) {
    // const dialog = this.dialog.open(AddDrugComponent , {
    //   height: '50px' , width: '500px',
    //   data: {}
    // });
    this.drugOfBill = {drug: tam , quantity : 5};
    this.data.push(this.drugOfBill);
    console.log(tam.name);
    // tslint:disable-next-line:prefer-for-of
    this.total = 0;
    for (let i = 0; i < this.data.length; i++) {
      this.total += this.data[i].quantity * this.data[i].drug.price;
    }

  }
}
