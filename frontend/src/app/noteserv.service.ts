import { inject, Injectable } from '@angular/core';
import { HttpClient,} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NoteservService {

  constructor() { }

  //httpClient = inject(HttpClient);

  // destroynote(noteId: Number){
  //   return this.httpClient.delete(`http://localhost:4200/notes/${noteId}`);
  // }
}
