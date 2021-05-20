package constructores;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.ClienteDao;
import excepciones.ExcepcionDuplicidad;
import excepciones.ExcepcionEmail;
import modelo.Cliente;
import modelo.Cliente.TipoDocumento;

public class ClienteBuilder {
	
	static List<Cliente> clientes;
	
	public ClienteBuilder(List<Cliente> clientes) {
		ClienteBuilder.clientes = clientes;
	}

	public static Cliente buildCliente(int codigoCliente, String nombreCliente, String telefono,
			String fax, String lineaDireccion1, String ciudad, String email, String password, TipoDocumento tipoDocumento)
					throws ExcepcionDuplicidad, ExcepcionEmail{
	
		ClienteDao clienteDao = new ClienteDao(clientes);
		
		testEmail(email);
		
		
		return new Cliente(codigoCliente, nombreCliente, telefono, fax, lineaDireccion1, ciudad, email, password, tipoDocumento);
	}
	
	// Comprobacion email
	public static void testEmail(String email) throws ExcepcionEmail{
		String expresionEmail = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = Pattern.compile(expresionEmail,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(email);
		if(matcher.find() == false) throw new ExcepcionEmail();
		else System.out.println("Email correcto");
	}
	
	
}
