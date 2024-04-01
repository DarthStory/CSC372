package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


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

		// create group to assign buttons
		ToggleGroup group = new ToggleGroup();
		// create radiobuttons
		RadioButton btn1 = new RadioButton("Button1");
		RadioButton btn2 = new RadioButton("Button2");
		RadioButton btn3 = new RadioButton("Button3");
		RadioButton btn4 = new RadioButton("Button4");
		
		// assign buttons to group
		btn1.setToggleGroup(group);
		btn2.setToggleGroup(group);
		btn3.setToggleGroup(group);
		btn4.setToggleGroup(group);
		
		// put in a vbox so they do not just stack on one another
		VBox vbox = new VBox();
		vbox.getChildren().addAll(btn1, btn2, btn3, btn4);
		// set spacing
		vbox.setSpacing(10);
		
		// call vbox into root(AnchorPane)
		root.getChildren().add(vbox);
		// gets the radiobutton that is selected from the group
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>()	{
			// how to get a button to react when pressed and how to create an output
			// for a specific button pressed. 
			public void changed(ObservableValue<? extends Toggle> ov,
					Toggle old_toggle, Toggle new_toggle) {
				if (group.getSelectedToggle() == btn1) {
					System.out.println("Button 1 Pressed");
				}else {
					System.out.println("Another button was pressed");
				}
			
			}
		});
		
	}
	
}