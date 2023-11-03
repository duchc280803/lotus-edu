import { Component, OnInit } from '@angular/core';
import { ProductService } from "../../service/product/product.service";

@Component({
  selector: 'app-home-component',
  templateUrl: './home-component.component.html',
  styleUrls: ['./home-component.component.css']
})
export class HomeComponentComponent implements OnInit {

  listProduct: any[] = [];

  constructor(private productService: ProductService) {
  }

  ngOnInit() {
    this.getListProduct();
  }

  public getListProduct() {
    this.productService.listProduct().then(response => {
      this.listProduct = response.data;
    }).catch(error => {
      console.error('Error fetching products:', error);
    });
  }
}
