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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PinChange extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PinChange frame = new PinChange("");
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
	String pin;
	private JTextField rePinChange;
	private JTextField pinChange;
	public PinChange(String pin) 
	{
		this.pin = pin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350,300, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/pinchange.png"));
		Image icon = i1.getImage().getScaledInstance(650, 250, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(icon);
		JLabel l1 = new JLabel(i2);
		l1.setBounds(0,0,686,130);
		getContentPane().add(l1);
		
		JLabel lblNewLabel = new JLabel("Please enter your new PIN ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(80, 185, 263, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblPleaseReenterYour = new JLabel("Please re-enter your new PIN ");
		lblPleaseReenterYour.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPleaseReenterYour.setBounds(80, 239, 263, 24);
		contentPane.add(lblPleaseReenterYour);
		
		rePinChange = new JTextField();
		rePinChange.setForeground(Color.GREEN);
		rePinChange.setFont(new Font("Tahoma", Font.BOLD, 18));
		rePinChange.setBounds(411, 239, 114, 31);
		contentPane.add(rePinChange);
		rePinChange.setColumns(10);
		
		pinChange = new JTextField();
		pinChange.setForeground(Color.GREEN);
		pinChange.setFont(new Font("Tahoma", Font.BOLD, 18));
		pinChange.setColumns(10);
		pinChange.setBounds(411, 178, 114, 31);
		contentPane.add(pinChange);
		
		JButton change = new JButton("CHANGE");
		change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//CHANGE code
				try
				{
					String change1 = pinChange.getText();
					String reChange = rePinChange.getText();
					
					
					if(change1.equals(""))
					{

						JOptionPane.showMessageDialog(null, "Please enter NEW PIN...!!!");
						return;
						
					}
					if(reChange.equals(""))
					{

						JOptionPane.showMessageDialog(null, "Please re-enter NEW PIN..!!!");
						return;
					}
					if(!change1.equals(reChange))
					{
						JOptionPane.showMessageDialog(null, "Entered DOESN'T match..!!!");
						return;
					}
					if(change1.equals(reChange))
					{
						Conn c =new Conn();
						String queryBank = "update bank set pin = '"+reChange+"' where pin ='"+pin+"'";
						String queryLogin = "update login set pinno = '"+reChange+"' where pinno ='"+pin+"'";
						String querySignup2 = "update signupTwo set pinno = '"+reChange+"' where pinno ='"+pin+"'";
						
						c.s.executeUpdate(queryBank);
						c.s.executeUpdate(queryLogin);
						c.s.executeUpdate(querySignup2);
						
						JOptionPane.showMessageDialog(null, "PIN Change Success..!!!!");
						
						setVisible(false);
						new Transactions(pin).setVisible(true);
					}
					
					
				}
				
				catch(Exception ae)
				{
					System.out.println(ae);
				}
				
			}
		});
		change.setFont(new Font("Times New Roman", Font.BOLD, 20));
		change.setBackground(Color.WHITE);
		change.setForeground(Color.GREEN);
		change.setBounds(163, 315, 132, 33);
		contentPane.add(change);
		
		JButton cancel = new JButton("CANCEL");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//CANCEL code
				
				
				setVisible(false);
				new Transactions(pin).setVisible(true);
			}
		});
		cancel.setForeground(Color.RED);
		cancel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cancel.setBackground(Color.WHITE);
		cancel.setBounds(366, 315, 132, 33);
		contentPane.add(cancel);
	}
}
