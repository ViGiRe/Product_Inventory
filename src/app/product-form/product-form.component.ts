import { Component,OnInit } from '@angular/core';
import { ProductServiceService } from '../shared/product-service.service';
import { Product } from '../model/product';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {
  
  constructor(public productService: ProductServiceService){ }

  ngOnInit(): void { }

  saveProduct(data:Product){
    this.productService.saveProduct(data).subscribe(data=>console.log("product saved"));
    window.location.reload;

  }

}
