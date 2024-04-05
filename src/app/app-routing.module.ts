import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PproductListComponent } from './pproduct-list/pproduct-list.component';
import { ProductFormComponent } from './product-form/product-form.component';

const routes: Routes = [
 
  {
    path:'',component:PproductListComponent
  },
 
  {
    path:'add',component:ProductFormComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
