package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	Scene scene;
	BorderPane root;
	GridPane grid;
	GridPane grid2;
	Button btn1 = new Button();
	Button btn2 = new Button();
	Button btn3 = new Button();
	Button btn4 = new Button();
	Button btn5 = new Button();
	Button btn6 = new Button();
	Button btn7 = new Button();
	Button btn8 = new Button();
	Button btn9 = new Button();
	Button btn10 = new Button();
	Button btn11 = new Button();
	Button btn12 = new Button();
	Button btn13 = new Button();
	Button btn14 = new Button();
	Button btn15 = new Button();
	Button btn16 = new Button();
	Button btn17 = new Button();
	Button btn18 = new Button();
	Button btn19 = new Button();
	Button btn20 = new Button();
	Button btn21 = new Button();
	Button btn22 = new Button();
	Button btn23 = new Button();
	Button btn24 = new Button();
	
	Button mry1 = new Button();
	Button mry2 = new Button();
	Button mry3 = new Button();
	Button mry4 = new Button();
	Button mry5 = new Button();
	Button mry6 = new Button();
	
	TextField text = new TextField();
	
	Float m1;
	
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new BorderPane();
			scene = new Scene(root,480,480);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("CalculatorMode!");
			primaryStage.getIcons().add(new Image(new FileInputStream("Calc.png")));
			primaryStage.setResizable(false);
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
		
		root.setId("root");
		
		grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		grid2 = new GridPane();
		grid2.setMinHeight(10);
		grid2.setMinWidth(80);
		grid2.setAlignment(Pos.CENTER);
		text.setPrefSize(480, 95);
		text.setAlignment(Pos.CENTER);
		text.setId("text");
		
		btn1.setPrefSize(120, 60);
		btn1.setText("%");
		btn1.setId("btn");
		btn2.setPrefSize(120, 60);
		btn2.setText("CE");
		btn2.setId("btn");
		btn3.setPrefSize(120, 60);
		btn3.setText("C");
		btn3.setId("btn");
		btn4.setPrefSize(120, 60);
		btn4.setText("<-");
		btn4.setId("btn");
		btn5.setPrefSize(120, 60);
		btn5.setText("1/x");
		btn5.setId("btn");
		btn6.setPrefSize(120, 60);
		btn6.setText("x2");
		btn6.setId("btn");
		btn7.setPrefSize(120, 60);
		btn7.setText("sqrRoot");
		btn7.setId("btn");
		btn8.setPrefSize(120, 60);
		btn8.setText("/");
		btn8.setId("btn");
		btn9.setPrefSize(120, 60);
		btn9.setText("7");
		btn9.setId("btn");
		btn10.setPrefSize(120, 60);
		btn10.setText("8");
		btn10.setId("btn");
		btn11.setPrefSize(120, 60);
		btn11.setText("9");
		btn11.setId("btn");
		btn12.setPrefSize(120, 60);
		btn12.setText("X");
		btn12.setId("btn");
		btn13.setPrefSize(120, 60);
		btn13.setText("4");
		btn13.setId("btn");
		btn14.setPrefSize(120, 60);
		btn14.setText("5");
		btn14.setId("btn");
		btn15.setPrefSize(120, 60);
		btn15.setText("6");
		btn15.setId("btn");
		btn16.setPrefSize(120, 60);
		btn16.setText("-");
		btn16.setId("btn");
		btn17.setPrefSize(120, 60);
		btn17.setText("1");
		btn17.setId("btn");
		btn18.setPrefSize(120, 60);
		btn18.setText("2");
		btn18.setId("btn");
		btn19.setPrefSize(120, 60);
		btn19.setText("3");
		btn19.setId("btn");
		btn20.setPrefSize(120, 60);
		btn20.setText("+");
		btn20.setId("btn");
		btn21.setPrefSize(120, 60);
		btn21.setText("+/-");
		btn21.setId("btn");
		btn22.setPrefSize(120, 60);
		btn22.setText("0");
		btn22.setId("btn");
		btn23.setPrefSize(120, 60);
		btn23.setText(".");
		btn23.setId("btn");
		btn24.setPrefSize(120, 60);
		btn24.setText("=");
		btn24.setId("btn");
		

		mry1.setPrefSize(80, 10);
		mry1.setText("MC");
		mry1.setId("btn");
		mry2.setPrefSize(80, 10);
		mry2.setText("MR");
		mry2.setId("btn");
		mry3.setPrefSize(80, 10);
		mry3.setText("M+");
		mry3.setId("btn");
		mry4.setPrefSize(80, 10);
		mry4.setText("M-");
		mry4.setId("btn");
		mry5.setPrefSize(80, 10);
		mry5.setText("MS");
		mry5.setId("btn");
		mry6.setPrefSize(80, 10);
		mry6.setText("Mv");
		mry6.setId("btn");

		
		root.setTop(text);
		root.setCenter(grid2);
		root.setBottom(grid);
		grid2.addRow(0, mry1, mry2, mry3, mry4, mry5, mry6);
		grid.addRow(1, btn1, btn2, btn3, btn4);
		grid.addRow(2, btn5, btn6, btn7, btn8);
		grid.addRow(3, btn9, btn10, btn11, btn12);
		grid.addRow(4, btn13, btn14, btn15, btn16);
		grid.addRow(5, btn17, btn18, btn19, btn20);
		grid.addRow(6, btn21, btn22, btn23, btn24);
		
		btn1.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				String entry = text.getText();
				m1 = Float.parseFloat(entry);
				
			}
		});
		
	}
	
	
}
