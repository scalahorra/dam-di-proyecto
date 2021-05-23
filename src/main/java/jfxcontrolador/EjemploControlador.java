package jfxcontrolador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class EjemploControlador implements Initializable{
	
	@FXML
	private Button btnBoton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	@FXML
	private void click(ActionEvent event) {
		
		System.out.println("Hola mundo");
	}

}
