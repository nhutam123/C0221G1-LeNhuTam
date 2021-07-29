import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../service/customer.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  customer: any;

  constructor(private customerService: CustomerService) {
    this.customer = new FormGroup( {
      name: new FormControl('' , []),
      id: new FormControl('' , []),
      dateOfBirth: new FormControl('', [])
    });
  }

  ngOnInit(): void {
  }

  create() {
    this.customerService.save(this.customer.value);
  }
}
