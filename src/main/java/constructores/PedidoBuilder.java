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
	
	public static Pedido buildPedido(int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega,
			String estado, String comentarios, int codigoCliente) {
		
		//Comprobaciones.testExistenciaID(codigoPedido, clientes);
		
		return new Pedido(codigoPedido, fechaPedido, fechaEsperada, fechaEntrega, estado, comentarios, codigoCliente);
	}
}
