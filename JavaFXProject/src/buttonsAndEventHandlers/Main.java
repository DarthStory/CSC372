package buttonsAndEventHandlers;
	
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
	
	public void load() throws FileNotFoundException {
		
		FileInputStream input = new FileInputStream("Teddy No-Legs.jpg");
		Image image = new Image(input);
		ImageView img = new ImageView(image);
		
		img.setFitWidth(50);
		img.setFitHeight(50);
		
		// to add put a "," between the elements
		Button btn = new Button("", img);
		
		// 2 ways to handle and event for a Button
		// this way is only for a button
		btn.setOnAction(new EventHandler <ActionEvent>() {
			
			public void handle(ActionEvent arg0) {
				System.out.println("Button Pressed");
			}
		});
		// event handler that is more general that you specify what is happening. 
		btn.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				System.out.println("Pressed");
				btn.setText("Pressed");
			}
		});
	
		
		root.getChildren().add(btn);
	}
}
