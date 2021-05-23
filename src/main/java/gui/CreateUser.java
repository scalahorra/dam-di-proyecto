package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import constructores.ClienteBuilder;
import dao.ClienteDao;
import excepciones.ExcepcionDNI;
import excepciones.ExcepcionDuplicidad;
import excepciones.ExcepcionEmail;
import excepciones.ExcepcionNIE;
import modelo.Cliente;
import modelo.Cliente.TipoDocumento;

import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class CreateUser {
	
	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtFax;
	private JTextField txtEmail;
	private JTextField txtPassword;
	private JTextField txtDireccion;
	private JTextField txtDocumento;
	private ButtonGroup grupoRBotones = new ButtonGroup();
	private JTextField txtCiudad;
	private JTextField txtCodigoCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUser window = new CreateUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Titulo
		JLabel lblTitulo = new JLabel("Creaci\u00F3n de CLIENTE");
		lblTitulo.setBounds(10, 11, 120, 30);
		frame.getContentPane().add(lblTitulo);
		
		// Nombre cliente
		JLabel lblNombreCliente = new JLabel("Nombre cliente");
		lblNombreCliente.setBounds(10, 72, 90, 14);
		frame.getContentPane().add(lblNombreCliente);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(110, 69, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		// Telefono
		JLabel lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setBounds(10, 125, 60, 14);
		frame.getContentPane().add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(110, 122, 86, 20);
		frame.getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		
		// Fax
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(10, 178, 46, 14);
		frame.getContentPane().add(lblFax);
		
		txtFax = new JTextField();
		txtFax.setBounds(110, 175, 86, 20);
		frame.getContentPane().add(txtFax);
		txtFax.setColumns(10);
		
		// Email
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 231, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(110, 228, 86, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		// Password
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setBounds(253, 72, 80, 14);
		frame.getContentPane().add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(360, 69, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		// Direccion
		JLabel lblDireccion = new JLabel("Direcci\u00F3n");
		lblDireccion.setBounds(253, 125, 60, 14);
		frame.getContentPane().add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(360, 122, 86, 20);
		frame.getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);
		
		// Ciudad
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(253, 178, 46, 14);
		frame.getContentPane().add(lblCiudad);
		
		// Tipo documento
		JLabel lblTipoDocumento = new JLabel("Tipo documento");
		lblTipoDocumento.setBounds(300, 231, 95, 14);
		frame.getContentPane().add(lblTipoDocumento);
		
		// RBoton DNI
		final JRadioButton rdbtnDNI = new JRadioButton("DNI");
		rdbtnDNI.setBounds(258, 252, 109, 23);
		grupoRBotones.add(rdbtnDNI);
		frame.getContentPane().add(rdbtnDNI);
		
		// RBoton NIE
		final JRadioButton rdbtnNIE = new JRadioButton("NIE");
		rdbtnNIE.setBounds(369, 252, 109, 23);
		grupoRBotones.add(rdbtnNIE);
		frame.getContentPane().add(rdbtnNIE);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(298, 282, 86, 20);
		frame.getContentPane().add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(360, 175, 86, 20);
		frame.getContentPane().add(txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblCodigoCliente = new JLabel("C\u00F3digo cliente");
		lblCodigoCliente.setBounds(10, 285, 90, 14);
		frame.getContentPane().add(lblCodigoCliente);
		
		txtCodigoCliente = new JTextField();
		txtCodigoCliente.setBounds(110, 282, 86, 20);
		frame.getContentPane().add(txtCodigoCliente);
		txtCodigoCliente.setColumns(10);
		
		
		
		
		// Boton para crear un cliente
		JButton btnCrear = new JButton("CREAR");
		btnCrear.setBounds(107, 390, 89, 23);
		frame.getContentPane().add(btnCrear);
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Cliente c1 = ClienteBuilder.buildCliente(Integer.parseInt(txtCodigoCliente.getText()), txtNombre.getText(),
							txtTelefono.getText(), txtFax.getText(), txtDireccion.getText(), txtCiudad.getText(),
							txtEmail.getText(), txtPassword.getText(), null, txtDocumento.getText());
					
					clienteDao.guardar(c1);
					
					for(Cliente c : clientes) {
						System.out.println(c.toString());
					}
					
				} catch (NumberFormatException | ExcepcionDuplicidad | ExcepcionEmail | ExcepcionDNI
						| ExcepcionNIE e1) {
					e1.printStackTrace();
				}
			}
		});
		
		// Boton para borrar todos los campos
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(244, 390, 89, 23);
		frame.getContentPane().add(btnBorrar);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCodigoCliente.setText(null);
				txtNombre.setText(null);
				txtTelefono.setText(null);
				txtFax.setText(null);
				txtDireccion.setText(null);
				txtCiudad.setText(null);
				txtEmail.setText(null);
				txtPassword.setText(null);
				txtDocumento.setText(null);
				grupoRBotones.clearSelection();
			}
		});
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(173, 427, 89, 23);
		frame.getContentPane().add(btnMenu);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main.main(null);
			}
		});
		
	}
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	ClienteDao clienteDao = new ClienteDao(clientes);
}
