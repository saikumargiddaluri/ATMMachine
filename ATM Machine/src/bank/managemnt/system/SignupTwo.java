package bank.managemnt.system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;
import java.awt.event.ActionEvent;

public class SignupTwo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupTwo frame = new SignupTwo("");
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
	
	String formno;
	public SignupTwo(String formNo) 
	{
		this.formno =formNo;
		setBackground(Color.WHITE);
		setTitle("PAGE - 3 : ACCOUNT DETAILS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gidda\\eclipse-workspace\\ATM Machine\\bin\\icons\\logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350,10, 850, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(255, 165, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Page - 3 : Account Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(214, 63, 340, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account Type");
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_1.setBounds(105, 202, 133, 33);
		contentPane.add(lblNewLabel_1);
		
		JComboBox accountType = new JComboBox();
		accountType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		accountType.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "Savings Account", "Current Account", "Fixed Deposit Account", "Recurring Deposit Account"}));
		accountType.setBackground(new Color(255, 255, 255));
		accountType.setBounds(327, 188, 227, 39);
		contentPane.add(accountType);
		
		JLabel lblNewLabel_CardNo = new JLabel("Card Number :");
		lblNewLabel_CardNo.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_CardNo.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_CardNo.setBounds(105, 276, 156, 29);
		contentPane.add(lblNewLabel_CardNo);
		
		JLabel lblNewLabel_2 = new JLabel("XXXX-XXXX-XXXX-1306");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_2.setBounds(315, 273, 271, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Your 16 Digit Card Number");
		lblNewLabel_3.setBounds(105, 302, 159, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_CardNo_1 = new JLabel("PIN :");
		lblNewLabel_CardNo_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_CardNo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_CardNo_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_CardNo_1.setBounds(108, 337, 130, 29);
		contentPane.add(lblNewLabel_CardNo_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("XXXX");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(341, 322, 271, 39);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Your 4 Digit Password");
		lblNewLabel_3_1.setBounds(102, 367, 159, 13);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Servises Required");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(105, 409, 189, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JCheckBox atmcard = new JCheckBox("ATM CARD");
		atmcard.setFont(new Font("Times New Roman", Font.BOLD, 20));
		atmcard.setBackground(new Color(255, 255, 255));
		atmcard.setBounds(158, 448, 156, 33);
		contentPane.add(atmcard);
		
		JCheckBox internetBanking = new JCheckBox("Internet Banking");
		internetBanking.setFont(new Font("Times New Roman", Font.BOLD, 20));
		internetBanking.setBackground(Color.WHITE);
		internetBanking.setBounds(380, 448, 173, 33);
		contentPane.add(internetBanking);
		
		JCheckBox chequeBook = new JCheckBox("Cheque Book");
		chequeBook.setFont(new Font("Times New Roman", Font.BOLD, 20));
		chequeBook.setBackground(Color.WHITE);
		chequeBook.setBounds(158, 498, 156, 33);
		contentPane.add(chequeBook);
		
		JCheckBox alerts = new JCheckBox("E-mail & SMS Alerts");
		alerts.setFont(new Font("Times New Roman", Font.BOLD, 20));
		alerts.setBackground(Color.WHITE);
		alerts.setBounds(380, 498, 221, 33);
		contentPane.add(alerts);
		
		JCheckBox creditCard = new JCheckBox("Credit Card");
		creditCard.setFont(new Font("Times New Roman", Font.BOLD, 20));
		creditCard.setBackground(Color.WHITE);
		creditCard.setBounds(158, 551, 156, 33);
		contentPane.add(creditCard);
		
		JCheckBox decleration = new JCheckBox("I here by declares that above entered details are correct to the best of my knowledge.");
		decleration.setFont(new Font("Times New Roman", Font.BOLD, 15));
		decleration.setBackground(Color.WHITE);
		decleration.setBounds(105, 604, 579, 27);
		contentPane.add(decleration);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String accountType1 = accountType.getSelectedItem().toString();
				
				Random ran = new Random();
				long card = (ran.nextLong() % 90000000L)+2022070000000000L;
				String cardNo = ""+Math.abs(card);
				
				long pin = (ran.nextLong() % 9000L)+1000L;
				String pinNo =""+Math.abs(pin);
				
				String service="";
				if(atmcard.isSelected())
				{
					service = service+"ATM CARD";
				}
				 if(internetBanking.isSelected())
				{
					service = service+" Internet Banking";
				}
			   if(chequeBook.isSelected())
				{
					service =service+" Cheque Book";
				}
				if(alerts.isSelected())
				{
					service = service +" Email & SMS Alerts";
				}
			   if(creditCard.isSelected())
				{
					service =service+" Credit Card";
				}
				
				try
				{
					if(accountType1.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please select Account Type...!!!");
					}
					else
					{
						Conn c = new Conn();
						String query1 = "insert into signupTwo values('"+formno+"','"+accountType1+"','"+cardNo+"','"+pinNo+"','"+service+"')";
						
						String query2 ="insert into login values ('"+formno+"','"+cardNo+"','"+pinNo+"')";
						c.s.executeUpdate(query1);
						c.s.executeUpdate(query2);
						
						
						JOptionPane.showMessageDialog(null,"Card Number : "+cardNo+" \n PIN :"+pinNo);
						setVisible(false);
						
						new Login().setVisible(true);
						
						
					}
				}
				catch(Exception ae)
				{
					System.out.println(ae);
				}
				
				
			}
		});
		submit.setForeground(new Color(255, 255, 255));
		submit.setBackground(new Color(0, 0, 0));
		submit.setFont(new Font("Tahoma", Font.BOLD, 20));
		submit.setBounds(158, 677, 136, 33);
		contentPane.add(submit);
		
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				new Login().setVisible(true);
			}
		});
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		cancel.setBackground(Color.BLACK);
		cancel.setBounds(418, 677, 136, 33);
		contentPane.add(cancel);
	}
}
