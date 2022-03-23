import { Component,OnInit } from '@angular/core';
import { LoginComponentComponent } from './login/login-component.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = "assignment";

  ngOnInit(): void {
  }
}
