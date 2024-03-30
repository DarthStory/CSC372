package guiBankApplication;

import java.text.DecimalFormat;

import java.util.InputMismatchException;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankBalance extends JFrame implements ActionListener {
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	JFrame frame;
	JPanel panel;
	JPanel panel1;
	JLabel instruction1;
	JLabel instruction2;
	JLabel balanceLabel;
	JTextField userInput;
	JTextField depositField;
	JTextField withdrawField;
	JButton submitButton;
	JButton depositButton;
	JButton withdrawButton;
	JButton displayButton;
	JButton exitButton;
	String tempNum;
	
	double balance = 0.00;

	public BankBalance() {
		
		// Frame setup
		frame = new JFrame("(GUI) Bank Balance Application");
		
		// panel Setup
		panel = new JPanel();
		panel1 = new JPanel();
		
		// Label setups
		instruction1 = new JLabel("Enter initial balance, then click submit.");
		instruction1.setVisible(true);
		
		instruction2 = new JLabel("Enter amount, then click Deposit or Withdraw.");
		instruction2.setVisible(false);
		
		balanceLabel = new JLabel("Balance: " + moneyFormat.format(balance));
		
		// TestField setups
		userInput = new JTextField();
		userInput.setPreferredSize(new Dimension(100,25));
		userInput.setBounds(100, 50, 200, 50);
		userInput.setEditable(true);
		userInput.setText("");
		userInput.setFont(new Font("Ariel", Font.BOLD, 14));
		userInput.setHorizontalAlignment(JTextField.CENTER);
		
		// button setups
		submitButton = new JButton("Submit");
		submitButton.setBounds(200,0,200,25);
		submitButton.setFocusable(false);
		submitButton.setBackground(Color.cyan);
		submitButton.setVisible(true);
		submitButton.addActionListener(this);
		
		depositButton = new JButton("Deposit");
		depositButton.setBounds(0, 50, 200, 25);
		depositButton.setBackground(Color.cyan);
		depositButton.setFocusable(false);
		depositButton.setVisible(false);
		depositButton.addActionListener(this);
		
		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(100, 0, 200, 25);
		withdrawButton.setBackground(Color.cyan);
		withdrawButton.setFocusable(false);
		withdrawButton.setVisible(false);
		withdrawButton.addActionListener(this);
		
		displayButton = new JButton("Display Balance");
		displayButton.setFocusable(false);
		displayButton.setBackground(Color.cyan);
		displayButton.setVisible(false);
		displayButton.addActionListener(this);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(100, 200, 200, 25);
		exitButton.setBackground(Color.cyan);
		exitButton.setFocusable(false);
		exitButton.setVisible(false);
		exitButton.addActionListener(this);
		
		// applying panels
		panel.add(instruction1);
		panel.add(instruction2);
		panel.add(userInput);
		panel.add(submitButton);		
		panel.add(depositButton);
		panel.add(withdrawButton);
		panel.add(displayButton);
		panel.add(balanceLabel);
		panel.add(exitButton);
		
		// setting up Frame
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLayout(new BorderLayout(10,10));
		frame.setSize(300,300);
		frame.setVisible(true);
			
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void updateBalanceLabel() {
		balanceLabel.setText("Balance: " + moneyFormat.format(balance));
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {		
		if(event.getSource() == submitButton) {
			try {
			tempNum = userInput.getText();
			balance = Double.parseDouble(tempNum);
			}catch (NumberFormatException e) {}
			submitButton.setVisible(false);
			instruction1.setVisible(false);
			instruction2.setVisible(true);
			depositButton.setVisible(true);
			withdrawButton.setVisible(true);
			displayButton.setVisible(true);
			userInput.setText("");
			updateBalanceLabel();
		}
		else if (event.getSource() == depositButton) {
			try {
			double depositAmount = Double.parseDouble(userInput.getText());
			deposit(depositAmount);
			}catch (NumberFormatException e) {}
			userInput.setText("");
			updateBalanceLabel();
		}
		else if(event.getSource() == withdrawButton) {
			try {
			double withdrawAmount = Double.parseDouble(userInput.getText());
			withdraw(withdrawAmount);
			}catch (NumberFormatException e) {}
			userInput.setText("");
			updateBalanceLabel();
		}
		else if(event.getSource() == displayButton) {
			userInput.setText("");
			depositButton.setVisible(false);
			withdrawButton.setVisible(false);
			userInput.setVisible(false);
			displayButton.setVisible(false);
			exitButton.setVisible(true);
			instruction2.setVisible(false);
			updateBalanceLabel();
		}
		else if(event.getSource() == exitButton) {
			System.exit(0);
		}
	}	
}
