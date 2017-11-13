import { HttpClientModule } from '@angular/common/http';
import { AcsService } from './acs.service';
import { VigenerePipe } from './vigenere.pipe';
import { ModalComponent } from './modal.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { InboxComponent } from './inbox/inbox.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { CreateMessageComponent } from './create-message/create-message.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    InboxComponent,
    HomeComponent,
    LoginComponent,
    CreateMessageComponent,
    ModalComponent,
    VigenerePipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [AcsService, VigenerePipe],
  bootstrap: [AppComponent]
})
export class AppModule { }
