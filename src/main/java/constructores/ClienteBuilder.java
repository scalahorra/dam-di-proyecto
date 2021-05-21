package constructores;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.ClienteDao;
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
	
		ClienteDao clienteDao = new ClienteDao(clientes);
		
		testEmail(email);
		testDNI(tipoDocumento, codigoDocumento);
		testNIE(tipoDocumento, codigoDocumento);
		
		
		return new Cliente(codigoCliente, nombreCliente, telefono, fax, lineaDireccion1, ciudad, email, password, tipoDocumento, codigoDocumento);
	}
	
	// Comprobacion email
	public static void testEmail(String email) throws ExcepcionEmail{
		String expresionEmail = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = Pattern.compile(expresionEmail,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(email);
		if(matcher.find() == false) throw new ExcepcionEmail();
		else System.out.println("Email correcto");
	}
	
	// Comprobacion DNI
	public static void testDNI(TipoDocumento tipoDocumento, String codigoDocumento) throws ExcepcionDNI{
		if(tipoDocumento==tipoDocumento.DNI) {
			Pattern dniPat = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
			Matcher matcher = dniPat.matcher(codigoDocumento);
			if(matcher.find() == false) throw new ExcepcionDNI();
			else System.out.println("DNI correcto");
		}
	}
	
	// Comprobacion NIE
	public static void testNIE(TipoDocumento tipoDocumento, String codigoDocumento) throws ExcepcionNIE{
		if(tipoDocumento==TipoDocumento.NIE) {
			Pattern niePat = Pattern.compile("[A-Z a-z][0-9]{7,8}[A-Z a-z]");
			Matcher matcher = niePat.matcher(codigoDocumento);
			if(matcher.find() == false) throw new ExcepcionNIE();
			else System.out.println("NIE correcto");
		}
	}
	
}
