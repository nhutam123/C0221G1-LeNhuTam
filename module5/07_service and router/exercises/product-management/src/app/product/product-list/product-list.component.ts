import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {MatDialog} from '@angular/material/dialog';
import {ProductUpdateComponent} from '../product-update/product-update.component';
import {ProductDeleteComponent} from '../product-delete/product-delete.component';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  constructor(public dialog: MatDialog, private productService: ProductService) { }

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.products = this.productService.getAll();
  }

  openDialog(id, name: string, price, descripttion) {
    let dialog = this.dialog.open(ProductUpdateComponent, {
      height: '450px', width: '450px', data: {id, name, price, descripttion}
    });
  }

  openDeleteDialog(id: number, name: string, price: number, description: string) {
    let dialog = this.dialog.open(ProductDeleteComponent, {
      height: '250px', width: '300px', data: {id, name , price, description}
    });
  }
}
