import {Component, Input, Output, OnInit, EventEmitter} from '@angular/core';
import {applySourceSpanToExpressionIfNeeded} from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-countdown',
  templateUrl: './countdown.component.html',
  styleUrls: ['./countdown.component.css']
})
export class CountdownComponent implements OnInit {


  constructor() { }
  @Input()
  item: string ;
  @Output() itemEvent = new  EventEmitter<string>();
  time = 10;
  message: string;
  countries = ['viet name', 'indo'];
  private  interval ;

  ngOnInit(): void {
  }
  loading() {
     this.interval = setInterval( () => {
         this.time -- ;
         if (this.time === 0) {
           this.message = 'het giờ';
           clearInterval(this.interval);
         }
    }, 1000 );
  }

  start() {
   this.loading();
  }

  stop() {
  clearInterval(this.interval);
  }

  reset() {
    this.time = 10;
    this.message = '';
  }
}
