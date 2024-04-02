package application;
	
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	static AnchorPane root;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new AnchorPane();
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
		// create checkboxes
		CheckBox c1 = new CheckBox("Option 1");
		CheckBox c2 = new CheckBox("Option 2");
		
		// create vbox to store checkboxes
		VBox vbox = new VBox();
		vbox.getChildren().addAll(c1,c2);
		vbox.setSpacing(20);
		//adding the vbox to root
		root.getChildren().add(vbox);
		
		// creating the event handler or the checkbox
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if(c1.isSelected() && c2.isSelected()) {
					System.out.println("They are both checked");
				}
				else if(c1.isSelected()) {
					System.out.println("Checked 1");
				}
				else if(c2.isSelected()) {
					System.out.println("Checked 2");
				}
			}
		};
		// adding the event handler to an action
		c1.setOnAction(event);
		c2.setOnAction(event);
	}
}
