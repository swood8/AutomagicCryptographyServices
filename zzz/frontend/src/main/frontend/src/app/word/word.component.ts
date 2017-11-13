import { Component, OnInit } from '@angular/core';
import {Word} from './word';



@Component({
  selector: 'app-word',
  templateUrl: './word.component.html',
  styleUrls: ['./word.component.css']
})
export class WordComponent implements OnInit {

  constructor() { }
  
  word:Word = {
    message: '',
    cryption: '',
  };



  ngOnInit() {
  }
  uppercase(term: string): void {
    var  w = term;
    w = w.replace(/A/g, 'ding');
    w = w.toUpperCase();
     
    this.word.cryption = w;
  }

}
