import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})

export class LoginComponentComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  onClick(): void {
    this.router.navigate([`/main`]);
    const element = document.getElementById("loginForm");
    element!.remove();
  }
}
