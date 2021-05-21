package excepciones;

public class ExcepcionEmail extends Exception{
	private static final long serialVersionUID = 1L;

	public ExcepcionEmail(){
		System.out.println("Ha introducido un email erroneo");
	}
}
