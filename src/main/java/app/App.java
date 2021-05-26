package app;

import java.util.*;

import constructores.ClienteBuilder;
import constructores.PedidoBuilder;
import dao.ClienteDao;
import dao.PedidoDao;
import excepciones.ExcepcionDNI;
import excepciones.ExcepcionDuplicidad;
import excepciones.ExcepcionEmail;
import excepciones.ExcepcionNIE;
import modelo.Cliente;
import modelo.Cliente.TipoDocumento;
import modelo.Pedido;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ExcepcionDuplicidad, ExcepcionEmail, ExcepcionDNI, ExcepcionNIE{
		
		// Creamos la lista de clientes
		List<Cliente> clientes = new ArrayList<Cliente>();
		ClienteDao clienteDao = new ClienteDao(clientes);
		
		// Creamos los clientes
		Cliente cliente1 = ClienteBuilder.buildCliente(1, "Sergio", "4478544", "2478", "C. Pelicanillo",
				"Zaragoza", "sergio@gmail.com", "hola", TipoDocumento.DNI, "12345678A");
		Cliente cliente2 = ClienteBuilder.buildCliente(2, "Maria", "47896523", "88754", "Avda. Melancolia",
				"Madrid", "maria@gmail.com", "1234", TipoDocumento.NIE, "A12345678B");
		Cliente cliente3 = ClienteBuilder.buildCliente(3, "Gonzalo", "47854124", "8952", "Plaza Roma",
				"Tarragona", "gonzalo@gmail.com", "admin", TipoDocumento.DNI, "12345678A");
		Cliente cliente4 = ClienteBuilder.buildCliente(4, "Laura", "412578956", "2451", "C. Golondrina",
				"Huesca", "laura@gmail.com", "sasdfdsa", TipoDocumento.NIE, "A12345678V");
		
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
		Pedido p1 = PedidoBuilder.buildPedido(1, new Date("5/12/2021"), new Date("5/20/2021"), new Date("5/18/2021"), "Enviado", "Hola", 1);
		Pedido p2 = PedidoBuilder.buildPedido(2, new Date("5/10/2021"), new Date("5/15/2021"), new Date("5/13/2021"), "Entregado", "Hola 2", 2);
		
		// Guardamos los pedidos
		pedidoDao.guardar(p1);
		pedidoDao.guardar(p2);
		
		// Mostramos los pedidos
		for(Pedido pedido : pedidos) {
			System.out.println(pedido.toString());
		}
	}

}
