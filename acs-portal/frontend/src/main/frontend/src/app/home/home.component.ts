import { Router } from '@angular/router';
import { AcsService } from './../acs.service';
import { AcsUser } from './../acs-user';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  acsu: AcsUser = {id: 0, fn: "null", ln: "null", username: "", password: ""};

  constructor(private service: AcsService,
    private router: Router) {}

  ngOnInit() {
    // this.checkLogin();
    this.setAcsUser();
  }

  checkLogin(): void {
    this.service.checkLogin().subscribe(
      (user: AcsUser) => {
        if (user.id) {
          console.log("true: " + user);
          this.service.loggedUser.subscribe((user: AcsUser) => this.acsu = user);
        } else {
          console.log("false: " + user);
          this.router.navigate(['/login']);
        }
      }
    );
  }

  setAcsUser(): void {
     this.service.loggedUser.subscribe((user: AcsUser) => this.acsu = user);
  }

}
