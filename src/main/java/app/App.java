package app;

import java.util.*;

import constructores.ClienteBuilder;
import constructores.PedidoBuilder;
import dao.ClienteDao;
import dao.PedidoDao;
import excepciones.ExcepcionDuplicidad;
import excepciones.ExcepcionEmail;
import modelo.Cliente;
import modelo.Cliente.TipoDocumento;
import modelo.Pedido;

public class App {

	public static void main(String[] args) throws ExcepcionDuplicidad, ExcepcionEmail{
		
		// Creamos la lista de clientes
		List<Cliente> clientes = new ArrayList<Cliente>();
		ClienteDao clienteDao = new ClienteDao(clientes);
		
		// Creamos los clientes
		Cliente cliente1 = ClienteBuilder.buildCliente(1, "Sergio", "4478544", "2478", "C. Pelicanillo",
				"Zaragoza", "sergio@gmail.com", "hola", TipoDocumento.DNI);
		Cliente cliente2 = ClienteBuilder.buildCliente(1, "Maria", "47896523", "88754", "Avda. Melancolia",
				"Madrid", "maria@gmail.com", "1234", TipoDocumento.NIE);
		Cliente cliente3 = ClienteBuilder.buildCliente(1, "Gonzalo", "47854124", "8952", "Plaza Roma",
				"Tarragona", "gonzalo@gmail.com", "admin", TipoDocumento.DNI);
		Cliente cliente4 = ClienteBuilder.buildCliente(4, "Laura", "412578956", "2451", "C. Golondrina",
				"Huesca", "laura@gmail.com", "sasdfdsa", TipoDocumento.NIE);
		
		// Guardamos los clientes
		clienteDao.guardar(cliente1);
		clienteDao.guardar(cliente2);
		clienteDao.guardar(cliente3);
		clienteDao.guardar(cliente4);
		
		// Mostramos todos los clientes
		System.out.println("*** CLIENTES ***");
		for (Cliente c : clienteDao.listarTodos()) {
			System.out.println(c.toString());
		}

		
		System.out.println();
		
		
		// Listar un cliente
		System.out.println("*** CLIENTE ***");
		Cliente cliente = clienteDao.listarTodos().get(2);
		clienteDao.listar(2);
		System.out.println(cliente.toString());
		
		System.out.println();
		
		
		
		// Pedidos
		// Creamos la lista de pedidos
		List<Pedido> pedidos = new ArrayList<Pedido>();
		PedidoDao pedidoDao = new PedidoDao(pedidos);
		
		System.out.println("*** PEDIDOS ***");
		
		// Creamos los pedidos
		Pedido p1 = PedidoBuilder.buildPedido(1, "Enviado", null, 1);
		Pedido p2 = PedidoBuilder.buildPedido(2, "Entregado", null, 2);
		
		// Guardamos los pedidos
		pedidoDao.guardar(p1);
		pedidoDao.guardar(p2);
		
		// Mostramos los pedidos
		for(Pedido pedido : pedidos) {
			System.out.println(pedido.toString());
		}
	}

}
