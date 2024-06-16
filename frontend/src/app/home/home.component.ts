import { Component, NO_ERRORS_SCHEMA } from '@angular/core';
import { Notes } from '../notes';
import { NgFor, NgForOf } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NgForOf],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  title="TODO APP";
  notess:Notes[]=[];
  
  ngOnInit():void{
    this.notess=[
      {
      "Id":4,
      "subject":"Test subject",
      "note":"Test Note"
      },
      {
        "Id":5,
        "subject":"Test subject",
        "note":"Test Note"
      }
  ]
  }
  

}
