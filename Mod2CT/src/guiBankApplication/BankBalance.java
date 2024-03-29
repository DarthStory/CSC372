package guiBankApplication;

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
	
	JFrame frame;
	JPanel panel;
	JLabel depositLabel;
	JLabel withdrawLabel;
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
	
	double balance = 0.0;

	public BankBalance() {
		
		// Frame setup
		frame = new JFrame("(GUI) Bank Balance Application");
		
		// panel Setup
		panel = new JPanel();
		
		// Label setups
		depositLabel = new JLabel("Deposit:");
		
		withdrawLabel = new JLabel("Withdraw:");
		
		balanceLabel = new JLabel("Balance: " + balance);
		
		// TestField setups
		userInput = new JTextField();
		userInput.setPreferredSize(new Dimension(100,25));
		userInput.setBounds(200, 50, 200, 50);
		userInput.setEditable(true);
		userInput.setText("");
		userInput.setFont(new Font("Ariel", Font.BOLD, 14));
		userInput.setHorizontalAlignment(JTextField.CENTER);
		
		// button setups
		submitButton = new JButton("Enter Initial Balance");
		submitButton.setBounds(200,0,200,25);
		submitButton.setVisible(true);
		submitButton.addActionListener(this);
		
		depositButton = new JButton("Deposit");
		depositButton.setBounds(0, 50, 200, 25);
		depositButton.setVisible(false);
		depositButton.addActionListener(this);
		
		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(100, 0, 200, 25);
		withdrawButton.setVisible(false);
		withdrawButton.addActionListener(this);
		
		displayButton = new JButton("Display Balance");
		displayButton.addActionListener(this);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(100, 200, 200, 25);
		exitButton.setVisible(false);
		exitButton.addActionListener(this);
		
		panel.add(submitButton);
		panel.add(userInput);
		panel.add(depositButton);
		panel.add(withdrawButton);
		panel.add(displayButton);
		panel.add(balanceLabel);
		panel.add(exitButton);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		balanceLabel.setText("Balance: " + balance);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource() == submitButton) {
			tempNum = userInput.getText();
			balance = Double.parseDouble(tempNum);
			submitButton.setVisible(false);
			depositButton.setVisible(true);
			withdrawButton.setVisible(true);
			userInput.setText("");
			updateBalanceLabel();
		}
		else if (e.getSource() == depositButton) {
			double depositAmount = Double.parseDouble(userInput.getText());
			deposit(depositAmount);
			userInput.setText("");
			updateBalanceLabel();
		}
		else if(e.getSource() == withdrawButton) {
			double withdrawAmount = Double.parseDouble(userInput.getText());
			withdraw(withdrawAmount);
			userInput.setText("");
			updateBalanceLabel();
		}
		else if(e.getSource() == displayButton) {
			userInput.setText("");
			depositButton.setVisible(false);
			withdrawButton.setVisible(false);
			userInput.setVisible(false);
			displayButton.setVisible(false);
			exitButton.setVisible(true);
			updateBalanceLabel();
		}
		else if(e.getSource() == exitButton) {
			System.exit(0);
		}
	}	
}
