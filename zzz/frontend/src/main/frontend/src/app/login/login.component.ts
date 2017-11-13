import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  private zuulUrl: string = 'localhost:8765';

  constructor() { }

  ngOnInit() {
  }

}
