import { Component } from '@angular/core';
import { PedidosService } from './pedidos.service';

@Component({
  selector: 'app-pedidos',
  template: `
    <!-- Tu formulario HTML aquí -->
  `
})
export class PedidosComponent {

  constructor(private pedidosService: PedidosService) { }

  ingresarOrden(): void {
    const data = {
      // Datos del formulario
    };

    this.pedidosService.ingresarOrdenCompra(data).subscribe(
      response => {
        console.log(response);
        // Manejar la respuesta según sea necesario
      },
      error => {
        console.error(error);
        // Manejar el error según sea necesario
      }
    );
  }

  // Otros métodos y lógica según sea necesario
}
