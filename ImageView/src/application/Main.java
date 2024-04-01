package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


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
	
	public void load() throws FileNotFoundException{

		
//		FileInputStream path = new FileInputStream("Teddy No-Legs.jpg");
//		
//		Image image = new Image(path);
		
		Image image = new Image(new FileInputStream("Teddy No-Legs.jpg"));
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitHeight(250);
		imageView.setFitWidth(175);
		
		// to preserve the correct ratio dimensions
		imageView.setPreserveRatio(true);
		
		root.getChildren().add(imageView);
		
		
	}
	
}
