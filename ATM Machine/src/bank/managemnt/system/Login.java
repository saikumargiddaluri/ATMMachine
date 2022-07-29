package bank.managemnt.system;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField cardNo;
	private JPasswordField PIN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("SBI ATM");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gidda\\OneDrive\\Documents\\NetBeansProjects\\Bank Management System\\src\\icons\\logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO ATM");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
		lblNewLabel.setBounds(577, 137, 337, 57);
		contentPane.add(lblNewLabel);
		
		ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		JLabel label= new JLabel(icon);
	       //
	       getContentPane().add(label);
	       
	       //Converting image to Image ICon
	       Image i2= icon.getImage().getScaledInstance(330, 220, Image.SCALE_DEFAULT);
	       ImageIcon icon1 = new ImageIcon(i2);
	       JLabel label1= new JLabel(icon1);   
	       label1.setBounds(297,72,210, 152);
	       getContentPane().add(label1);
	       
	       JLabel lblNewLabel_1 = new JLabel("Card No :");
	       lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	       lblNewLabel_1.setBounds(238, 362, 141, 37);
	       contentPane.add(lblNewLabel_1);
	       
	       cardNo = new JTextField();
	       cardNo.setFont(new Font("Tahoma", Font.BOLD, 24));
	       cardNo.setBounds(482, 362, 385, 36);
	       contentPane.add(cardNo);
	       cardNo.setColumns(10);
	       
	       JLabel lblNewLabel_1_1 = new JLabel("PIN :");
	       lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	       lblNewLabel_1_1.setBounds(291, 451, 141, 37);
	       contentPane.add(lblNewLabel_1_1);
	       
	       JButton signIn = new JButton("SIGN IN");
	       signIn.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) 
	       	{
	       		Conn c = new Conn();
	       		String cardno = cardNo.getText();
	       		String pinno = PIN.getText();
	       		
	       		String query = "select * from login where cardno ='"+cardno+"'and pinno ='"+pinno+"'";
	       		try
	       		{
	       			ResultSet res = c.s.executeQuery(query);
	       			
	       			if(res.next())
	       			{
	       				setVisible(false);
	       				Transactions t = new Transactions(pinno);
	       				t.setVisible(true);
	       			}
	       			else
	       			{
	       				JOptionPane.showMessageDialog(null, "Please Enter Valid Credentials");
	       			}
	       		}
	       		catch(Exception ae)
	       		{
	       			System.out.println(ae);
	       		}
	       		
	       	}
	       });
	       signIn.setForeground(Color.WHITE);
	       signIn.setBackground(Color.BLACK);
	       signIn.setFont(new Font("Tahoma", Font.BOLD, 22));
	       signIn.setBounds(387, 599, 154, 35);
	       contentPane.add(signIn);
	       
	       JButton signUP = new JButton("SIGN UP");
	       signUP.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e)
	       	{
	       		
	       		setVisible(false);
	       		Signup s = new Signup();
	       		s.setVisible(true);
	       		
	       	}
	       });
	       signUP.setForeground(Color.WHITE);
	       signUP.setFont(new Font("Tahoma", Font.BOLD, 22));
	       signUP.setBackground(Color.BLACK);
	       signUP.setBounds(621, 599, 154, 35);
	       contentPane.add(signUP);
	       
	       JButton clear = new JButton("CLEAR");
	       clear.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) 
	       	{
	       		cardNo.setText("");
	       		PIN.setText("");
	       		
	       	}
	       });
	       clear.setForeground(Color.WHITE);
	       clear.setFont(new Font("Tahoma", Font.BOLD, 22));
	       clear.setBackground(Color.BLACK);
	       clear.setBounds(863, 599, 154, 35);
	       contentPane.add(clear);
	       
	       PIN = new JPasswordField();
	       PIN.setFont(new Font("Tahoma", Font.BOLD, 20));
	       PIN.setBounds(545, 459, 224, 37);
	       contentPane.add(PIN);
	}
}
