import { Component, OnInit } from '@angular/core';
import {DictionaryService} from '../../service/dictionary.service';
import {Word} from '../../model/word';
import {MatDialog} from '@angular/material/dialog';
import {ViewComponent} from '../view/view.component';
import {DetailComponent} from '../detail/detail.component';

@Component({
  selector: 'app-dictionary-list',
  templateUrl: './dictionary-list.component.html',
  styleUrls: ['./dictionary-list.component.css']
})
export class DictionaryListComponent implements OnInit {
  words: Word[] ;
  constructor(public dialog: MatDialog, private dictionaryService: DictionaryService) { }

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
   this.words = this.dictionaryService.getAll();
  }

  openDialog(word: string, mean: string, synonym: string) {
    let dialog = this.dialog.open( DetailComponent, {
      height: '300px', width: '350px', data: {word, mean, synonym}
    });

  }
}
