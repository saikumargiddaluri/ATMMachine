package bank.managemnt.system;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;

public class Signupone extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Signupone frame = new Signupone("");
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
	Signup s = new Signup();
	private JTextField pan;
	private JTextField aadhar;
	String formNo;
	public Signupone(String formno) 
	{
		 this.formNo=formno;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gidda\\eclipse-workspace\\ATM Machine\\bin\\icons\\logo.jpg"));
		setTitle("NEW ACCOUNT APPLICATIONFORM : " +s.first+ " PAGE : 2");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350,10, 850, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new CompoundBorder(new CompoundBorder(), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Page 2 : Additional Details ");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(259, 21, 358, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_Religion = new JLabel("Religion");
		lblNewLabel_Religion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Religion.setBounds(108, 130, 99, 25);
		contentPane.add(lblNewLabel_Religion);
		
		JLabel lblNewLabel_Category = new JLabel("Category");
		lblNewLabel_Category.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Category.setBounds(108, 188, 99, 25);
		contentPane.add(lblNewLabel_Category);
		
		JLabel lblNewLabel_Income = new JLabel("Annual Income");
		lblNewLabel_Income.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Income.setBounds(108, 250, 187, 25);
		contentPane.add(lblNewLabel_Income);
		
		JLabel lblNewLabel_EQ = new JLabel("<html>Educational <br> Qualification</html>");
		lblNewLabel_EQ.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_EQ.setBounds(108, 309, 187, 50);
		contentPane.add(lblNewLabel_EQ);
		
		JLabel lblNewLabel_Occupation = new JLabel("Occupation");
		lblNewLabel_Occupation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Occupation.setBounds(108, 399, 164, 25);
		contentPane.add(lblNewLabel_Occupation);
		
		JLabel lblNewLabel_PAN = new JLabel("PAN Number");
		lblNewLabel_PAN.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_PAN.setBounds(108, 461, 164, 25);
		contentPane.add(lblNewLabel_PAN);
		
		JLabel lblNewLabel_Aadhar = new JLabel("Aadhar Number");
		lblNewLabel_Aadhar.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Aadhar.setBounds(108, 528, 177, 25);
		contentPane.add(lblNewLabel_Aadhar);
		
		JLabel lblNewLabel_SeniorC = new JLabel("Senior Citizen");
		lblNewLabel_SeniorC.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_SeniorC.setBounds(108, 590, 177, 25);
		contentPane.add(lblNewLabel_SeniorC);
		
		JLabel lblNewLabel_EA = new JLabel("Existing Account");
		lblNewLabel_EA.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_EA.setBounds(108, 653, 177, 25);
		contentPane.add(lblNewLabel_EA);
		
		
		
		JList list = new JList();
		list.setBounds(307, 175, 233, -35);
		contentPane.add(list);
		
		JComboBox religion = new JComboBox();
		religion.setBackground(Color.WHITE);
		religion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		religion.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "Hindu", "Muslim", "Sikh", "Christian", "Others"}));
		religion.setSelectedIndex(0);
		religion.setBounds(317, 122, 187, 35);
		contentPane.add(religion);
		
		JComboBox category = new JComboBox();
		category.setBackground(Color.WHITE);
		category.setFont(new Font("Tahoma", Font.PLAIN, 18));
		category.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "General", "OBC", "SC", "ST", "Others"}));
		category.setSelectedIndex(0);
		category.setBounds(317, 188, 187, 27);
		contentPane.add(category);
		
		JComboBox income = new JComboBox();
		income.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "1 - 1,00,000", "1,00,000 - 2,00,000", "2,00,000 - 3,00,000", "3,00,000 - 4,00,000", "4,00,000 above"}));
		income.setSelectedIndex(0);
		income.setFont(new Font("Tahoma", Font.PLAIN, 18));
		income.setBackground(Color.WHITE);
		income.setBounds(317, 256, 187, 27);
		contentPane.add(income);
		
		JComboBox EQ = new JComboBox();
		EQ.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "Non - Graduation", "Under Graduation", "Post Graduation", "Others"}));
		EQ.setSelectedIndex(0);
		EQ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		EQ.setBackground(Color.WHITE);
		EQ.setBounds(317, 309, 187, 35);
		contentPane.add(EQ);
		
		JComboBox occupation = new JComboBox();
		occupation.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "Student", "Employee", "Business", "Retird Employee"}));
		occupation.setSelectedIndex(0);
		occupation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		occupation.setBackground(Color.WHITE);
		occupation.setBounds(317, 385, 187, 35);
		contentPane.add(occupation);
		
		pan = new JTextField();
		pan.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.setBounds(317, 454, 274, 41);
		contentPane.add(pan);
		pan.setColumns(10);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		aadhar.setColumns(10);
		aadhar.setBounds(317, 518, 274, 41);
		contentPane.add(aadhar);
		
		JRadioButton citizenYES = new JRadioButton("YES");
		citizenYES.setHorizontalAlignment(SwingConstants.CENTER);
		citizenYES.setBackground(Color.WHITE);
		citizenYES.setFont(new Font("Tahoma", Font.BOLD, 18));
		citizenYES.setBounds(315, 596, 103, 21);
		contentPane.add(citizenYES);
		
		JRadioButton citizenNo = new JRadioButton("NO");
		citizenNo.setHorizontalAlignment(SwingConstants.CENTER);
		citizenNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		citizenNo.setBackground(Color.WHITE);
		citizenNo.setBounds(458, 596, 103, 21);
		contentPane.add(citizenNo);
		
		ButtonGroup citizen = new ButtonGroup();
		citizen.add(citizenYES);
		citizen.add(citizenNo);
		
		JRadioButton EAYes = new JRadioButton("YES");
		EAYes.setHorizontalAlignment(SwingConstants.CENTER);
		EAYes.setFont(new Font("Tahoma", Font.BOLD, 18));
		EAYes.setBackground(Color.WHITE);
		EAYes.setBounds(315, 653, 103, 21);
		contentPane.add(EAYes);
		
		JRadioButton EANo = new JRadioButton("NO");
		EANo.setHorizontalAlignment(SwingConstants.CENTER);
		EANo.setFont(new Font("Tahoma", Font.BOLD, 18));
		EANo.setBackground(Color.WHITE);
		EANo.setBounds(458, 656, 103, 21);
		contentPane.add(EANo);
		
		ButtonGroup account = new ButtonGroup();
		account.add(EAYes);
		account.add(EANo);
		
		JButton next = new JButton("NEXT");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String religion1 = religion.getSelectedItem().toString();
				String category1 = category.getSelectedItem().toString();
				String income1 = income.getSelectedItem().toString();
				String  eq1 = EQ.getSelectedItem().toString();
				String occupation1 = occupation.getSelectedItem().toString();
				String pan1 = pan.getText();
				String aadhar1 = aadhar.getText();
				String citizen1 = "";
				String existingAccount = "";
				
				if(citizenYES.isSelected())
				{
					citizen1 = "YES";
					
				}
				else
				{
					citizen1 ="NO";
				}
				if(EAYes.isSelected())
				{
					existingAccount = "YES";
					
				}
				else
				{
					existingAccount ="NO";
				}
				
				
				try
				{
					if(religion1.equals("") || category1.equals("")| income1.equals("")|| eq1.equals("")|| occupation1.equals("")|| pan1.equals("")|| aadhar1.equals("")|| citizen1.equals(""))
					{
                           JOptionPane.showMessageDialog(null, "Please Fill all Fields !!!");						
					}
					else
					{
						Conn c = new Conn();
						String query = "insert into signupOne values ('"+formno+"','"+religion1+"','"+category1+"','"+income1+"','"+eq1+"','"+occupation1+"','"+pan1+"','"+aadhar1+"','"+citizen1+"','"+existingAccount+"')";
						
						c.s.executeUpdate(query);
						
						setVisible(false);
						
						SignupTwo st = new SignupTwo(formno);
						st.setVisible(true);
						
					}
				}
				catch(Exception ae)
				{
					System.out.println(ae);
				}
				
				
			}
		});
		next.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		next.setForeground(Color.WHITE);
		next.setBackground(Color.BLACK);
		next.setBounds(628, 678, 153, 41);
		contentPane.add(next);
		
		
		
	}
}
