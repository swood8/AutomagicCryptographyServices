import { Component, OnInit } from '@angular/core';

import { VigenerePipe, CipherType } from './../vigenere.pipe';

export class ACS_User {
  id: number;
  firstName: string;
  lastName: string;
  username: string;
  password: string;
}

export class ACS_Message {
  id: number;
  sender: ACS_User;
  receiver: ACS_User;
  message: string;
  sent: string;
  read: string;
}

const users: ACS_User[] = [
  {id: 1, firstName: "Satomi", lastName: "Misoka", username: "smisoka", password: "m150ka"},
  {id: 2, firstName: "Scottie", lastName: "Flynn", username: "flynn", password: "gh0st"},
  {id: 3, firstName: "Lily", lastName: "Koizumi", username: "lkoizumi", password: "n1nj4"}
];

const msgs: ACS_Message[] = [
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
    messages: ACS_Message[] = msgs;
    key: string = "";
    decode: CipherType = CipherType.DECODE;

    ngOnInit() {
    }

    getModalId(id: number): string {
      return 'modal' + id;
    }

    getModalHashId(id: number): string {
      return '#modal' + id;
    }

}
