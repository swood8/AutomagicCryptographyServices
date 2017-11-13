import { AcsService } from './acs.service';
import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  isLoggedIn: boolean = false;

  constructor(private service: AcsService,
              private router: Router) {}

  ngOnInit() {
    this.checkLogin();
  }

  checkLogin(): void {
    this.service.checkLogin().subscribe(result => {
      if (result.id) {
        this.router.navigate(['/home']);
      } else {
        this.router.navigate(['/login']);
      }
    });
  }
}
