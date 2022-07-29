package bank.managemnt.system;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transactions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transactions frame = new Transactions("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 *  
	 */
	String pinno="";
	public Transactions(String pinno)
	{
		this.pinno=pinno;
	
		//setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(900,900);
//		setLocation(300,0);
		
		
		setBounds(350,10, 850, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		
		contentPane.setBorder(new LineBorder(Color.ORANGE, 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		   ImageIcon icon3= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
//	       JLabel label3= new JLabel(icon3);
//	       add(label3);
	       
	      
	       //Converting image to Image ICon
	       Image i3= icon3.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
	       ImageIcon icon4 = new ImageIcon(i3);
	       JLabel label5= new JLabel(icon4); 
	       	     
	       label5.setBounds(0, 0, 850, 800);
	       getContentPane().add(label5);
	       
	       JLabel lblNewLabel = new JLabel("Please Select Your Choice");
	       lblNewLabel.setForeground(Color.ORANGE);
	       lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
	       lblNewLabel.setBounds(220, 300, 250, 30);
	       label5.add(lblNewLabel);
	       
	       JButton fastCash = new JButton("FAST CASH");
	       fastCash.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) 
		       	{
		       		//fast cash code
		       		setVisible(false);
		       		new fastCash1(pinno).setVisible(true);
		       	}
		       });
	       label5.add(fastCash);
	       fastCash.setForeground(Color.BLACK);
	       fastCash.setFont(new Font("Tahoma", Font.BOLD, 13));
	       fastCash.setBackground(Color.ORANGE);
	       fastCash.setBounds(149, 413, 110, 30);
	       
	       JButton deposit = new JButton("DEPOSIT");
	       deposit.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) 
	       	{
	       		//deposit code
	       		setVisible(false);
	       		Deposit d = new Deposit(pinno);
				d.setVisible(true);
	       		
	       		
	       	}
	       });
	       label5.add(deposit);
	       deposit.setFont(new Font("Tahoma", Font.BOLD, 15));
	       deposit.setForeground(Color.BLACK);
	       deposit.setBackground(Color.ORANGE);
	       deposit.setBounds(149, 372, 110, 30);
	       
	       JButton pinChange = new JButton("PIN CHANGE");
	       pinChange.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) 
		       	{
		       		//pin change code
		       		
		       		setVisible(false);
		       		PinChange pc = new PinChange(pinno);
		       		pc.setVisible(true);
		       		
		       	}
		       });
	       label5.add(pinChange);
	       pinChange.setForeground(Color.BLACK);
	       pinChange.setFont(new Font("Tahoma", Font.BOLD, 11));
	       pinChange.setBackground(Color.ORANGE);
	       pinChange.setBounds(149, 453, 110, 30);
	       
	       JButton cashWithdraw = new JButton("CASH WITHDRAW");
	       cashWithdraw.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) 
		       	{
		       		//cashWithdraw code
		       		setVisible(false);
		       		Withdraw w = new Withdraw(pinno);
		       		w.setVisible(true);
		       	}
		       });
	       label5.add(cashWithdraw);
	       cashWithdraw.setForeground(Color.BLACK);
	       cashWithdraw.setFont(new Font("Tahoma", Font.BOLD, 15));
	       cashWithdraw.setBackground(Color.ORANGE);
	       cashWithdraw.setBounds(295, 370, 180, 33);
	       
	       JButton miniStatement = new JButton("MINI STATEMENT");
	       miniStatement.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) 
		       	{
		       		//miniStatement code
		       		setVisible(false);
		       		new MiniStatement1(pinno).setVisible(true);
		       	}
		       });
	       label5.add(miniStatement);
	       miniStatement.setForeground(Color.BLACK);
	       miniStatement.setFont(new Font("Tahoma", Font.BOLD, 15));
	       miniStatement.setBackground(Color.ORANGE);
	       miniStatement.setBounds(295, 413, 180, 30);
	       
	       JButton balanceEnquery = new JButton("BALANCE ENQUERY");
	       balanceEnquery .addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) 
		       	{
		       		//balanceEnquery code
		       		setVisible(false);
		       		new BalanceEnquiry(pinno).setVisible(true);
		       	}
		       });
	       label5.add(balanceEnquery);
	       balanceEnquery.setForeground(Color.BLACK);
	       balanceEnquery.setFont(new Font("Tahoma", Font.BOLD, 15));
	       balanceEnquery.setBackground(Color.ORANGE);
	       balanceEnquery.setBounds(295, 453, 180, 30);
	       
	       JButton exit = new JButton("EXIT");
	       exit.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) 
		       	{
		       		//exit code
		       		setVisible(false);
		       	}
		       });
	       label5.add(exit);
	       exit.setForeground(Color.ORANGE);
	       exit.setFont(new Font("Tahoma", Font.BOLD, 20));
	       exit.setBackground(Color.RED);
	       exit.setBounds(209, 515, 191, 39);
	       
	       
	       
		
		setUndecorated(true);
		
		//setVisible(true);
		
	}
}
