package service;

import model.Pedido;
import model.Producto;
import exception.StockInsuficienteException;
import java.util.List;

// Interface para gestionar los pedidos
public interface IPedidoService {

    void agregarProductoAlPedido(Pedido pedido, Producto producto, int cantidad) throws StockInsuficienteException;

    double calcularTotal(Pedido pedido);

    List<Pedido> listarPedidos();

    void cerrarPedido(Pedido pedido);
}