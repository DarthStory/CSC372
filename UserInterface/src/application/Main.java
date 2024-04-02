package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;


public class Main extends Application {
	
	static BorderPane root;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("User Interface");
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
		
		HBox btns = new HBox();
		
		Button btn1 = new Button("1");
		btn1.setMinSize(100, 100);
		Button btn2 = new Button("2");
		btn2.setMinSize(100, 100);
		Button btn3 = new Button("3");
		btn3.setMinSize(100, 100);
		Button btn4 = new Button("4");
		btn4.setMinSize(100, 100);
		
		TextField box = new TextField("Here");
		box.setEditable(true);
		box.setStyle("-fx-alignment: CENTER;");
		box.setMinSize(300, 400);
		
		Timeline box1 = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
	            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	            String currentTime = sdf.format(new Date());
	            box.setText(currentTime);
	        }));
	        
	        
		

		
		btn1.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				System.out.println("1");
				btn1.setText("1");
				box1.setCycleCount(Animation.INDEFINITE);
				box1.play();
			}
		});
		
		btn2.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				String text = box.getText();
				saveToFile(text);
				
			}
		});
		
		btn3.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				System.out.println("3");
				btn3.setText("3");
			}
		});
		
		btn4.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				System.out.println("4");
				btn4.setText("4");
			}
		});
		
		
		btns.getChildren().addAll(btn1,btn2,btn3,btn4);

		root.setTop(btns);
		root.setCenter(box);

		
	}
	private void saveToFile(String text) {
		File file = new File("C:\\Temp\\Log.txt"); // You can specify the full path if needed
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
	
}
