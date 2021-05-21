package constructores;

import java.util.*;

import excepciones.ExcepcionDNI;
import excepciones.ExcepcionDuplicidad;
import excepciones.ExcepcionEmail;
import excepciones.ExcepcionNIE;
import modelo.Cliente;
import modelo.Cliente.TipoDocumento;

public class ClienteBuilder {
	
	static List<Cliente> clientes;
	
	public ClienteBuilder(List<Cliente> clientes) {
		ClienteBuilder.clientes = clientes;
	}

	public static Cliente buildCliente(int codigoCliente, String nombreCliente, String telefono,
			String fax, String lineaDireccion1, String ciudad, String email, String password,
			TipoDocumento tipoDocumento, String codigoDocumento) throws ExcepcionDuplicidad, ExcepcionEmail, ExcepcionDNI, ExcepcionNIE{
	
		//ClienteDao clienteDao = new ClienteDao(clientes);
		
		Comprobaciones.testEmail(email);
		Comprobaciones.testDNI(tipoDocumento, codigoDocumento);
		Comprobaciones.testNIE(tipoDocumento, codigoDocumento);
		
		
		return new Cliente(codigoCliente, nombreCliente, telefono, fax, lineaDireccion1, ciudad, email, password, tipoDocumento, codigoDocumento);
	}
	
	
	
}
