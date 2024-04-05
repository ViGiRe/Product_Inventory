import { Component,OnInit } from '@angular/core';
import { ProductServiceService } from '../shared/product-service.service';
import { Location } from '@angular/common';
import { Product } from '../model/product';

@Component({
  selector: 'app-pproduct-list',
  templateUrl: './pproduct-list.component.html',
  styleUrls: ['./pproduct-list.component.css']
})
export class PproductListComponent implements OnInit{
  productlist : any;
  constructor(private productService : ProductServiceService){

  }

  ngOnInit(): void {
    this.productService.getAllProducts().subscribe(data => this.productlist = data)
    console.log(this.productlist);
  }

  deleteProduct(pid:number){
    this.productService.deleteProduct(pid).subscribe(data=>console.log("Product Deleted"));
    window.location.reload;
  }
  
}
