import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {CarService} from '../service/car.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(@Inject(MAT_DIALOG_DATA) public data,
              private carService: CarService) { }

  ngOnInit(): void {
  }

  delete(id: any) {
    console.log(id);
    this.carService.delete(id).subscribe();
  }
}
