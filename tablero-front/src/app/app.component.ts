import { Component } from '@angular/core';
import { NotasService } from './servicios/notas/notas.service';
import { Note } from './modelos/note.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'tablero-front';
  offCanvaI = true;
  idNote: string; 
  notes: Note[] = [];
  constructor(public notasService: NotasService) {
    this.notasService.listar().subscribe(
      resp => {
        this.notes = resp;
      }
    );
  }

  verDetalle(id: string) {
    this.idNote = id;
    this.offCanvaI = false;
  }

  dismiss() {
    this.offCanvaI = true;
  }
}
