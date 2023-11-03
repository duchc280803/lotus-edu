import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import {Routes} from '@angular/router';
import {LoginComponentComponent} from "./pages/login-component/login-component.component";
import {RegisterComponentComponent} from "./pages/register-component/register-component.component";
import {MenuComponentComponent} from "./pages/menu-component/menu-component.component";
import {BookComponentComponent} from "./pages/book-component/book-component.component";
import {AboutComponentComponent} from "./pages/about-component/about-component.component";
import {HomeComponentComponent} from "./pages/home-component/home-component.component";
import {CartComponentComponent} from "./pages/cart-component/cart-component.component";
import {CheckoutComponentComponent} from "./pages/checkout-component/checkout-component.component";

const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full'},
  {path: 'login', component: LoginComponentComponent},
  {path: 'register', component: RegisterComponentComponent},
  {path: 'home', component: HomeComponentComponent},
  {path: 'menu', component: MenuComponentComponent},
  {path: 'book', component: BookComponentComponent},
  {path: 'about', component: AboutComponentComponent},
  {path: 'cart', component: CartComponentComponent},
  {path: 'checkout', component: CheckoutComponentComponent},
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
