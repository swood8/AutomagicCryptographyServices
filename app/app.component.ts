import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { VigenerePipe, CipherType } from './vigenere.pipe';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [VigenerePipe]
})
export class AppComponent {
  constructor(private pipe: VigenerePipe) {}

  message: string = "";
  key: string = "";
  cipher = CipherType;
  encoded: string = "";

  encode(message, key): void {
    this.encoded = this.pipe.transform(message, this.cipher.ENCODE, key);
  }

  decode(message, key): void {
    this.encoded = this.pipe.transform(message, this.cipher.DECODE, key);
  }
}
