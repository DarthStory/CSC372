package panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {
	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon = new ImageIcon("Teddy No-Legs.jpg");
		
		
		JLabel label = new JLabel(); // Setup label
		label.setText("Hi!"); // test with label
		label.setIcon(icon); // icon in folder, or you can write the filepath
		label.setVerticalAlignment(JLabel.BOTTOM); // this will set TOP, CENTER, BOTTOM of ImageIcon
		label.setHorizontalAlignment(JLabel.RIGHT);// set text LEFT, CENTER, RIGHT of ImageIcon
		label.setBounds(0, 0, 250, 250);
		
		JPanel redpanel = new JPanel(); // Setup JPanel
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0, 0, 250, 250);
		redpanel.setLayout(null);
		
		JPanel bluepanel = new JPanel(); // Setup JPanel
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250, 0, 250, 250);
		bluepanel.setLayout(null);
		
		JPanel greenpanel = new JPanel(); // Setup JPanel
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0, 250, 500, 250);
		greenpanel.setLayout(null);
		
		JFrame frame = new JFrame(); // Setup JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		greenpanel.add(label);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		
		
		
	}
}
