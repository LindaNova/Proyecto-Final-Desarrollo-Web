<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Confirmación de Pedidos</title>
    <!-- Agrega tus enlaces CSS aquí si es necesario -->
</head>
<body>
    <div class="container">
        <h1>Confirmación de Pedidos</h1>

        <!-- Botón de Regresar -->
        <a th:href="@{/dashboard/index}" class="btn">Regresar</a>

        <!-- Mostrar los pedidos ingresados -->
        <h2>Datos Ingresados:</h2>
        <table>
            <thead>
                <tr>
                    <th>Nombre del Cliente</th>
                    <th>Producto o Servicio</th>
                    <th>Descripción</th>
                    <th>Cantidad</th>
                    <th>Precio</th>
                    <th>Tipo de Pedido</th>
                </tr>
            </thead>
            <tbody>
                <tr th:each="pedido : ${pedidos}">
                    <td th:text="${pedido.nombreCliente}"></td>
                    <td th:text="${pedido.producto}"></td>
                    <td th:text="${pedido.descripcion}"></td>
                    <td th:text="${pedido.cantidad}"></td>
                    <td th:text="${pedido.precio}"></td>
                    <td th:text="${pedido.tipo}"></td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
