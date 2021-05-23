package jfxcontrolador;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainEjemplo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader= new FXMLLoader(getClass().getResource("jfxvista/EjemploVista.fxml"));
		Parent root= loader.load();
		Scene scene= new Scene(root);
		Stage stage =  new Stage();
		stage.setScene(scene);
		stage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
