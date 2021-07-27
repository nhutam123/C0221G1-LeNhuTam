import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import {FormControl , FormGroup , Validators} from '@angular/forms';
// tslint:disable-next-line:import-spacing
import {User} from  '../user';

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  formSubmid: any ;
  users: User[] = [];
  countries = ['japan', 'usa', 'canada'];
  password: string;
  email1: string;
  confirmPassword: string;
  age: number;
  country: string;
  gender: string;
  phone: string;
  constructor() {}

  ngOnInit(): void {
  }

  onSubmit(formSubmid) {
    this.formSubmid = formSubmid;
    console.log(this.formSubmid);
    this.users.push(this.formSubmid.value);
  }
}
