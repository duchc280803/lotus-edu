import {Component} from '@angular/core';
import {RegisterService} from "../../service/register/register.service";
import Swal from 'sweetalert2';

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent {

  username: string = '';
  password: string = '';
  email: string = '';
  confirmCode: string = '';

  errorMessages: any = {}; // Thêm đối tượng errorMessages
  hasError: boolean = false; // Thêm biến hasError

  constructor(private registerService: RegisterService) {
  }

  register() {
    this.registerService.register(this.username, this.password, this.email, this.confirmCode)
      .then(response => {
        alert("Đăng Ký Thành Công" + response.data)
      }).catch(error => {
      this.errorMessages = error.response.data; // Lưu trữ các thông báo lỗi
      this.hasError = true; // Đặt biến hasError khi có lỗi
    })
  }

  sendEmail() {
    this.registerService.sendCode(this.email).then(response => {
      console.log('Send mail thành công', response.data);
    }).catch(error => {
      console.log('send mail thất bại', error.data)
    })
  }
}
