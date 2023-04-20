package SecondYear_2ndSem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

@SuppressWarnings("serial")
public class OOP_Act1 extends JFrame {
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					OOP_Act1 GUI = new OOP_Act1();
					GUI.setVisible(true);
				}
				catch(Exception e) {
					
				}
			}
			
		}); 
		// OOP_Activity1.Program_Activity1();
	}
	Action enterAction  = new AbstractAction() {
		@Override
		public void actionPerformed(ActionEvent event) {
			int inputValue = 0;
			inputValue = Integer.parseInt(numberField.getText());
			
			if(inputValue >= 0)
				x++;
			
			if(x==5) {
				numberField.setEditable(false);
				enterBtn.setEnabled(false);
			}
			
			OOP_Activity1.Program_Activity1(inputValue);
			outPanel.setText(OOP_Activity1.pushFunction);
			
			numberField.setText("");
		}
	};
	JLabel title = new JLabel("Enter Number");
	JLabel Copyright = new JLabel("Dominic O. Ramos, 2BSIT2 - SY:2022-2023");
	JButton enterBtn = new JButton("Enter");
	JButton resetBtn = new JButton("Reset");
	JTextField numberField = new JTextField();
	JTextPane outPanel = new JTextPane();
	
	
	
	Font CourierNew = new Font("Courier New", Font.BOLD, 15);
	int x=0;
	
	public OOP_Act1(){
		setTitle("OOP Activity #1");
		setSize(450,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		
		title.setBounds(12,13,250,25);
		title.setFont(CourierNew);
		title.setForeground(Color.WHITE);
		add(title);
		
		numberField.setBounds(150,10,50,25);
		numberField.addActionListener(enterAction);
		add(numberField);
		
		outPanel.setBounds(10,50,415,400);
		outPanel.setEditable(false);
		outPanel.setFont(CourierNew);
		add(outPanel);
		
		Copyright.setBounds(10,450,400,25);
		Copyright.setFont(CourierNew);
		Copyright.setForeground(Color.WHITE);
		add(Copyright);
		
		enterBtn.setBounds(205,10,70,25);
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int inputValue = 0;
					inputValue = Integer.parseInt(numberField.getText());
					
					if(inputValue >= 0)
						x++;
					
					if(x==5) {
						numberField.setEditable(false);
						enterBtn.setEnabled(false);
					}
					
					OOP_Activity1.Program_Activity1(inputValue);
					outPanel.setText(OOP_Activity1.pushFunction);
					
					numberField.setText("");
				}
				catch(Exception ex) {
					
				}
			}
		});
		add(enterBtn);
		
		
		
		resetBtn.setBounds(270,10,70,25);
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x=0;
					
					numberField.setEditable(true);
					enterBtn.setEnabled(true);
					
					OOP_Activity1.count=1;
					OOP_Activity1.total=0;
					OOP_Activity1.average=0;
					OOP_Activity1.pushFunction="Enter 5 Positive Numbers\n";
					
					outPanel.setText("");
				}
				catch(Exception ex) {
					
				}
			}
		});
		add(resetBtn);
	}
}

class OOP_Activity1 {
	
	static int count=1, total=0, average=0;
	static int [] repository = new int [6];
	static String pushFunction = "Enter 5 Positive Numbers\n";
	
	public static void Program_Activity1(int inputValue) {
		
		//Scanner input = new Scanner(System.in);
		repository[count] =	inputValue;	
		
				//System.out.print("Enter Number " + (count) + ": ");
				pushFunction += "Enter Number " + (count) + ": ";
			//repository[count] = input.nextInt();
			pushFunction += inputValue + "\n";
			if(repository[count] < 0) {
				//System.out.println("ERROR: Please enter a non-negative value");
				pushFunction += "ERROR: Please enter a non-negative value";
			}
			
			else {
				total += repository[count];
				count++;
			}
			
			if(count==6){
		average = total/5;
				//System.out.println("Total is " + total + "\nAverage is " + average);
				pushFunction += "Total is " + total + "\nAverage is " + average;
			}
	}
}

