import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../service/customer.service';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerType} from '../../model/customer-type';
import {CustomerTypeService} from '../../service/customer-type.service';
import {HttpClient} from '@angular/common/http';
import {NavigationExtras, Router} from '@angular/router';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  customer: any;
  customerTypes: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private router: Router) {
    this.customer = new FormGroup( {
      name: new FormControl('' , []),
      type: new FormControl('' , []),
      dateOfBirth: new FormControl('', [])
    });
  }

  ngOnInit(): void {
    this.getAllCustomerType();
  }

  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(next => {
      this.customerTypes = next;
    });
  }

  create() {
    this.customerService.save(this.customer.value).subscribe();
    const navigationExtras: NavigationExtras = {state: {data: 'success'}};
    this.router.navigate(['/customer/list'], navigationExtras);
  }
}
