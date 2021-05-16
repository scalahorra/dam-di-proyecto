package dao;

import java.util.*;

import modelo.Pedido;

public class PedidoDao implements Dao<Pedido>{
	
	private List<Pedido> pedidos = new ArrayList<>();
	
	public PedidoDao(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public Pedido listar(int id) {
		return pedidos.get(id);
	}

	@Override
	public List<Pedido> listarTodos() {
		return pedidos;
	}

	public void guardar(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void actualizar(Pedido pedido) {

		
	}

	public void eliminar(Pedido pedido) {
		pedidos.remove(pedido);
	}

}
