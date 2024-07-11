import { Component, NO_ERRORS_SCHEMA, OnInit, inject } from '@angular/core';
import { Notes } from '../notes';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NoteservService } from '../noteserv.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, HttpClientModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {

  constructor(private noteservService: NoteservService){}

  title="TODO APP";

  httpClient = inject(HttpClient);
  Data:Notes[]=[];
  
  ngOnInit():void{
    this.fetchData();

  //   this.notess=[
  //    {
  //     "Id":4,
  //     "subject":"Test subject",
  //     "note":"Test Note"
  //     },
  //     {
  //       "Id":5,
  //       "subject":"Test subject",
  //       "note":"Test Note"
  //     } 
  // ]
  }
  fetchData(){
    this.httpClient
    .get(`http://localhost:8080/notes`)
    .subscribe((notess:any) => {
      this.Data = notess;
      console.log(this.Data);
    });
  }
  deletenote(event:any, noteId:number){
    if(confirm(`are you sure you want to delete`)){
      //event.target.innerText = `Deleting.....`;
      //this.noteservService.destroynote(noteId).subscribe((res:any) => {
      //  alert(`deleted`);
      // });
      event.target.innerText = `Deleting.....`;
      this.httpClient.delete(`http://localhost:8080/notes/${noteId}`).subscribe(() => {
        
        this.fetchData();
      });
      
    }
  }
}