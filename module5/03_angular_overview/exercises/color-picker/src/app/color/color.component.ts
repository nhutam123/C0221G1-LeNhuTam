import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  color: any;
  blue = 0;
  red = 250;
  green = 0;

  constructor() { }

  ngOnInit(): void {
  }

  onchaneColor(value: any) {

  }
}
