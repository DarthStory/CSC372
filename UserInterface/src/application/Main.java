package application;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
		// Creating a HBox to house the buttons. 
		HBox btns = new HBox();
		
		// Constructing the buttons
		Button btn1 = new Button("1");
		btn1.setMinSize(100, 100);
		Button btn2 = new Button("2");
		btn2.setMinSize(100, 100);
		Button btn3 = new Button("3");
		btn3.setMinSize(100, 100);
		Button btn4 = new Button("4");
		btn4.setMinSize(100, 100);
		
		// creating the textField for the text
		TextField box = new TextField("");
		box.setEditable(true);
		box.setStyle("-fx-alignment: CENTER;");
		box.setMaxSize(200, 200);
		
		// loading the Timeline and Duration utilities, setting up the duration in seconds
		Timeline box1 = new Timeline();
		Duration duration = Duration.seconds(1);
		
		// Button events
		btn1.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				// loading the SimpleDateFormat and formatting it for HH:mm assigning the sdf variable
				// loading the date utility and assigning the currentTime variable
				// setting up the variable to represent the current time as formatted. 
				// inserting that time as a text in the box TextField
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");				
				Date currentTime = new Date();				
				String formattedTime = sdf.format(currentTime);
				box.setText(formattedTime);				
			}
		});
		
		btn2.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				// Assigning the text String to the information in the box TextField
				// took this out as I did not start the animation any longer
				// runs saveToFile method below and uses the text TextField data
				String text = box.getText();				
				saveToFile(text);
				
			}
		});
		
		btn3.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				// Generate random int for green 
				// Assigned 0 for both red and blue, then gave green the random number
				/* # is literal, % Indicates that a format specifier follows
		         * 0 Indicates that leading zeros should be including if necessary (01,08)
		         * 2 indicates that the output should be at least 2 characters wide (XX)
		         * 'x' Indicates that the argument should be formatted as a hexadecimal integer
		         * "#05fa83" or "#ffffff" or "#00000f"
		         */
				// added this random green color to root, which was sent to the Scene
		        Random random = new Random();		        
		        int red = 0;
		        int green = random.nextInt(256); 
		        int blue = 0; 		        
		        String color = String.format("#%02x%02x%02x", red, green, blue); 		        
				root.setStyle("-fx-background-color: " + color);
		        
			}
		});
		
		btn4.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent event) {
				// exits the program
				System.exit(0);
			}
		});
		
		// adds all buttons to the "btns" variable
		btns.getChildren().addAll(btn1,btn2,btn3,btn4);
		
		// adds the buttons and textField to the Pane
		root.setTop(btns);
		root.setCenter(box);

		
	}
	// gets an input of "text"
	// creates a file called "Log.txt" and saves it to this directory
	// try/catch handles the IO Exception that needed to be handled
	// applies the FileWriter utility assigning writer as variable
	// writes the file
	public void saveToFile(String text) {		
		File file = new File("C:\\Temp\\Log.txt");		
        try (FileWriter writer = new FileWriter(file)) {        	
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
	
}
