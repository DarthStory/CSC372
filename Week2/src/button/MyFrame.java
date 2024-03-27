package button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

		JButton button;
	
		MyFrame() {
			
			ImageIcon icon = new ImageIcon("Teddy No-Legs.jpg");
			
			button = new JButton();
			button.setBounds(125, 100, 300, 100);
			button.addActionListener(this);
			button.setText("Badass Button!");
			button.setFocusable(false);
			button.setIcon(icon);
			button.setHorizontalAlignment(JButton.CENTER);
			button.setVerticalAlignment(JButton.CENTER);
			button.setFont(new Font("Ariel", Font.BOLD,25));
			button.setIconTextGap(-15);
			button.setForeground(Color.BLACK);
			button.setBackground(Color.ORANGE);
			button.setBorder(BorderFactory.createEtchedBorder());
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on close
			this.setSize(500,500); // size of the frame
			this.setLayout(null);
			this.setVisible(true); // make it visible
			this.add(button);
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				System.out.println("poo");
			}
			
		}
}
