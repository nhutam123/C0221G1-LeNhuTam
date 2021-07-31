import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {CustomerService} from '../../service/customer.service';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerType} from '../../model/customer-type';
import {CustomerTypeService} from '../../service/customer-type.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  productForm: any;
  customerTypes: CustomerType[] = [];
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  constructor(@Inject(MAT_DIALOG_DATA) public data, private customerService: CustomerService,
              private customerTypeService: CustomerTypeService) {
    this.productForm = new FormGroup ({
      id: new FormControl(this.data.id),
      name: new FormControl(this.data.name),
      dateOfBirth: new FormControl(this.data.dateOfBirth),
      customerType: new FormControl(this.data.type),
    });
  }

  ngOnInit(): void {
    this.customerTypeService.getAll().subscribe(next => {
      this.customerTypes = next;
    });
    console.log(this.data.type);
    }

  submit() {
    this.customerService.update(this.productForm.value).subscribe();
  }
}
