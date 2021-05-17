package dao;

import java.util.*;

import modelo.Cliente;

public class ClienteDao implements Dao<Cliente>{
	
	List<Cliente> clientes = new ArrayList<>();
	
	public ClienteDao(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public Cliente listar(int id) {		
		return clientes.get(id);
	}

	@Override
	public List<Cliente> listarTodos() {		
		return clientes;
	}

	@Override
	public void guardar(Cliente cliente) {
		clientes.add(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		clientes.get(cliente.getCodigoCliente()).setNombreCliente(cliente.getNombreCliente());
		System.out.println("Se ha actualizado el perfil del cliente " + cliente.getCodigoCliente());
	}

	@Override
	public void eliminar(Cliente cliente) {
		clientes.remove(cliente);
		System.out.println("Se ha borrado el perfil del cliente " + cliente.getCodigoCliente());
	}

}
