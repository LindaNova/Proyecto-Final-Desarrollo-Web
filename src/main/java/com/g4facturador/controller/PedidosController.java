package com.g4facturador.controller;

import com.g4facturador.models.PedidosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pedidos")
public class PedidosController {

    @PostMapping("/ingresarOrdenCompra")
    public String ingresarOrdenCompra(@RequestParam String nombre_cliente,
                                      @RequestParam String producto,
                                      @RequestParam String descripcion,
                                      @RequestParam int cantidad,
                                      @RequestParam double precio,
                                      @RequestParam String tipo,
                                      HttpSession session,
                                      Model model) {

        Pedido pedido = new Pedido();
        pedido.setNombreCliente(nombre_cliente);
        pedido.setProducto(producto);
        pedido.setDescripcion(descripcion);
        pedido.setCantidad(cantidad);
        pedido.setPrecio(precio);
        pedido.setTipo(tipo);

        // Obtener la lista de pedidos de la sesión
        List<Pedido> pedidos = (List<Pedido>) session.getAttribute("ordenes");

        // Si la lista aún no existe, créala
        if (pedidos == null) {
            pedidos = new ArrayList<>();
        }

        // Agregar el nuevo pedido a la lista
        pedidos.add(pedido);

        // Actualizar la lista en la sesión
        session.setAttribute("ordenes", pedidos);

        // Agregar la lista de pedidos al modelo para mostrar en la vista
        model.addAttribute("pedidos", pedidos);

        return "confirmacion";
    }

    // Otros métodos del controlador si es necesario
}
