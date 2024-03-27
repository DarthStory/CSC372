package Image;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame() {
		// JFrame = GUI window to add components to
			
//		JFrame frame = new JFrame(); // creates a frame
		this.setTitle("JFrame title goes here"); //sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false);// prevent frame from being resized
		this.setSize(420,420); // sets the x-dimension, and y-dimension of frame
		this.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("Teddy No-Legs.jpg"); // create an ImageIcon
		this.setIconImage(image.getImage()); // change icon of this
//		this.getContentPane().setBackground(Color.orange); // set color preset
//		this.getContentPane().setBackground(new Color(240,50,120));
		this.getContentPane().setBackground(new Color(0xFFFFFF)); // Hexidecimal color
			
			

	}
}
