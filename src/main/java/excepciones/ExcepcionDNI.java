package excepciones;

public class ExcepcionDNI extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ExcepcionDNI() {
		System.out.println("Formato de DNI incorrecto");
	}
}
