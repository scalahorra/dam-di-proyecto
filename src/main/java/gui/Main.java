package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// Menu superior
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		frame.getContentPane().add(menuBar);
		
		// SubMenu superior - cliente
		JMenu mnNewMenu = new JMenu("Cliente");
		menuBar.add(mnNewMenu);
		
		// Subsubmenu superior - crear
		JMenuItem mntmNewMenuItem = new JMenuItem("Crear");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CreateUser.main(null);				
			}
			
		});
		
		// Subsubmenu superior - modificar
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Modificar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		// Subsubmenu superior - borrar
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Borrar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		// Panel
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(193, 207, 337, 141);
		frame.getContentPane().add(tabbedPane);
		
		// Pestana panel - clientes
		JToolBar toolBar = new JToolBar();
		tabbedPane.addTab("Clientes", null, toolBar, null);
		
		// Pestana panel - pedidos
		JToolBar toolBar_1 = new JToolBar();
		tabbedPane.addTab("Pedidos", null, toolBar_1, null);
	}
}
