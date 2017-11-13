import { AcsMessage } from './acs-message';
import { AcsUser } from './acs-user';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Rx';
import { catchError, map, tap } from 'rxjs/operators';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';
import { of } from 'rxjs/observable/of';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class AcsService {
  loggedUser: BehaviorSubject<AcsUser> = new BehaviorSubject<AcsUser>(
    {id: 0, fn: "", ln: "", username: "", password: ""}
  );
  private zuulUrl: string = "http://localhost:8765";

  constructor(private http: HttpClient) { }

  checkLogin(): Observable<AcsUser> {
    return this.http.get<AcsUser>(this.zuulUrl + "/login/isLoggedIn").pipe(
      tap((user: AcsUser) => {if (user) {this.loggedUser.next(user);}}),
      catchError(this.handleError<AcsUser>('checkLogin'))
    );
  }

  submitLogin(acsu: AcsUser): Observable<AcsUser> {
    return this.http.post<AcsUser>(this.zuulUrl + "/login/loginUser", acsu, httpOptions).pipe(
      tap((user: AcsUser) => {if (user) {this.loggedUser.next(user);}}),
      catchError(this.handleError<AcsUser>('submitLogin'))
    );
  }

  loadMessages(): Observable<AcsMessage[]> {
    return this.http.post<AcsMessage[]>(this.zuulUrl + "/inbox/get", this.loggedUser.getValue(), httpOptions).pipe(
      catchError(this.handleError<AcsMessage[]>('loadMessages'))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }
}
