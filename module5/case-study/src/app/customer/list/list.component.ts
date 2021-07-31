import {Component, Inject, OnInit} from '@angular/core';
import {Customer} from '../../model/customer';
import {MatDialog} from '@angular/material/dialog';
import {CustomerService} from '../../service/customer.service';
import {DialogDeleteComponent} from '../dialog-delete/dialog-delete.component';
import {UpdateComponent} from '../update/update.component';
import {ViewComponent} from '../view/view.component';
import {Router} from '@angular/router';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  searchText: any;
  customers: Customer[] = [];
  config: any;
  data = '';
  dateFrom: any;
  dateTo: any;

  constructor(public dialog: MatDialog,
              private  customerService: CustomerService,
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

  ngOnInit(): void {
    this.getAll();
  }

  openDialog(id: any, name: any) {
   const dialog = this.dialog.open(DialogDeleteComponent, {
        height: '250px' , width: '300px',
        data: {id , name}
    });
   dialog.afterClosed().subscribe(() => {
     this.ngOnInit();
     confirm('xóa thành công');
   });
  }

  openDialog1(id: any, name: any, dateOfBirth: any, customerType) {
    const  dialog = this.dialog.open(ViewComponent, {
      height: '350px' , width: '450px' ,
      data: {id , name , dateOfBirth, customerType}
    });
  }

  pageChanged(event) {
    this.config.currentPage = event;
  }
  getAll() {
    this.customerService.getAll().subscribe(next => {
      this.customers = next;
    });
  }

  openEditDialog(id, name, dateOfBirth, type) {
    const dialog = this.dialog.open(UpdateComponent, {
      height: '450px', width: '450px', data: {id, name, dateOfBirth, type}
    });
    dialog.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }

  search() {

  }
}
