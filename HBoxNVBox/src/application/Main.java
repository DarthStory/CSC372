package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	BorderPane root;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new BorderPane();
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
	
	public void load() {
		
		Label label1 = new Label("Label1");
		Label label2 = new Label("Label2");
		Label label3 = new Label("Label3");
		Label label4 = new Label("Label4 ");
		Label label5 = new Label("Label5 ");
		Label label6 = new Label("Label6 ");
		
		VBox vbox = new VBox();
		vbox.getChildren().add(label1);
		vbox.getChildren().add(label2);
		vbox.getChildren().add(label3);
		
		HBox hbox = new HBox();
		hbox.getChildren().add(label4);
		hbox.getChildren().add(label5);
		hbox.getChildren().add(label6);
		
		root.setTop(hbox);
		root.setLeft(vbox);
		root.setRight(new Label("Right"));
		root.setBottom(new Label("Bottom"));
		root.setCenter(new Label("Center"));
		 
	}
}