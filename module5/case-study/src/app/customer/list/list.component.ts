import {Component, OnInit} from '@angular/core';
import {Customer} from '../../model/customer';
import {MatDialog} from '@angular/material/dialog';
import {CustomerService} from '../../service/customer.service';
import {DialogDeleteComponent} from '../dialog-delete/dialog-delete.component';
import {UpdateComponent} from '../update/update.component';
import {ViewComponent} from '../view/view.component';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  searchText: any;
  customers: Customer[] = [];
  config: any;

  constructor(public dialog: MatDialog, private  customerService: CustomerService) {
    this.config = {
      itemsPerPage: 3,
      currentPage: 1
    };
  }

  ngOnInit(): void {
    this.getAll();
  }

  openDialog(id: any, name: any) {
   let dialog = this.dialog.open(DialogDeleteComponent, {
        height: '250px' , width: '300px',
        data: {id , name}
    });
  }

  openDialog1(id: any, name: any, dateOfBirth: any) {
    let  dialog = this.dialog.open(ViewComponent, {
      height: '300px' , width: '400px' ,
      data: {id , name , dateOfBirth}
    });
  }

  pageChanged(event) {
    this.config.currentPage = event;
  }
  getAll() {
   this.customers =  this.customerService.getAll();
  }

  openEditDialog(id: any, name: any, dateOfBirth: any) {
    let dialog = this.dialog.open(UpdateComponent, {
      height: '450px', width: '450px', data: {id, name, dateOfBirth}
    });
  }
}
