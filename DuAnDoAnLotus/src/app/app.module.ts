import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { RegisterComponentComponent } from './pages/register-component/register-component.component';
import { LoginComponentComponent } from './pages/login-component/login-component.component';
import { MenuComponentComponent } from './pages/menu-component/menu-component.component';
import { AboutComponentComponent } from './pages/about-component/about-component.component';
import { BookComponentComponent } from './pages/book-component/book-component.component';
import { HomeComponentComponent } from './pages/home-component/home-component.component';
import { CartComponentComponent } from './pages/cart-component/cart-component.component';
import { CheckoutComponentComponent } from './pages/checkout-component/checkout-component.component';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponentComponent,
    LoginComponentComponent,
    MenuComponentComponent,
    AboutComponentComponent,
    BookComponentComponent,
    HomeComponentComponent,
    CartComponentComponent,
    CheckoutComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
