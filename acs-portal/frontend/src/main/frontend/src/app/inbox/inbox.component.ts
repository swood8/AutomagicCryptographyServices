import { AcsMessage } from './../acs-message';
import { AcsService } from './../acs.service';
import { AcsUser } from './../acs-user';
import { Component, OnInit } from '@angular/core';

import { VigenerePipe, CipherType } from './../vigenere.pipe';

const users: AcsUser[] = [
  {id: 1, fn: "Satomi", ln: "Misoka", username: "smisoka", password: "m150ka"},
  {id: 2, fn: "Scottie", ln: "Flynn", username: "flynn", password: "gh0st"},
  {id: 3, fn: "Lily", ln: "Koizumi", username: "lkoizumi", password: "n1nj4"}
];

const msgs: AcsMessage[] = [
  {id: 1, sender: users[1], receiver: users[0], message: "Ztm Gkrgbw", sent: "Today", read: "Yes"},
  {id: 2, sender: users[2], receiver: users[0], message: "Dop lrd gzsn dtc spmy? Uknwiitvr gb yhy jeqwj sagx kz plta lnrts iqrar rslc upcpigk.", sent: "Today", read: "No"}
];

@Component({
  selector: 'app-inbox',
  templateUrl: './inbox.component.html',
  styleUrls: ['./inbox.component.css'],
  providers: [VigenerePipe]
})
export class InboxComponent implements OnInit {
    messages: AcsMessage[] = msgs;
    key: string = "";
    decode: CipherType = CipherType.DECODE;

    constructor(private service: AcsService) {}

    ngOnInit() {
    }

    loadMessages(): void {
      this.service.loadMessages().subscribe(
        results => this.messages = results
      );
    }

}
