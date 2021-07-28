import { Injectable } from '@angular/core';
import {Word} from '../model/word';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  words: Word[] = [
    {word: 'sync', mean: 'đồng bộ', synonym: ''},
    {word:  'async', mean:  'bất đồng bộ', synonym: '' },
    {word: 'teacher', mean: 'giáo viên' , synonym: 'instructor'},
    {word: 'student', mean: 'học sinh', synonym: 'alumnus'},
    {word: 'table', mean: 'cái bàn', synonym: ''}
  ];

  constructor() { }
  getAll() {
    return this.words;
  }
}
