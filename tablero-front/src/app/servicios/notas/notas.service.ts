import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Note } from 'src/app/modelos/note.model';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { NotePost } from 'src/app/modelos/note.post.model';


const ENDPOINT = `http://35.237.248.180:8080/notes/`;

@Injectable({
  providedIn: 'root'
})
export class NotasService {
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  constructor(public http: HttpClient) { }

  public listar(): Observable<Note[]> {
    const url = `${ENDPOINT}`;
    return this.http.get(url).pipe(
      map(response => response as Note[])
    );
  }

  public crearNota(notePost: NotePost): Observable<Note> {
    return this.http.post(ENDPOINT, notePost, { headers: this.httpHeaders}).pipe(
      map(response => response as Note)
    );
  }

  public obtenerSegunId(id: string): Observable<Note> {
    const url = `${ENDPOINT}${id}`;
    return this.http.get(url).pipe(
      map(response => response as Note)
    );
  }
/*
  public eliminarDimensionCaja(idDimensionCaja: number): Observable<RespuestaDimensionCaja> {
    return this.http.delete(`${ENDPOINT}/${idDimensionCaja}`).pipe(
      map(response => response as RespuestaDimensionCaja)
    );
  }*/
}

