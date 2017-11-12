import { Component, OnInit } from '@angular/core';
import { VigenerePipe, CipherType } from './vigenere.pipe';

import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-create-message',
  templateUrl: './create-message.component.html',
  styleUrls: ['./create-message.component.css'],
  providers: [VigenerePipe]
})
export class CreateMessageComponent implements OnInit {

  constructor(private pipe: VigenerePipe) {}

  message: string = "";
  key: string = "";
  cipher = CipherType;
  encoded: string = "";

  ngOnInit() {
  }

  encode(message, key): void {
    this.encoded = this.pipe.transform(message, this.cipher.ENCODE, key);
  }

  decode(message, key): void {
    this.encoded = this.pipe.transform(message, this.cipher.DECODE, key);
  }

}
