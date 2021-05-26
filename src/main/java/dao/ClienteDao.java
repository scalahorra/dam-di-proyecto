package dao;

import java.util.*;

import modelo.Cliente;

public class ClienteDao implements Dao<Cliente>{
	
	List<Cliente> clientes = new ArrayList<>();
	
	public ClienteDao(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	// Listar un cliente por id
	@Override
	public Cliente listar(int id) {		
		return clientes.get(id);
	}

	// Listar todos los clientes
	@Override
	public List<Cliente> listarTodos() {		
		return clientes;
	}

	// Guardar un cliente
	@Override
	public void guardar(Cliente cliente) {
		clientes.add(cliente);
	}

	// Actualizar un cliente
	@Override
	public void actualizar(Cliente cliente) {
		clientes.get(cliente.getCodigoCliente()).setNombreCliente(cliente.getNombreCliente());
		System.out.println("Se ha actualizado el perfil del cliente " + cliente.getCodigoCliente());
	}

	// Eliminar un cliente
	@Override
	public void eliminar(Cliente cliente) {
		clientes.remove(cliente);
		System.out.println("Se ha borrado el perfil del cliente " + cliente.getCodigoCliente());
	}

}
