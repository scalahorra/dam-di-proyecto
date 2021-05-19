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
		JLabel textoUsuario = new JLabel("Usuario");
		textoUsuario.setBounds(10,20,80,25);
		frame.getContentPane().add(textoUsuario);
		
		// Campo usuario
		JTextField campoUsuario = new JTextField(20);
		campoUsuario.setBounds(100,20,165,25);
		frame.getContentPane().add(campoUsuario);
		
		
		// Texto password
		JLabel textoPassword = new JLabel("Password");
		textoPassword.setBounds(10,50,80,25);
		frame.getContentPane().add(textoPassword);
		
		// Campo password
		JPasswordField campoPassword = new JPasswordField(20);
		campoPassword.setBounds(100,50,165,25);
		frame.getContentPane().add(campoPassword);
		
		
		//Boton login
		JButton botonLogin = new JButton("login");
		botonLogin.setBounds(10,80,80,25);
		frame.getContentPane().add(botonLogin);
		
		
		// Boton mostrarPassword
		JButton botonMostrarPassword = new JButton();
		botonMostrarPassword.setBounds(238,80,25,25);
		frame.getContentPane().add(botonMostrarPassword);
		
	}

}
