import {Component, OnInit, inject, Inject, Output, EventEmitter} from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {StudentServiceService} from '../service/student-service.service';

@Component({
  selector: 'app-dialog-delete',
  templateUrl: './dialog-delete.component.html',
  styleUrls: ['./dialog-delete.component.css']
})
export class DialogDeleteComponent implements OnInit {
  @Output() deleteStudent = new EventEmitter();

  constructor(@Inject(MAT_DIALOG_DATA) public data, private studentServiceService: StudentServiceService) { }

  ngOnInit(): void {
  }

  delete(id: any) {
    this.studentServiceService.delete(id);
  }
}
