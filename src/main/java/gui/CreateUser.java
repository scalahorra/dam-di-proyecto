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
		JLabel lblNewLabel = new JLabel("Creaci\u00F3n de CLIENTE");
		lblNewLabel.setBounds(10, 11, 120, 30);
		frame.getContentPane().add(lblNewLabel);
		
		// Nombre cliente
		JLabel lblNewLabel_1 = new JLabel("Nombre cliente");
		lblNewLabel_1.setBounds(10, 72, 90, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(110, 69, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// Telefono
		JLabel lblNewLabel_2 = new JLabel("Tel\u00E9fono");
		lblNewLabel_2.setBounds(10, 125, 60, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 122, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		// Fax
		JLabel lblNewLabel_3 = new JLabel("Fax");
		lblNewLabel_3.setBounds(10, 178, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 175, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		// Email
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(10, 231, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 228, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		// Password
		JLabel lblNewLabel_5 = new JLabel("Contrase\u00F1a");
		lblNewLabel_5.setBounds(253, 72, 80, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(360, 69, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		// Direccion
		JLabel lblNewLabel_6 = new JLabel("Direcci\u00F3n");
		lblNewLabel_6.setBounds(253, 125, 60, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(360, 122, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		// Ciudad
		JLabel lblNewLabel_7 = new JLabel("Ciudad");
		lblNewLabel_7.setBounds(253, 178, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza", "M\u00E1laga", "Murcia", "Palma", "Las Palmas", "Bilbao"}));
		comboBox.setBounds(360, 174, 86, 22);
		frame.getContentPane().add(comboBox);
		
		// Tipo documento
		JLabel lblNewLabel_8 = new JLabel("Tipo documento");
		lblNewLabel_8.setBounds(300, 231, 95, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("DNI");
		chckbxNewCheckBox.setBounds(263, 252, 50, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("NIE");
		chckbxNewCheckBox_1.setBounds(381, 252, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JButton btnNewButton = new JButton("CREAR");
		btnNewButton.setBounds(107, 329, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BORRAR");
		btnNewButton_1.setBounds(253, 329, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
	}
}
