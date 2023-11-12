import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PedidosService {

  private apiUrl = 'http://localhost:8080'; // URL del servidor de Spring Boot

  constructor(private http: HttpClient) { }

  ingresarOrdenCompra(data: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/api/pedidos/ingresarOrdenCompra`, data);
  }

}
