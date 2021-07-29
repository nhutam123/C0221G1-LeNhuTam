import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

  constructor(@Inject(MAT_DIALOG_DATA) public data, private productService: ProductService) { }

  ngOnInit(): void {
  }

  delete(id: any) {
    this.productService.delete(id);
  }
}
