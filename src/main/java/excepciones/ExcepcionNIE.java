package excepciones;

public class ExcepcionNIE extends Exception{
	private static final long serialVersionUID = 1L;

	public ExcepcionNIE() {
		System.out.println("Formato de NIE incorrecto");
	}
}
