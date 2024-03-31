package application;
	
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	
	static FlowPane root;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new FlowPane();
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
		// distance between elements
		root.setVgap(20);
		root.setHgap(20);
		
		root.getChildren().add(new Button("Button1"));
		root.getChildren().add(new Button("Button2"));
		root.getChildren().add(new Button("Button3"));
		root.getChildren().add(new Button("Button4"));
		root.getChildren().add(new Button("Button5"));
		root.getChildren().add(new Button("Button6"));
		root.getChildren().add(new Button("Button7"));
		root.getChildren().add(new Button("Button8"));
		root.getChildren().add(new Button("Button9"));
		
	}
}