package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Texto usuario
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10,20,80,25);
		frame.getContentPane().add(lblUsuario);
		
		// Campo usuario
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setBounds(100,20,165,25);
		frame.getContentPane().add(txtUsuario);
		
		
		// Texto password
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10,50,80,25);
		frame.getContentPane().add(lblPassword);
		
		// Campo password
		JPasswordField passPassword = new JPasswordField(20);
		passPassword.setBounds(100,50,165,25);
		frame.getContentPane().add(passPassword);
		
		
		//Boton login
		JButton btnLogin = new JButton("login");
		btnLogin.setBounds(10,80,80,25);
		frame.getContentPane().add(btnLogin);
		
		
		// Boton mostrarPassword
		JButton btnMostrarPassword = new JButton();
		btnMostrarPassword.setBounds(238,80,25,25);
		frame.getContentPane().add(btnMostrarPassword);
		
	}

}
