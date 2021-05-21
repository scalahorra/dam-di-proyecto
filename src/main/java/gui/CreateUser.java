package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CreateUser {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		
		textField = new JTextField();
		textField.setBounds(110, 69, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// Telefono
		JLabel lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setBounds(10, 125, 60, 14);
		frame.getContentPane().add(lblTelefono);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 122, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		// Fax
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(10, 178, 46, 14);
		frame.getContentPane().add(lblFax);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 175, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		// Email
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 231, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 228, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		// Password
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setBounds(253, 72, 80, 14);
		frame.getContentPane().add(lblPassword);
		
		textField_4 = new JTextField();
		textField_4.setBounds(360, 69, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		// Direccion
		JLabel lblDireccion = new JLabel("Direcci\u00F3n");
		lblDireccion.setBounds(253, 125, 60, 14);
		frame.getContentPane().add(lblDireccion);
		
		textField_5 = new JTextField();
		textField_5.setBounds(360, 122, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		// Ciudad
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(253, 178, 46, 14);
		frame.getContentPane().add(lblCiudad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza", "M\u00E1laga", "Murcia", "Palma", "Las Palmas", "Bilbao"}));
		comboBox.setBounds(360, 174, 86, 22);
		frame.getContentPane().add(comboBox);
		
		// Tipo documento
		JLabel lblTipoDocumento = new JLabel("Tipo documento");
		lblTipoDocumento.setBounds(300, 231, 95, 14);
		frame.getContentPane().add(lblTipoDocumento);
		
		JCheckBox chckbxDNI = new JCheckBox("DNI");
		chckbxDNI.setBounds(263, 252, 50, 23);
		frame.getContentPane().add(chckbxDNI);
		
		JCheckBox chckbxNIE = new JCheckBox("NIE");
		chckbxNIE.setBounds(381, 252, 97, 23);
		frame.getContentPane().add(chckbxNIE);
		
		JButton btnCrear = new JButton("CREAR");
		btnCrear.setBounds(107, 329, 89, 23);
		frame.getContentPane().add(btnCrear);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(253, 329, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		
		
	}
}
