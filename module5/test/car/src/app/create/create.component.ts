import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Producer} from '../model/producer';
import {ProducerService} from '../service/producer.service';
import {CarService} from '../service/car.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  carForm: any;
  producers: Producer[] = [];
  constructor(private producerService: ProducerService,
              private carService: CarService,
              private router: Router) {
    this.carForm = new FormGroup({
        name: new FormControl('', []),
        producer: new FormControl('', [])
      }
    );
  }

  ngOnInit(): void {
    this.producerService.getAll().subscribe(next => {
      this.producers = next ;
    });
  }

  create() {
    console.log(this.carForm.value);
    this.carService.create(this.carForm.value).subscribe();
    // @ts-ignore
    this.router.navigate(['/list']);
  }
}
