import { Injectable } from '@angular/core';
import { environment } from '../environment'; // Cambio aquí
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class DataService {
  private apiUrl = `${environment.apiUrl}/datos`; // Agrega el path específico de tu API

  constructor(private http: HttpClient) {}

  obtenerDatos() {
    return this.http.get<string>(this.apiUrl);
  }
}
