import { Component, OnInit } from '@angular/core';
import {Car} from '../model/car';
import {CarService} from '../service/car.service';
import {ProducerService} from '../service/producer.service';
import {DeleteComponent} from '../delete/delete.component';
import {MatDialog} from '@angular/material/dialog';
import {EditComponent} from '../edit/edit.component';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {
  cars: Car[] = [];
  constructor(private carService: CarService,
              private producerService: ProducerService,
              private dialog: MatDialog) { }

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.carService.getAll().subscribe(next => {
      this.cars = next;
    });
  }

  openDeleteDialog(id: number, name) {
    const dialog = this.dialog.open(DeleteComponent , {
      height: '250px' , width: '300px',
      data: {id , name}
    });
    dialog.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }

  // openEditDialog(id, name, producer) {
  //   const dialog = this.dialog.open(EditComponent , {
  //     height: '350px' , width: '300px',
  //     data: {id, name , producer}
  //   });
  //   dialog.afterClosed().subscribe(() => {
  //     this.ngOnInit();
  //   });
  // }
  openEditDialog(car) {
    const dialog = this.dialog.open(EditComponent , {
      height: '350px' , width: '300px',
      data: {car}
    });
    dialog.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }
}
