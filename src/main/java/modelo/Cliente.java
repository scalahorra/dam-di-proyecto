package modelo;

public class Cliente {

	public enum TipoDocumento { DNI, NIE }
	
	private int codigoCliente;
	private String nombreCliente;
	private String telefono;
	private String fax;
	private String lineaDireccion1;
	private String ciudad;
	private String email;
	private String password;
	private TipoDocumento tipoDocumento;
	
	
	// Constructores
	public Cliente(int codigoCliente, String nombreCliente, String telefono, String fax, String lineaDireccion1,
			String ciudad, String email, String password, TipoDocumento tipoDocumento) {
		super();
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.telefono = telefono;
		this.fax = fax;
		this.lineaDireccion1 = lineaDireccion1;
		this.ciudad = ciudad;
		this.email = email;
		this.password = password;
		this.tipoDocumento = tipoDocumento;
	}
	
	public Cliente() {
		super();
		
	}

	
	// Getters y Setters
	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLineaDireccion1() {
		return lineaDireccion1;
	}

	public void setLineaDireccion1(String lineaDireccion1) {
		this.lineaDireccion1 = lineaDireccion1;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	
	// To String
	@Override
	public String toString() {
		return "Cliente [codigoCliente = " + codigoCliente + ", nombreCliente = " + nombreCliente + ", telefono = " + telefono
				+ ", fax = " + fax + ", lineaDireccion1 = " + lineaDireccion1 + ", ciudad = " + ciudad + ", email = " + email
				+ ", password = " + password + ", tipoDocumento = " + tipoDocumento + "]";
	}
		
}
