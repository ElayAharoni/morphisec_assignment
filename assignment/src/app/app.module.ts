import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponentComponent } from './login/login-component.component';
import { RouterModule } from '@angular/router';
import { MainComponentComponent } from './main/main-component.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { OnlineListComponent } from './online-list/online-list.component';
import { LogoutComponent } from './logout/logout.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponentComponent,
    WelcomeComponent,
    OnlineListComponent,
    LogoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path:'main', component:MainComponentComponent},
      {path:'login', component:LoginComponentComponent}
    ]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
