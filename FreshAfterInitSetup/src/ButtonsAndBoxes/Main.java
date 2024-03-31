package ButtonsAndBoxes;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	BorderPane root;
	Scene scene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// Window
			root = new BorderPane();
			// set values of the window, and set the scene
			scene = new Scene(root,400,400);
			// add css file
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// setting the staget to the current scene
			primaryStage.setScene(scene);
			// showing the scene
			primaryStage.show();
			
			load();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void load() throws FileNotFoundException{
		
	}
}