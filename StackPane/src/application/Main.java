package application;
	
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	static StackPane root;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new StackPane();
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
		
		Button btn1 = new Button("Button1");
		Button btn2 = new Button("Button2");
		
		btn1.setMinHeight(150);
		btn1.setMinHeight(150);
		
		// you can add buttons 2 ways, individually, or all at once
//		root.getChildren().add(btn1);
//		root.getChildren().add(btn2);
		root.getChildren().addAll(btn1,btn2);
	
		
	}
}