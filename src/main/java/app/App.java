package app;

import java.util.*;

import constructores.ClienteBuilder;
import dao.ClienteDao;
import excepciones.ExcepcionDuplicidad;
import modelo.Cliente;
import modelo.Cliente.TipoDocumento;

public class App {

	public static void main(String[] args) throws ExcepcionDuplicidad{
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		ClienteDao clienteDao = new ClienteDao(clientes);
		
		// Creamos algunos clientes
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
		
		// Listar todos los clientes
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
	}

}
