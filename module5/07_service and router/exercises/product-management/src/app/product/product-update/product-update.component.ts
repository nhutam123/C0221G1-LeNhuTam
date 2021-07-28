import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  productForm = new FormGroup ({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl()

  });
  constructor(@Inject(MAT_DIALOG_DATA) public data, private productService: ProductService) { }

  ngOnInit(): void {
  }

  submit() {
    this.productService.update(this.productForm.value);
  }
}
