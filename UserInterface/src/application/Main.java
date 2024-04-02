package application;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
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
	static Scene scene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new BorderPane();
			scene = new Scene(root,400,400);
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
		
		TextField box = new TextField("");
		box.setEditable(true);
		box.setStyle("-fx-alignment: CENTER;");
		box.setMaxSize(200, 200);
		
		Timeline box1 = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
	            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	            String currentTime = sdf.format(new Date());
	            box.setText(currentTime);
	        }));
		   
	        
		

		
		btn1.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				box1.setCycleCount(Animation.INDEFINITE);
				box1.play();
				
			}
		});
		
		btn2.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				String text = box.getText();
				box1.pause();
				saveToFile(text);
				
			}
		});
		
		btn3.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				// Generate random green color
		        Random random = new Random();
		        int red = 0; // No red component
		        int green = random.nextInt(256); // Random green component
		        int blue = 0; // No blue component
		        // # is literal, % Indicates that a format specifier follows
		        // 0 Indicates that leading zeros should be including if necessary (01,08)
		        // 2 indicates that the output should be at least 2 characters wide (XX)
		        // 'x' Indicates that the argument should be formatted as a hexadecimal integer
		        // "#05fa83" or "#ffffff" or "#00000f"
		        String color = String.format("#%02x%02x%02x", red, green, blue); 
				root.setStyle("-fx-background-color: " + color);
		        
			}
		});
		
		btn4.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				System.exit(0);
			}
		});
		
		
		btns.getChildren().addAll(btn1,btn2,btn3,btn4);
		
		root.setTop(btns);
		root.setCenter(box);

		
	}
	public void saveToFile(String text) {
		File file = new File("C:\\Temp\\Log.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
	
}
