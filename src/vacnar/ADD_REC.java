package vacnar;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.UIManager;

public class ADD_REC extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAddRecords;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtYear;
	private JTextField txtMonth;
	private JTextField txtDate;
	private JTextField txtYyyy;
	private JTextField txtMm;
	private JTextField txtDd;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel label_2;
	private JLabel label;
	private JLabel lblDay;
	private JLabel label_1;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADD_REC frame = new ADD_REC();
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
	public ADD_REC() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 750);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setSize(new Dimension(1279, 603));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1370, 49);
		panel.setBackground(new Color(0, 128, 128));
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnNewButton_2 = new JButton("VacnaR");
		btnNewButton_2.setBackground(new Color(0, 128, 128));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(0, 0, 114, 49);
		btnNewButton_2.setRolloverEnabled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    dispose();
                    Home hm = new Home();
                    hm.setTitle("Dashboard");
                    hm.setVisible(true);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(1266, 0, 104, 49);
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    Login obj = new Login();
                    obj.setTitle("Login");
                    obj.setVisible(true);
                }
                //dispose();
                //Loging obj = new Loging();

                //obj.setTitle("Login again");
               // obj.setVisible(true);
			}
		});
		panel.add(btnNewButton);
		
	
		
		JButton btnNewButton_1_1 = new JButton("View Record");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
                View_Rec vr = new View_Rec();
                vr.setTitle("View Record");
                vr.setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(1142, 0, 114, 49);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.setRolloverEnabled(false);
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		
		txtAddRecords = new JTextField();
		txtAddRecords.setBorder(UIManager.getBorder("ComboBox.border"));
		txtAddRecords.setBounds(0, 48, 1370, 66);
		txtAddRecords.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAddRecords.setBackground(new Color(230, 230, 250));
		txtAddRecords.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddRecords.setText("    Add Records");
		contentPane.add(txtAddRecords);
		txtAddRecords.setFocusable(false);
		txtAddRecords.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(249, 137, 93, 23);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(397, 134, 713, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setBounds(249, 171, 93, 39);
		contentPane.add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setBounds(397, 168, 713, 42);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel label_2_1 = new JLabel("D.O.B");
		label_2_1.setBounds(249, 221, 93, 26);
		contentPane.add(label_2_1);
		
		txtYear = new JTextField();
		txtYear.setBounds(440, 221, 123, 26);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		txtMonth = new JTextField();
		txtMonth.setBounds(613, 221, 86, 26);
		contentPane.add(txtMonth);
		txtMonth.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setBounds(744, 221, 86, 26);
		txtDate.setColumns(10);
		contentPane.add(txtDate);

		
		
		JLabel label_2_1_1 = new JLabel("NIC");
		label_2_1_1.setBounds(249, 258, 93, 25);
		contentPane.add(label_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(397, 258, 713, 25);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JLabel label_2_1_1_1 = new JLabel("Gender");
		label_2_1_1_1.setBounds(249, 294, 93, 25);
		contentPane.add(label_2_1_1_1);
		
		Choice choice = new Choice();
		choice.setBounds(397, 294, 219, 25);
		contentPane.add(choice);
		choice.add("Male");    
		choice.add("Female");
		
		JLabel label_2_1_1_1_1 = new JLabel("District");
		label_2_1_1_1_1.setBounds(249, 330, 93, 25);
		contentPane.add(label_2_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(397, 330, 713, 25);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JLabel label_2_1_1_1_1_1 = new JLabel("MOH area");
		label_2_1_1_1_1_1.setBounds(249, 366, 138, 25);
		contentPane.add(label_2_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(397, 366, 713, 25);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JLabel label_2_1_1_1_1_1_1 = new JLabel("Serial No in reg");
		label_2_1_1_1_1_1_1.setBounds(249, 402, 138, 25);
		contentPane.add(label_2_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(397, 402, 713, 25);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		JLabel label_2_1_1_1_2 = new JLabel("1st dose / Date");
		label_2_1_1_1_2.setBounds(249, 438, 142, 25);
		contentPane.add(label_2_1_1_1_2);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(397, 438, 154, 25);
		contentPane.add(choice_1);

		choice_1.add("Pfizer");    
		choice_1.add("Moderna"); 
		choice_1.add("AstraZeneca"); 
		choice_1.add("Sinopharm"); 
		choice_1.add("Sputnik V");
		
		
		txtYyyy = new JTextField();
		txtYyyy.setBounds(602, 438, 82, 25);
		contentPane.add(txtYyyy);
		txtYyyy.setColumns(10);
		
		txtMm = new JTextField();
		txtMm.setBounds(720, 438, 57, 25);
		txtMm.setColumns(10);
		contentPane.add(txtMm);
		
		txtDd = new JTextField();
		txtDd.setBounds(805, 438, 47, 25);
		txtDd.setColumns(10);
		contentPane.add(txtDd);
		
		JLabel label_2_1_1_1_1_1_2 = new JLabel("Batch No");
		label_2_1_1_1_1_1_2.setBounds(881, 438, 61, 25);
		contentPane.add(label_2_1_1_1_1_1_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(942, 438, 168, 25);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		JLabel label_2_1_1_1_2_1 = new JLabel("2st dose / Date");
		label_2_1_1_1_2_1.setBounds(249, 474, 142, 25);
		contentPane.add(label_2_1_1_1_2_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(397, 474, 154, 25);
		contentPane.add(choice_2);
		choice_2.add("Pfizer");    
		choice_2.add("Moderna"); 
		choice_2.add("AstraZeneca"); 
		choice_2.add("Sinopharm"); 
		choice_2.add("Sputnik V");
		
		textField_7 = new JTextField();
		textField_7.setBounds(602, 474, 82, 25);
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(720, 474, 57, 25);
		textField_8.setColumns(10);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(805, 474, 47, 25);
		textField_9.setColumns(10);
		contentPane.add(textField_9);
		
		JLabel label_2_1_1_1_1_1_2_1 = new JLabel("Batch No");
		label_2_1_1_1_1_1_2_1.setBounds(881, 474, 61, 25);
		contentPane.add(label_2_1_1_1_1_1_2_1);
		
		textField_10 = new JTextField();
		textField_10.setBounds(942, 474, 168, 25);
		textField_10.setColumns(10);
		contentPane.add(textField_10);
		
		JLabel label_2_1_1_1_2_1_1 = new JLabel("Booster / Date");
		label_2_1_1_1_2_1_1.setBounds(249, 513, 142, 25);
		contentPane.add(label_2_1_1_1_2_1_1);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(397, 513, 154, 25);
		contentPane.add(choice_3);
		choice_3.add("Pfizer");    
		choice_3.add("Moderna"); 
		choice_3.add("AstraZeneca"); 
		choice_3.add("Sinopharm"); 
		choice_3.add("Sputnik V");
		
		
		textField_11 = new JTextField();
		textField_11.setBounds(602, 513, 82, 25);
		textField_11.setColumns(10);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(720, 513, 57, 25);
		textField_12.setColumns(10);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(805, 513, 47, 25);
		textField_13.setColumns(10);
		contentPane.add(textField_13);
		
		JLabel label_2_1_1_1_1_1_2_2 = new JLabel("Batch No");
		label_2_1_1_1_1_1_2_2.setBounds(881, 513, 61, 25);
		contentPane.add(label_2_1_1_1_1_1_2_2);
		
		textField_14 = new JTextField();
		textField_14.setBounds(942, 513, 168, 25);
		textField_14.setColumns(10);
		contentPane.add(textField_14);
				
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.setBounds(249, 579, 861, 32);
		btnNewButton_1.setFocusCycleRoot(true);
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Name = textField.getText();
				String address = textField_1.getText();

				String DOBY = txtYear.getText();
				String DOBM = txtMonth.getText();
				String DOBD = txtDate.getText();
				
				String nic = textField_2.getText();
				String gender = choice.getSelectedItem();
				String district = textField_3.getText();
				String moh = textField_4.getText();
				String serial = textField_5.getText();
				String fd = choice_1.getSelectedItem();

				String FDY = txtYyyy.getText();
				String FDM = txtMm.getText();
				String FDD = txtDd.getText();
				String fbbatch = textField_6.getText();
				
				String sd = choice_2.getSelectedItem();
				String SDY = textField_7.getText();
				String SDM = textField_8.getText();
				String SDD = textField_9.getText();
				String sbbatch = textField_10.getText();
				
				String td = choice_3.getSelectedItem();
				String BDY = textField_11.getText();
				String BDM = textField_12.getText();
				String BDD = textField_13.getText();
				String tbbatch = textField_14.getText();
				
				System.out.println(Name+"','"+address+"','"+ DOBY +"/"+ DOBM +"/" +DOBD + "','" + nic + "','" + gender + "','" + district + "','" + moh + "','" + serial + "','" + fd + "','" + FDY +"/"+ FDM +"/" +FDD + "','" + fbbatch + "','" + sd + "','" + SDY +"/"+ SDM +"/" +SDD + "','" + sbbatch + "','" + td + "','" + BDY +"/"+ BDM +"/" +BDD + "','" + tbbatch);
				try {  
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", ""); 
		            Statement st = conn.createStatement(); 
		            
		            String query1=("INSERT INTO `records` (`Name`, `address`, `DOB`, `NIC`, `gender`, `District`, `MOH`, `Serial`, `1stdose`, `1ddate`, `1dbatch`, `2nddose`, `2ddate`, `2dbatch`, `3rddose`, `3ddate`, `3dbatch`) "+ 
		            "VALUES ('"+Name+"','"+address+"','"+  DOBY +"/"+ DOBM +"/" +DOBD + "','" + nic + "','" + gender + "','" + district + "','" + moh + "','" + serial + "','" + fd + "','" + FDY +"/"+ FDM +"/" +FDD + "','" + fbbatch + "','" + sd + "','" + SDY +"/"+ SDM +"/" +SDD + "','" + sbbatch + "','" + td + "','" + BDY +"/"+ BDM +"/" +BDD + "','" + tbbatch + "' ) ");
		            st.executeUpdate(query1);
		            conn.close(); 
		        } catch (Exception e1) { 
		            System.err.println("Got an exception! "); 
		            System.err.println(e1.getMessage()); 
		        }				
				
			}
		});		
		contentPane.add(btnNewButton_1);
		
		label_2 = new JLabel("YEAR");
		label_2.setForeground(Color.LIGHT_GRAY);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setBounds(397, 221, 40, 26);
		contentPane.add(label_2);
		
		label = new JLabel("MON");
		label.setForeground(Color.LIGHT_GRAY);
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(573, 221, 40, 26);
		contentPane.add(label);
		
		lblDay = new JLabel("DAY");
		lblDay.setForeground(Color.LIGHT_GRAY);
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDay.setBounds(709, 221, 40, 26);
		contentPane.add(lblDay);
		
		label_1 = new JLabel("YEAR");
		label_1.setForeground(Color.LIGHT_GRAY);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_1.setBounds(573, 437, 32, 26);
		contentPane.add(label_1);
		
		label_3 = new JLabel("YEAR");
		label_3.setForeground(Color.LIGHT_GRAY);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(573, 473, 32, 26);
		contentPane.add(label_3);
		
		label_4 = new JLabel("YEAR");
		label_4.setForeground(Color.LIGHT_GRAY);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(573, 513, 32, 26);
		contentPane.add(label_4);
		
		label_5 = new JLabel("MON");
		label_5.setForeground(Color.LIGHT_GRAY);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_5.setBounds(694, 512, 27, 26);
		contentPane.add(label_5);
		
		label_6 = new JLabel("MON");
		label_6.setForeground(Color.LIGHT_GRAY);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_6.setBounds(694, 472, 27, 26);
		contentPane.add(label_6);
		
		label_7 = new JLabel("MON");
		label_7.setForeground(Color.LIGHT_GRAY);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_7.setBounds(694, 436, 27, 26);
		contentPane.add(label_7);
		
		label_8 = new JLabel("DAY");
		label_8.setForeground(Color.LIGHT_GRAY);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_8.setBounds(782, 436, 23, 26);
		contentPane.add(label_8);
		
		label_9 = new JLabel("DAY");
		label_9.setForeground(Color.LIGHT_GRAY);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_9.setBounds(782, 472, 23, 26);
		contentPane.add(label_9);
		
		label_10 = new JLabel("DAY");
		label_10.setForeground(Color.LIGHT_GRAY);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_10.setBounds(782, 512, 23, 26);
		contentPane.add(label_10);
		
		
		
		
	}
}

