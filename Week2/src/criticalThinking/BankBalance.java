package criticalThinking;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BankBalance extends JFrame implements ActionListener {
	
	JButton submitButton;
	JButton depButton;
	JButton withButton;
	JTextField userInput;
	JLabel balanceLabel;
	String balance;
	String deposit;
	String withdrawl;
	String numStore;
	

	public BankBalance() {
		
		JFrame frame = new JFrame();
		frame.setTitle("(GUI) Bank Balance application");
		
		// label for the output
		balanceLabel = new JLabel();
			balanceLabel.setBounds(250, 400, 100, 50);
			balanceLabel.setForeground(Color.BLACK);
			balanceLabel.setBackground(Color.white);
			balanceLabel.setHorizontalAlignment(JLabel.CENTER);
			balanceLabel.setVerticalAlignment(JLabel.CENTER);
			balanceLabel.setFont(new Font("Ariel",Font.BOLD,15));
			balanceLabel.setOpaque(false);
			balanceLabel.setVisible(false);
		
		// box for input from user
		userInput = new JTextField();
			userInput.setPreferredSize(new Dimension(100,50));
			userInput.setBounds(200, 50, 200, 50);
			userInput.setEditable(true);
			userInput.setText("");
			userInput.setFont(new Font("Ariel", Font.BOLD, 14));
			userInput.setHorizontalAlignment(JTextField.CENTER);
			userInput.addActionListener(this);
		
		// submit button to enter input from user into the program
		submitButton = new JButton("Enter Balance Amount");
			submitButton.setHorizontalAlignment(JTextField.CENTER);
			submitButton.addActionListener(this);
			submitButton.setFocusable(false);
			submitButton.setBounds(200, 25, 200, 25);
		
		
		// panels for organization
		JPanel submitPanel = new JPanel();
			submitPanel.setBackground(Color.black);
			submitPanel.setBounds(0,0,600,200);
			submitPanel.setLayout(new GridLayout(1,1));
		JPanel processPanel = new JPanel();
			processPanel.setBackground(Color.black);
			processPanel.setBounds(0,200,600,200);
			processPanel.setLayout(new GridLayout(1,2));
		JPanel outputPanel = new JPanel();
			outputPanel.setBackground(Color.black);
			outputPanel.setBounds(0, 400, 600, 200);
			outputPanel.setLayout(new GridLayout(1,1));
		
		// Deposit Button
		depButton = new JButton();
		depButton.setBounds(0,200, 300, 200);
		depButton.addActionListener(this);
		// button features
		depButton.setText("Deposit");
		depButton.setFocusable(false);
		depButton.setForeground(Color.blue);
		depButton.setBackground(Color.cyan);
		depButton.setFont(new Font("Ariel", Font.BOLD, 25));
		depButton.setBorder(BorderFactory.createEtchedBorder());
		// Withdrawal Button
		withButton = new JButton();
		withButton.setBounds(300,200, 300, 200);
		withButton.addActionListener(this);
		// button features
		withButton.setText("Withdrawl");
		withButton.setFocusable(false);
		withButton.setForeground(Color.white);
		withButton.setBackground(Color.GREEN);
		withButton.setFont(new Font("Ariel", Font.BOLD, 25));
		withButton.setBorder(BorderFactory.createEtchedBorder());
		
		
		
				
		// Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(balanceLabel);
		frame.add(submitButton);
		frame.add(userInput);
		frame.add(depButton);
		frame.add(withButton);
		frame.add(submitPanel);
		frame.add(outputPanel);
		frame.setSize(600, 600);
		frame.setLayout(getLayout());
		frame.setVisible(true);
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Double tempNum = 0.0;
		Double tempNum1 = 0.0;
		Double output = 0.0;
		// State balance
		if(e.getSource() == submitButton) {
			numStore = userInput.getText();
			balanceLabel.setText(numStore);
			balanceLabel.setOpaque(true);
			balanceLabel.setVisible(true);
		// Deposit button	
		}else if(e.getSource() == depButton){
			deposit = userInput.getText();
			tempNum = Double.parseDouble(deposit);
			tempNum1 = Double.parseDouble(numStore);
			output = tempNum + tempNum1;
			balanceLabel.setText(Double.toString(output));
			balanceLabel.setOpaque(true);
			balanceLabel.setVisible(true);
			numStore = Double.toString(output);
		// Withdrawal button	
		}else if(e.getSource() == withButton){
			withdrawl = userInput.getText();
			tempNum = Double.parseDouble(withdrawl);
			tempNum1 = Double.parseDouble(numStore);
			output = tempNum1 - tempNum;
			balanceLabel.setText(Double.toString(output));
			balanceLabel.setOpaque(true);
			balanceLabel.setVisible(true);
			numStore = Double.toString(output);
		}
	}
}


