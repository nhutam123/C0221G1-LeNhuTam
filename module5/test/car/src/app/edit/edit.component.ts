import {Component, Inject, OnInit} from '@angular/core';
import {Producer} from '../model/producer';
import {ProducerService} from '../service/producer.service';
import {CarService} from '../service/car.service';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  carForm: any;
  producers: Producer[] = [];

  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  constructor(private producerService: ProducerService,
              private carService: CarService,
              @Inject(MAT_DIALOG_DATA) public data) {
    this.carForm = new FormGroup({
      id: new FormControl(data.car.id, []),
      name: new FormControl(data.car.name, []),
      producer: new FormControl(data.car.producer, [])
    });
  }

  ngOnInit(): void {
    this.producerService.getAll().subscribe(next => {
      this.producers = next;
    });
    console.log(this.data);
  }

  edit() {
    this.carService.edit(this.carForm.value, this.carForm.value.id).subscribe();
  }
}
