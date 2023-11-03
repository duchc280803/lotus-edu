import { Injectable } from '@angular/core';
import axios from "axios";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private productApi = 'http://localhost:8080/api/v1/product/all';

  constructor() { }

  public listProduct() {
    return axios.get(`${this.productApi}`);
  }
}
