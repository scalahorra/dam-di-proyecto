package dao;

import java.util.*;

import modelo.Pedido;

public class PedidoDao implements Dao<Pedido>{
	
	private List<Pedido> pedidos = new ArrayList<>();
	
	public PedidoDao(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	// Listar un pedido por id
	@Override
	public Pedido listar(int id) {
		return pedidos.get(id);
	}

	// Listar todos los pedidos
	@Override
	public List<Pedido> listarTodos() {
		return pedidos;
	}

	// Guardar un pedido
	@Override
	public void guardar(Pedido pedido) {
		pedidos.add(pedido);
	}

	// Actualizar un pedido
	@Override
	public void actualizar(Pedido pedido) {
		pedidos.get(pedido.getCodigoCliente()).setEstado(pedido.getEstado());
		System.out.println("Pedido actualizado");
	}

	// Elimina un pedido
	@Override
	public void eliminar(Pedido pedido) {
		pedidos.remove(pedido);
		System.out.println("Pedido eliminado");
	}

}
