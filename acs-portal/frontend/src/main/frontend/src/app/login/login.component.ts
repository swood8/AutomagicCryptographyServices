import { Router } from '@angular/router';
import { AcsService } from './../acs.service';
import { AcsUser } from './../acs-user';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  acsu: AcsUser = {id: 0, fn: "", ln: "", username: "", password: ""};

  constructor(private service: AcsService,
              private router: Router) { }

  ngOnInit() {
  }

  submitLogin(acsu: AcsUser): void {
    this.service.submitLogin(acsu)
      .subscribe(result => {
        if (result) {
          this.router.navigate(['/home']);
        }
      });
  }

}
