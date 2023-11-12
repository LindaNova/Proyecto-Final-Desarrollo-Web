import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { PedidosComponent } from './pedidos/pedidos.component';

@NgModule({
  declarations: [PedidosComponent],
  imports: [BrowserModule, HttpClientModule],
  bootstrap: [PedidosComponent]
})
export class AppModule { }
