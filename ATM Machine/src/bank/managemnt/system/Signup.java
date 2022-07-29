package bank.managemnt.system;

import com.toedter.calendar.*;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.Calendar;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

import java.awt.Scrollbar;
import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);
    private JTextField name;
    private JTextField fatherName;
    private JTextField email;
    private JTextField address;
    private JTextField city;
    private JTextField pincode;
    private JTextField state;
    JRadioButton male, female, married, unmarried, others;
    JDateChooser date;
    JButton next;
	/**
	 * Create the frame.
	 */
	public Signup() {
		setTitle("NEW ACCOUNT APPLICATION FORM ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350,10, 850, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		contentPane.setLayout(null);
		JLabel label= new JLabel(icon);
		label.setBounds(0, 0, 0, 0);
	       //
	       getContentPane().add(label);
	       
	       //Converting image to Image ICon
	       Image i2= icon.getImage().getScaledInstance(330, 220, Image.SCALE_DEFAULT);
	       ImageIcon icon1 = new ImageIcon(i2);
	       
	       JLabel lblNewLabel = new JLabel("APPLICATION FORM NO  :   "+first);
	       lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	       lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 28));
	       lblNewLabel.setBounds(174, 22, 515, 67);
	       contentPane.add(lblNewLabel);
	       
	       JLabel lblNewLabel_1 = new JLabel("Page 1 : Personal Details");
	       lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	       lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 25));
	       lblNewLabel_1.setBounds(273, 79, 340, 52);
	       contentPane.add(lblNewLabel_1);
	       
	       JLabel lblNewLabel_Name = new JLabel("Name :");
	       lblNewLabel_Name.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_Name.setBounds(77, 171, 71, 25);
	       contentPane.add(lblNewLabel_Name);
	       
	       name = new JTextField();
	       name.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
	       name.setBounds(273, 141, 332, 45);
	       contentPane.add(name);
	       name.setColumns(10);
	       
	       
	       
	       
	       	       
	       JLabel lblNewLabel_FN = new JLabel("Father Name :");
	       lblNewLabel_FN.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_FN.setBounds(77, 206, 130, 33);
	       contentPane.add(lblNewLabel_FN);
	       
	       fatherName = new JTextField();
	       fatherName.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
	       fatherName.setColumns(10);
	       fatherName.setBounds(273, 200, 332, 45);
	       contentPane.add(fatherName);
	       
	       JLabel lblNewLabel_DOB = new JLabel("Date Of Birth :");
	       lblNewLabel_DOB.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_DOB.setBounds(77, 271, 130, 33);
	       contentPane.add(lblNewLabel_DOB);
	       
	       date = new JDateChooser();
	       date.setBounds(273,269,300,35);
	       contentPane.add(date);
	       
	       
	       
	       
	       JLabel lblNewLabel_gender = new JLabel("Gender :");
	       lblNewLabel_gender.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_gender.setBounds(77, 331, 130, 33);
	       contentPane.add(lblNewLabel_gender);
	       
	       JLabel lblNewLabel_email = new JLabel("Email Address:");
	       lblNewLabel_email.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_email.setBounds(77, 387, 138, 33);
	       contentPane.add(lblNewLabel_email);
	       
	       JLabel lblNewLabel_Maritial = new JLabel("Maritial Status :");
	       lblNewLabel_Maritial.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_Maritial.setBounds(77, 440, 145, 33);
	       contentPane.add(lblNewLabel_Maritial);
	       
	       JLabel lblNewLabel_Address = new JLabel("Address :");
	       lblNewLabel_Address.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_Address.setBounds(77, 487, 130, 33);
	       contentPane.add(lblNewLabel_Address);
	       
	       JLabel lblNewLabel_City = new JLabel("City :");
	       lblNewLabel_City.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_City.setBounds(77, 530, 130, 33);
	       contentPane.add(lblNewLabel_City);
	       
	       JLabel lblNewLabel_Pincode = new JLabel("Pin Code :");
	       lblNewLabel_Pincode.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_Pincode.setBounds(77, 597, 130, 33);
	       contentPane.add(lblNewLabel_Pincode);
	       
	       JLabel lblNewLabel_state = new JLabel("State :");
	       lblNewLabel_state.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
	       lblNewLabel_state.setBounds(77, 652, 130, 33);
	       contentPane.add(lblNewLabel_state);
	       
	       email = new JTextField();
	       email.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
	       email.setColumns(10);
	       email.setBounds(273, 374, 332, 45);
	       contentPane.add(email);
	       
	       address = new JTextField();
	       address.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
	       address.setColumns(10);
	       address.setBounds(273, 475, 332, 45);
	       contentPane.add(address);
	       
	       city = new JTextField();
	       city.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
	       city.setColumns(10);
	       city.setBounds(273, 530, 332, 45);
	       contentPane.add(city);
	       
	       pincode = new JTextField();
	       pincode.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
	       pincode.setColumns(10);
	       pincode.setBounds(273, 591, 332, 45);
	       contentPane.add(pincode);
	       
	       state = new JTextField();
	       state.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
	       state.setColumns(10);
	       state.setBounds(273, 646, 332, 45);
	       contentPane.add(state);
	       
	       male = new JRadioButton("Male");
	       male.setFont(new Font("Times New Roman", Font.BOLD, 18));
	       male.setBackground(Color.WHITE);
	       male.setBounds(273, 331, 67, 37);
	       contentPane.add(male);
	       
	        female = new JRadioButton("Female");
	       female.setFont(new Font("Times New Roman", Font.BOLD, 18));
	       female.setBackground(Color.WHITE);
	       female.setBounds(455, 331, 83, 29);
	       contentPane.add(female);
	       
	       ButtonGroup genderB = new ButtonGroup();
	       genderB.add(female);
	       genderB.add(male);
	       
	        married = new JRadioButton("Married");
	       married.setFont(new Font("Times New Roman", Font.BOLD, 18));
	       married.setBackground(Color.WHITE);
	       married.setForeground(Color.BLACK);
	       married.setBounds(273, 438, 93, 29);
	       contentPane.add(married);
	       
	        unmarried = new JRadioButton("Un-Married");
	       unmarried.setForeground(Color.BLACK);
	       unmarried.setFont(new Font("Times New Roman", Font.BOLD, 18));
	       unmarried.setBackground(Color.WHITE);
	       unmarried.setBounds(388, 438, 123, 29);
	       contentPane.add(unmarried);
	       
	        others = new JRadioButton("Others");
	       others.setForeground(Color.BLACK);
	       others.setFont(new Font("Times New Roman", Font.BOLD, 18));
	       others.setBackground(Color.WHITE);
	       others.setBounds(533, 438, 93, 29);
	       contentPane.add(others);
	       
	       ButtonGroup maritialStatus = new ButtonGroup();
	       maritialStatus.add(married);
	       maritialStatus.add(unmarried);
	       maritialStatus.add(others);
	       
	        next = new JButton("NEXT");
	        next.addActionListener(new ActionListener()
	       {
	        	public void actionPerformed(ActionEvent e) 
	        	{
	        		String formno = first;
	        		String name1 = name.getText();
	        		String fname = fatherName.getText();
	        		String email1 = email.getText();
	        		String address1 = address.getText();
	        		String city1 = city.getText();
	        		String pincode1 = pincode.getText();
	        		String state1 = state.getText();
	        		String date1 = ((JTextField) date.getDateEditor().getUiComponent()).getText();
	        		              
	        		String gender1 =null;
	        		if(male.isSelected())
	        		{
	        			gender1 = "Male";
	        		}
	        		else if(female.isSelected())
	        		{
	        			gender1 = "Female";
	        		}
	        		
	        		String marriage = null;
	        		if(married.isSelected())
	        		{
	        			marriage = "Married";
	        		}
	        		else if(unmarried.isSelected())
	        		{
	        			marriage = "Un Married";
	        		}
	        		else if(others.isSelected())
	        		{
	        			marriage = "Others";
	        		}
	        		
	        		try
	        		{
	        			if(name1.equals(""))
		        		{
		        			JOptionPane.showMessageDialog(null, "Name is Required");
		        			
		        		}
		        		else
		        		{
		        			//Statement s1;
		        			Conn c1 = new Conn();
		        			String q1 = "insert into signup values('"+formno+"','"+name1+"','"+fname+"','"+date1+"','"+gender1+"','"+email1+"','"+marriage+"','"+address1+"','"+city1+"','"+pincode1+"','"+state1+"')";
		                    c1.s.executeUpdate(q1);
		                    
		                    setVisible(false);
			        		
			        		
			        		
			        		new Signupone(formno).setVisible(true);
		        		}
	        		}
	        		catch(Exception ae)
	        		{
	        			System.out.println(ae);
	        		}
	        	
	        		
	              
	            }
	        		
	        	
	     });
	       next.setBackground(Color.BLACK);
	       next.setFont(new Font("Times New Roman", Font.BOLD, 18));
	       next.setForeground(Color.WHITE);
	       next.setBounds(674, 599, 130, 54);
	       contentPane.add(next);
	       
	       JButton back = new JButton("BACK");
	       back.addActionListener(new ActionListener()
	       {
	       	public void actionPerformed(ActionEvent e)
	       	{
	       		Login l = new Login();
	       		l.setVisible(true);
	       	}
	       });
	       back.setForeground(Color.WHITE);
	       back.setFont(new Font("Times New Roman", Font.BOLD, 18));
	       back.setBackground(Color.BLACK);
	       back.setBounds(674, 680, 130, 54);
	       contentPane.add(back);
	}
}
