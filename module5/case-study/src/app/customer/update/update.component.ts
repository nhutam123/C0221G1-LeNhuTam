import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {CustomerService} from '../../service/customer.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  productForm = new FormGroup ({
    id: new FormControl(),
    name: new FormControl(),
    dateOfBirth: new FormControl()
  });

  constructor(@Inject(MAT_DIALOG_DATA) public data, private customerService: CustomerService) {

  }

  ngOnInit(): void {
    }

  submit() {
    this.customerService.update(this.productForm.value);
  }
}
