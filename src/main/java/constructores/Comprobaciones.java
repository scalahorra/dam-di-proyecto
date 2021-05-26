package constructores;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import excepciones.ExcepcionDNI;
import excepciones.ExcepcionEmail;
import excepciones.ExcepcionNIE;
import modelo.Cliente;
import modelo.Cliente.TipoDocumento;

public class Comprobaciones {

	// COMPROBRACIONES CLIENTE
		// Comprobacion email
		public static void testEmail(String email) throws ExcepcionEmail{
			String expresionEmail = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
			Pattern emailPat = Pattern.compile(expresionEmail,Pattern.CASE_INSENSITIVE);
			Matcher matcher = emailPat.matcher(email);
			if(matcher.find() == false) throw new ExcepcionEmail();
			else System.out.println("Email correcto");
		}
		
		// Comprobacion DNI
		@SuppressWarnings("static-access")
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
		
		
	// COMPROBACIONES PEDIDO
		// Comprobacion ID cliente existente
		public static void testExistenciaID(int id, List<Cliente> clientes ) {
			boolean coincidencia;
			for(Cliente c : clientes) {
				if(c.getCodigoCliente()==id) coincidencia = true;
			}
			if(coincidencia=false) System.out.println("No existe ningún cliente con ese ID");
		}
		
		// Comprobacion fecha de hoy
		
}
