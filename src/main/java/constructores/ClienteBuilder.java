package constructores;

import java.util.*;

import dao.ClienteDao;
import excepciones.ExcepcionDuplicidad;
import modelo.Cliente;
import modelo.Cliente.TipoDocumento;

public class ClienteBuilder {
	
	static List<Cliente> clientes;
	
	public ClienteBuilder(List<Cliente> clientes) {
		ClienteBuilder.clientes = clientes;
	}

	public static Cliente buildCliente(int codigoCliente, String nombreCliente, String telefono,
			String fax, String lineaDireccion1, String ciudad, String email, String password, TipoDocumento tipoDocumento) throws ExcepcionDuplicidad{
	
		ClienteDao clienteDao = new ClienteDao(clientes);
		
		//duplicidadCodigo(codigoCliente, clientes);
		
		return new Cliente(codigoCliente, nombreCliente, telefono, fax, lineaDireccion1, ciudad, email, password, tipoDocumento);
	}
	
	
	// Excepciones
	public static void duplicidadCodigo(int codigoCliente, List clientes) throws ExcepcionDuplicidad{
		
		List<Cliente> cli = clientes;
		for(Cliente c : cli) {
			if(c.getCodigoCliente() == codigoCliente) throw new ExcepcionDuplicidad();
			else System.out.println("*** Usuario introducido correctamente");
		} 
	}
	
}
