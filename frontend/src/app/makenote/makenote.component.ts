import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { error } from 'console';

@Component({
  selector: 'app-makenote',
  standalone: true,
  imports: [FormsModule, HttpClientModule],
  templateUrl: './makenote.component.html',
  styleUrl: './makenote.component.css'
})
export class MakenoteComponent {

  title!:String
  Description!:String

  httpClient = inject(HttpClient);
 
  saveNote(){
    var inputData = {
      subject: this.title,
      note: this.Description
    }
    this.httpClient.post(`http://localhost:8080/notes`, inputData).subscribe({
      next: (res: any) => {
        alert(`Note Saved Succesfully`);
        this.title = ``;
        this.Description = ``;
      },
      error: (err: any) => {
        console.log(``);
      }

    });
  }
}
