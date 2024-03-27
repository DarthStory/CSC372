package label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string text, an image, or both
		ImageIcon image = new ImageIcon("Teddy No-Legs.jpg");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); // create a label
		label.setText("Bro, do you even code?"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT, CENTER, RIGHT of ImageIcon
		label.setVerticalTextPosition(JLabel.TOP); // this will set TOP, CENTER, BOTTOM of ImageIcon
		label.setForeground(Color.green); // will set color of font
		label.setFont(new Font("Ariel",Font.BOLD, 25)); // will set font of text
		//label.setIconTextGap(50); // set gap of text to image
		label.setBackground(Color.black); // set background color
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set Horizontal position of icon + text within label
		//label.setBounds(125, 125, 250, 250);// set x, y postion within frame as well as dimensions
				
		
		JFrame frame = new JFrame(); // Setup JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on close
		//frame.setSize(500,500); // size of the frame
		//frame.setLayout(null);
		frame.setVisible(true); // make it visible
		frame.add(label); // add a label
		frame.pack();// make sure you use pack at the end after the components

	}

}
