import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  first:any;
  second:any;
  operator="+";
  output: number | undefined;


  constructor() { }

  ngOnInit(): void {
  }


  onFirstChane(value: any) {
    this.first=Number(value);

  }

  onSecondChane(value: any) {
    this.second=Number(value);

  }

  onSelectChane(value: any) {
    this.operator=value;

  }
  calculate(){
    switch (this.operator) {
      case "+":
        this.output=this.first+this.second;
        break;
      case "-":
        this.output=this.first-this.second;
        break;
      case "*":
        this.output=this.first*this.second;
        break;
      case "/":
        this.output=this.first/this.second;
        break;

    }
  }
}
