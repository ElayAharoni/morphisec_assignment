import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'main',
  templateUrl: './main-component.component.html',
  styleUrls: ['./main-component.component.css']
})
export class MainComponentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    const element = document.getElementById("loginForm");
    if(element != null){
      element!.remove();
    }
  }

}
