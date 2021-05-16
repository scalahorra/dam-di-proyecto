package excepciones;

public class ExcepcionDuplicidad extends Exception{

	private static final long serialVersionUID = 1L;

	public ExcepcionDuplicidad() {
		System.out.println("*** El usuario introducido ya existe ***");
	}
}
