import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
 
import {InboxComponent} from './inbox/inbox.component';
import { HomePageComponent } from './home-page/home-page.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CreateMessageComponent } from './create-message/create-message.component';

 
const routes: Routes = [
  { path: '', redirectTo: '/home-page', pathMatch: 'full' },
  { path: 'home-page',  component: HomePageComponent},
  { path: 'inbox',     component: InboxComponent },
  { path: 'createMessage', component: CreateMessageComponent},
  //{ path: 'detail/:id', component: HeroDetailComponent },
  
];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}