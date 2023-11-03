import {Injectable} from '@angular/core';
import axios from "axios";

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  private registerApi = 'http://localhost:8080/api/v1/account/register';
  private sendEmailApi = 'http://localhost:8080/api/v1/account/send-email-register';

  constructor() {
  }

  public register(username: string, password: string, email: string, confirmCode: string) {
    return axios.post(`${this.registerApi}`, {username, password, email, confirmCode});
  }

  public sendCode(email: string) {
    return axios.post(`${this.sendEmailApi}?email=${email}`, { email: email });
  }
}
