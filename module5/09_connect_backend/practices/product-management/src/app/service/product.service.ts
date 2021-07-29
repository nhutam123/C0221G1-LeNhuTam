import { Injectable } from '@angular/core';
import {Product} from '../model/product';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private url = 'http://localhost:3000/products';
  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(this.url);
  }
  saveProduct(product: Product) {
  }
  delete(id) {
    // for ( let i = 0; i < this.products.length; i++) {
    //   if (this.products[i].id === id) {
    //     this.products.splice(i, 1);
    //   }
    // }
  }
  update(product) {
    // for (let i = 0; i < this.products.length; i++) {
    //   if (this.products[i].id === product.id) {
    //     this.products.splice(i, 1 , product);
    //   }
    // }
  }
}
