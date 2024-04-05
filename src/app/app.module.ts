import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { PproductListComponent } from './pproduct-list/pproduct-list.component';
import { FormsModule } from '@angular/forms';
import { ProductFormComponent } from './product-form/product-form.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PproductListComponent,
    ProductFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule,FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
