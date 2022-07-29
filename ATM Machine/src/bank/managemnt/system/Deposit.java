package bank.managemnt.system;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Deposit extends JFrame {

	private JPanel contentPane;
	private JTextField depositAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	String pin="";
	public Deposit(String pin)
	{
		
		this.pin=pin;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350,300, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Deposits.jpg"));
		Image icon = i1.getImage().getScaledInstance(650,100,Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(icon);
		JLabel l1 = new JLabel(i2);
		l1.setBounds(0,0,700,130);
		getContentPane().add(l1);
		
		JLabel lblNewLabel = new JLabel("Enter Amount You Want to DEPOSIT");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(52, 157, 329, 20);
		contentPane.add(lblNewLabel);
		
		depositAmount = new JTextField();
		depositAmount.setFont(new Font("Verdana", Font.BOLD, 15));
		depositAmount.setBounds(453, 150, 162, 39);
		contentPane.add(depositAmount);
		depositAmount.setColumns(10);
		
		JButton deposit = new JButton("DEPOSIT");
		deposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String amount = depositAmount.getText();
				Date date = new Date();
				
				if(amount.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter valid Amount..!!!");
				}
				else
				{
					try
					{
						Conn c = new Conn();
						String query = "insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')";
						c.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "Rs."+amount+" Deposited Succesfully!!!");
						
						setVisible(false);
						Transactions t = new Transactions(pin);
						t.setVisible(true);
						
					}
					catch(Exception ae)
					{
						System.out.println(ae);
					}
				}
			}
		});
		deposit.setForeground(Color.GREEN);
		deposit.setBackground(Color.WHITE);
		deposit.setBounds(149, 249, 112, 31);
		contentPane.add(deposit);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				Transactions t = new Transactions(pin);
				t.setVisible(true);
				
			}
		});
		back.setForeground(Color.GREEN);
		back.setBackground(Color.WHITE);
		back.setBounds(335, 249, 112, 31);
		contentPane.add(back);
	}
}
