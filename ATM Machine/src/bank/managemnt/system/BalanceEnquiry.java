package bank.managemnt.system;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class BalanceEnquiry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalanceEnquiry frame = new BalanceEnquiry("");
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
	int balance=0;
	String pin;
	public BalanceEnquiry(String pin)
	{
		this.pin =pin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 300, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/balanceEnquiry.png"));
		Image icon = i1.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(icon);
		JLabel l1 = new JLabel(i2);
		l1.setBounds(116,10,417,100);
		getContentPane().add(l1);
		
		
		Conn c = new Conn();
		 try{
	            Conn c1 = new Conn();
	            ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pin+"'");
	            while (rs.next()) 
	            {
	                if (rs.getString("type").equals("Deposit"))
	                {
	                    balance += Integer.parseInt(rs.getString("amount"));
	                } else 
	                {
	                    balance -= Integer.parseInt(rs.getString("amount"));
	                }
	            }
		 }
		catch(Exception e)
		{
			//System.out.println(e);
		}
		
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("Your Account Balance is : "+balance);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(60, 186, 324, 46);
		contentPane.add(lblNewLabel);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				new Transactions(pin).setVisible(true);
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 18));
		back.setForeground(Color.BLACK);
		back.setBounds(529, 297, 108, 31);
		contentPane.add(back);
		
		
		
		
		
	}
}
