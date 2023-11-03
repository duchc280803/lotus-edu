import { Component } from '@angular/core';
import { LoginService } from "../../service/login/login.service";

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent {

  username: string = '';
  password: string = '';
  errorMessages: any = {}; // Thêm đối tượng errorMessages
  hasError: boolean = false; // Thêm biến hasError

  constructor(private loginService: LoginService) {}

  login() {
    this.loginService.login(this.username, this.password)
      .then(response => {
        console.log('Đăng Nhập Thành Công', response);
        this.hasError = false; // Đặt lại biến hasError khi đăng nhập thành công
      })
      .catch(error => {
        this.errorMessages = error.response.data; // Lưu trữ các thông báo lỗi
        this.hasError = true; // Đặt biến hasError khi có lỗi
        console.log(error);
      });
  }
}
