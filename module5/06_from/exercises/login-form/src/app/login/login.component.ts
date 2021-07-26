import { Component, OnInit } from '@angular/core';
import {User} from '../user';
import {NgForm} from '@angular/forms';
// @ts-ignore
import { UserInfo } from '../model/UserInfo';
import {FormControl , FormGroup , Validators} from '@angular/forms';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  contactForm = new FormGroup({
    name: new FormControl('', [ Validators.required , Validators.minLength(6)]),
    password: new FormControl('', [ Validators.required , Validators.minLength(6) ])
  });

  users: User[] = [
    {name: 'tam',
    password: '123456'},
    {name: 'tấn',
    password: '123456'}
  ];
  userInfomation: UserInfo;
  message: string;

  constructor() { }

  ngOnInit(): void {
  }

  // onSubmid(userInfo: NgForm) {
  //   this.userInfomation = userInfo.value;
  //   // tslint:disable-next-line:prefer-for-of
  //   for (let i = 0; i < this.users.length; i ++) {
  //     if (this.users[i].name === this.userInfomation.name && this.users[i].password === this.userInfomation.password) {
  //       this.message = 'thành công';
  //       break;
  //     } else {
  //       this.message = 'thất bại';
  //     }
  //   }
  // }
  onSubmid() {
    console.log(this.contactForm);
  }
}
