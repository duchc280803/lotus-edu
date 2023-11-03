import { Injectable } from '@angular/core';
import axios from "axios";

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private apiLogin = 'http://localhost:8080/api/v1/account/login';

  constructor() {
  }

  public login(username: string, password: string) {
    return axios.post(`${this.apiLogin}`, {username, password});
  }
}
