import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {
 baseUrl: string = 'http://localhost:8080/';

  constructor(public http : HttpClient) { 
  }
  
  public getAllProducts(){
    return this.http.get(this.baseUrl+'products');
  }

  public saveProduct(prod:Product){
    return this.http.post(this.baseUrl+'products',prod)
  }

  public deleteProduct(pid:number){
    return this.http.delete(this.baseUrl+'products/'+pid)  
  }
}
