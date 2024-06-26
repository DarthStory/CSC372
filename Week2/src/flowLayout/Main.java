package flowLayout;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		// Flow Layout, places components in a row, sized at their preferred size. 
		// If the horizontal space in the container is too small, 
		// the FlowLayout class uses the next available row. 
		// Leading - left, Center - Center, Trailing - right
		// numbers are spacing
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("0"));
		
		frame.add(panel);
		// needs to be at the end to not cause visibility issues with components. 
		frame.setVisible(true);
	}
}
