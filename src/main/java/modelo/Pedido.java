package modelo;

public class Pedido {

	int codigoPedido;
	// fechaPedido
	// fechaEsperada
	// fechaEntrega
	String estado;
	String comentarios;
	int codigoCliente;
	
	
	// Constructores
	public Pedido(int codigoPedido, String estado, String comentarios, int codigoCliente) {
		super();
		this.codigoPedido = codigoPedido;
		this.estado = estado;
		this.comentarios = comentarios;
		this.codigoCliente = codigoCliente;
	}
	
	public Pedido() {
		super();
		
	}

	
	// Getters y Setters
	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	
	// To String
	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", estado=" + estado + ", comentarios=" + comentarios
				+ ", codigoCliente=" + codigoCliente + "]";
	}
}
