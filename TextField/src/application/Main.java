package application;
	
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	static VBox root;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new VBox();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			load();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void load() throws FileNotFoundException {
		
		Label firstName = new Label("First Name");
		Label lastName = new Label("Last Name");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		Button btn = new Button("Submit"); // adding CSS
		
		// add to the CSS file
//		firstName.setId("firstNameLabel");
//		lastName.setId("lastNameLabel");
//		
//		// one way to set CSS
//		btn.setStyle("-fx-background-color:#000000");
//		
		// this adds the elements horizontally in rows
//		root.addRow(0, firstName, tf1);
//		root.addRow(1, lastName, tf2);
//		root.addRow(2, btn);
		
		btn.setOnAction(e -> {
			System.out.println("First Name: " + tf1.getText() + " Last Name: " + tf2.getText());
			tf1.setText("");
			tf2.setText("");
		});
//		
		// this adds the elements vertically in columns
		root.getChildren().addAll(firstName, tf1, lastName, tf2, btn);
		
		
	}
}