package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


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
		
		// to assign an image file, you must put the file in the project (for now)
		FileInputStream input = new FileInputStream("Teddy No-Legs.jpg");
		Image image = new Image(input);
		ImageView img = new ImageView(image);
		
		img.setFitWidth(200);
		img.setFitHeight(300);
		
		// to put more than one parameter on a button use a ","
		Button btn = new Button("Press Me", img);
		
		// this way only works with a button
		btn.setOnAction(new EventHandler <ActionEvent>() {
			public void handle(ActionEvent arg0) {
				System.out.println("pressed");
			}
		});
		// General handler for most events
		btn.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				System.out.println("Pressed again");
				btn.setText("Pressed");
			}
		});
		
		root.getChildren().add(btn);
		
	}
}