package constructores;

import java.util.*;

import modelo.Cliente;
import modelo.Pedido;

public class PedidoBuilder {

	static List<Pedido> pedidos;
	static List<Cliente> clientes;
	
	public PedidoBuilder(List<Pedido> pedidos, List<Cliente> clientes) {
		
		PedidoBuilder.pedidos = pedidos;
		PedidoBuilder.clientes = clientes;
		
	}
	
	public static Pedido buildPedido(int codigoPedido, String estado, String comentarios, int codigoCliente) {
		
		
		return new Pedido(codigoPedido, estado, comentarios, codigoCliente);
	}
}
