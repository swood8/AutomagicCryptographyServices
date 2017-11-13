import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
 
import {InboxComponent} from './inbox/inbox.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CreateMessageComponent } from './create-message/create-message.component';
import { LoginComponent } from './login/login.component';
 
const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home',  component: HomeComponent},
  { path: 'inbox',     component: InboxComponent },
  { path: 'new', component: CreateMessageComponent},
  { path: 'login', component: LoginComponent},
  
];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}