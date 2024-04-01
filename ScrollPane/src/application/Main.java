package application;
	
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	
	AnchorPane root;
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
		
		Label firstName = new Label("First Name");
		firstName.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
		Label lastName = new Label("Last Name");
		lastName.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
		// scroll pane that will scroll if the contents exceed the area of the pane
		ScrollPane scroll = new ScrollPane();
		scroll.setPrefSize(100, 100);
		// vbox for scroll
		VBox vbox = new VBox();
		vbox.getChildren().add(firstName);
		vbox.getChildren().add(lastName);
		
		// add content for Vbox in a scroll
		scroll.setContent(vbox);
		// add scroll to the AnchorPane
		root.getChildren().add(scroll);
		
	}
}
