package bank.managemnt.system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.sql.ResultSet;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniStatement1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniStatement1 frame = new MiniStatement1("");
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
	int balance =0;
	String pin;
	public MiniStatement1(String pin)
	{
		this.pin = pin;
		setTitle("Mini Statement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mini = new JLabel("State Bank of India");
		mini.setForeground(SystemColor.textHighlight);
		mini.setFont(new Font("Tahoma", Font.BOLD, 20));
		mini.setBounds(115, 45, 194, 25);
		contentPane.add(mini);
		
		JLabel card = new JLabel("");
		card.setFont(new Font("Tahoma", Font.BOLD, 15));
		card.setBounds(56, 103, 328, 19);
		contentPane.add(card);
		
		JLabel mini1 = new JLabel("");
		mini1.setVerticalAlignment(SwingConstants.TOP);
		mini1.setFont(new Font("Tahoma", Font.BOLD, 12));
		mini1.setBounds(50, 156, 348, 263);
		contentPane.add(mini1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				new Transactions(pin).setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(50, 490, 104, 30);
		contentPane.add(btnNewButton);
		
		JLabel getbalance = new JLabel("");
		getbalance.setFont(new Font("Tahoma", Font.BOLD, 18));
		getbalance.setBounds(56, 448, 353, 25);
		contentPane.add(getbalance);
		
		
		//
		
		try
		{
			Conn c = new Conn();
			ResultSet res = c.s.executeQuery("select * from login where pinno = '"+pin+"'");
			while(res.next())
			{
				card.setText("Card Number is : "+res.getString("cardno").substring(0,4)+"-XXXX-XXXX-"+res.getString("cardno").substring(12));
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			Conn c = new Conn();
			ResultSet res = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
			while(res.next())
			{
				mini1.setText(mini1.getText() + "<html>"+res.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + res.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + res.getString("amount") + "<br><br><html>");
				if(res.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(res.getString("amount"));
                }else{
                    balance -= Integer.parseInt(res.getString("amount"));
                }		
			}
			
			getbalance.setText("Your Account Balance : "+balance);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
	}
}
