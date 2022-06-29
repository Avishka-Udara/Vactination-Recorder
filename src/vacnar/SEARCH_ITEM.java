package vacnar;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.UIManager;


public class SEARCH_ITEM extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel adrs;
	private JTextField textField;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtSerialNo;
	private JTextField txtDob;
	private JTextField txtNic;
	private JTextField txtGender;
	private JTextField txtstDose;
	private JTextField txtDate;
	private JTextField txtBatch;
	private JTextField txtndDose;
	private JTextField txtdDate;
	private JTextField txtdBatch;
	private JTextField txtrdDose;
	private JTextField txtdDate_1;
	private JTextField txtdBatch_1;
	private JTextField txtDistrict;
	private JTextField txtMoh;
	private JTextField txtNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String Name = null;
					String address = null;
					String DOB = null;
					String NIC = null;
					String gender = null;
					String District = null;
					String MOH = null;
					String Serial = null;
					String fstdose = null;
					String fddate = null;
					String fdbatch = null;
					String snddose = null;
					String sddate = null;
					String sdbatch = null;
					String trddose = null;
					String trddate = null;
					String trdbatch = null;
					String NO = null;
					SEARCH_ITEM frame = new SEARCH_ITEM(Name,address,DOB,NIC,gender,District,MOH,Serial,fstdose,fddate,fdbatch,snddose,sddate,sdbatch,trddose,trddate,trdbatch,NO);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param nO 
	 * @param trdbatch 
	 * @param trddate 
	 * @param trddose 
	 * @param sdbatch 
	 * @param sddate 
	 * @param snddose 
	 * @param fdbatch 
	 * @param fddate 
	 * @param fstdose 
	 * @param serial 
	 * @param mOH 
	 * @param district 
	 * @param gender 
	 * @param nIC 
	 * @param dOB 
	 * @param address 
	 * @param name 
	 */
	public SEARCH_ITEM(String Name, String address, String DOB, String NIC, String gender, String District, String MOH, String Serial, String fstdose, String fddate, String fdbatch, String snddose, String sddate, String sdbatch, String trddose, String trddate, String trdbatch, String NO) {
		//System.out.println(Name+address+DOB+NIC+gender+District+MOH+Serial+fstdose+fddate+fdbatch+snddose+sddate+sdbatch+trddose+trddate+trdbatch+NO);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 750);
		adrs = new JPanel();
		adrs.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(adrs);
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1400, 750);
		getContentPane().setLayout(null);
		adrs.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1400, 49);
		panel.setBackground(new Color(0, 128, 128));
		adrs.add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(1203, -1, 99, 49);
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                    logout obj = new logout();
                    obj.setVisible(true);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("VacnaR");
		btnNewButton_2.setBackground(new Color(0, 128, 128));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(0, 0, 114, 49);
		btnNewButton_2.setRolloverEnabled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    Home hm = new Home();
                    hm.setTitle("Dashboard");
                    hm.setVisible(true);
                    dispose();
			}
		});
		panel.add(btnNewButton_2);
		
		
		JButton QBT = new JButton("?");
		QBT.setBounds(1312, 0, 58, 49);
		panel.add(QBT);
		QBT.setFont(new Font("Tahoma", Font.BOLD, 13));
		QBT.setForeground(new Color(255, 255, 255));
		QBT.setFocusTraversalKeysEnabled(false);
		QBT.setFocusPainted(false);
		QBT.setBorderPainted(false);
		QBT.setBackground(new Color(0, 128, 128));
		// TODO Auto-generated constructor stub
		
		JButton btnNewButton_1_1 = new JButton("View Record");
		btnNewButton_1_1.setBounds(124, -1, 114, 49);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                View_Rec vr = new View_Rec();
                vr.setTitle("View Record");
                vr.setVisible(true);
                dispose();
			}
		});
		btnNewButton_1_1.setRolloverEnabled(false);
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		
		JButton btnNewButton_1_2 = new JButton("Add Record");
		btnNewButton_1_2.setBounds(248, -1, 114, 49);
		panel.add(btnNewButton_1_2);
		btnNewButton_1_2.setRolloverEnabled(false);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ADD_REC vr = new ADD_REC();
                vr.setTitle("Add Record");
                vr.setVisible(true);
                dispose();
			}
		});
		btnNewButton_1_2.setFocusable(false);
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBackground(new Color(0, 128, 128));
		QBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				About aobj = new About();
                aobj.setTitle("About");
                aobj.setVisible(true);
				
			}
		});
		
		
		JLabel lblNewLabel = new JLabel("SEARCH RESULTS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(312, 217, 296, 53);
		adrs.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(0, 48, 1370, 158);
		adrs.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(307, 49, 586, 46);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Create DataBase Coonection and Fetching Records  
		        try {  
		            String str = textField.getText();   
		            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");
		            PreparedStatement st = con.prepareStatement("select * from records where Name=?");  
		            st.setString(1, str);  
		            //Executing Query  
		            ResultSet rs = st.executeQuery();  
		            if (rs.next()) {  

		                String Name = rs.getString(1);  
		                String address = rs.getString(2);  
		                String DOB = rs.getString(3);  
		                String NIC = rs.getString(4); 
		                String gender = rs.getString(5);  
		                String District = rs.getString(6);  
		                String MOH = rs.getString(7);  
		                String Serial = rs.getString(8); 
		                String fstdose = rs.getString(9);  
		                String fddate = rs.getString(10);  
		                String fdbatch = rs.getString(11);  
		                String snddose = rs.getString(12); 
		                String sddate = rs.getString(13);  
		                String sdbatch = rs.getString(14);  
		                String trddose = rs.getString(15);  
		                String trddate = rs.getString(16);  
		                String trdbatch = rs.getString(17);  
		                String NO = rs.getString(18); 
		                
		                dispose();
		                SEARCH_ITEM search = new SEARCH_ITEM(Name,address,DOB,NIC,gender,District,MOH,Serial,fstdose,fddate,fdbatch,snddose,sddate,sdbatch,trddose,trddate,trdbatch,NO);
		                search.setTitle("Search");
		                search.setVisible(true);
		                
		                
		                
		                
		                //Sets Records in TextFields.  
		                //tf1.setText(s);  
		                //tf2.setText(s1);  
		                //tf3.setText(s2);  
		                //tf4.setText(s3);  
		            } else {  
		                JOptionPane.showMessageDialog(null, "Name not Found");  
		            }  
		            //Create Exception Handler  
		        } catch (Exception ex) {  
		            System.out.println(ex);  
		        }
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(903, 49, 174, 46);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("NAME");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setBounds(339, 313, 81, 27);
		adrs.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Address");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(339, 352, 81, 27);
		adrs.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("DOB");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_5.setBounds(339, 389, 81, 27);
		adrs.add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_3_2 = new JLabel("District");
		lblNewLabel_1_1_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_3_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1_1_1_3_2.setBounds(339, 427, 81, 27);
		adrs.add(lblNewLabel_1_1_1_3_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Serial NO");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(339, 465, 81, 27);
		adrs.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_4_3 = new JLabel("1st dose");
		lblNewLabel_1_1_1_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_4_3.setBounds(339, 503, 81, 27);
		adrs.add(lblNewLabel_1_1_1_4_3);
		
		JLabel lblNewLabel_1_1_1_4_2_1 = new JLabel("3rd dose");
		lblNewLabel_1_1_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_4_2_1.setBounds(339, 579, 81, 27);
		adrs.add(lblNewLabel_1_1_1_4_2_1);
		
		JLabel lblNewLabel_1_1_1_4_1_1 = new JLabel("2nd dose");
		lblNewLabel_1_1_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_4_1_1.setBounds(339, 541, 81, 27);
		adrs.add(lblNewLabel_1_1_1_4_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("NIC");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_2.setBounds(622, 389, 40, 27);
		adrs.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_3 = new JLabel("DATE");
		lblNewLabel_1_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_3.setBounds(622, 503, 40, 27);
		adrs.add(lblNewLabel_1_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_2_1 = new JLabel("DATE");
		lblNewLabel_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_2_1.setBounds(622, 579, 40, 27);
		adrs.add(lblNewLabel_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("DATE");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(622, 541, 40, 27);
		adrs.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("Gender");
		lblNewLabel_1_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_2.setBounds(856, 389, 47, 27);
		adrs.add(lblNewLabel_1_1_1_2_2);
		
		JLabel lblNewLabel_1_1_1_2_1_3 = new JLabel("Batch");
		lblNewLabel_1_1_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_1_3.setBounds(856, 503, 47, 27);
		adrs.add(lblNewLabel_1_1_1_2_1_3);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("Batch");
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(856, 541, 47, 27);
		adrs.add(lblNewLabel_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_2_1 = new JLabel("Batch");
		lblNewLabel_1_1_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_1_2_1.setBounds(856, 579, 47, 27);
		adrs.add(lblNewLabel_1_1_1_2_1_2_1);
		
		JLabel lblNewLabel_1_1_1_3_1_1 = new JLabel("MOH");
		lblNewLabel_1_1_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_3_1_1.setBounds(738, 427, 41, 27);
		adrs.add(lblNewLabel_1_1_1_3_1_1);
		
		
		txtName = new JTextField();
		txtName.setVerifyInputWhenFocusTarget(false);
		txtName.setSelectionColor(new Color(0, 128, 128));
		txtName.setText(Name);
		txtName.setBorder(UIManager.getBorder("MenuBar.border"));
		txtName.setBounds(429, 313, 596, 27);
		adrs.add(txtName);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setVerifyInputWhenFocusTarget(false);
		txtAddress.setText(address);
		txtAddress.setSelectionColor(new Color(0, 128, 128));
		txtAddress.setColumns(10);
		txtAddress.setBorder(UIManager.getBorder("MenuBar.border"));
		txtAddress.setBounds(429, 352, 596, 27);
		adrs.add(txtAddress);
		
		txtSerialNo = new JTextField();
		txtSerialNo.setVerifyInputWhenFocusTarget(false);
		txtSerialNo.setText(Serial);
		txtSerialNo.setSelectionColor(new Color(0, 128, 128));
		txtSerialNo.setColumns(10);
		txtSerialNo.setBorder(UIManager.getBorder("MenuBar.border"));
		txtSerialNo.setBounds(429, 465, 596, 27);
		adrs.add(txtSerialNo);
		
		txtDob = new JTextField();
		txtDob.setVerifyInputWhenFocusTarget(false);
		txtDob.setText(DOB);
		txtDob.setSelectionColor(new Color(0, 128, 128));
		txtDob.setColumns(10);
		txtDob.setBorder(UIManager.getBorder("MenuBar.border"));
		txtDob.setBounds(429, 389, 138, 27);
		adrs.add(txtDob);
		
		txtNic = new JTextField();
		txtNic.setVerifyInputWhenFocusTarget(false);
		txtNic.setText(NIC);
		txtNic.setSelectionColor(new Color(0, 128, 128));
		txtNic.setColumns(10);
		txtNic.setBorder(UIManager.getBorder("MenuBar.border"));
		txtNic.setBounds(672, 389, 138, 27);
		adrs.add(txtNic);
		
		txtGender = new JTextField();
		txtGender.setVerifyInputWhenFocusTarget(false);
		txtGender.setText(gender);
		txtGender.setSelectionColor(new Color(0, 128, 128));
		txtGender.setColumns(10);
		txtGender.setBorder(UIManager.getBorder("MenuBar.border"));
		txtGender.setBounds(913, 389, 112, 27);
		adrs.add(txtGender);
		
		txtstDose = new JTextField();
		txtstDose.setVerifyInputWhenFocusTarget(false);
		txtstDose.setText(fstdose);
		txtstDose.setSelectionColor(new Color(0, 128, 128));
		txtstDose.setColumns(10);
		txtstDose.setBorder(UIManager.getBorder("MenuBar.border"));
		txtstDose.setBounds(429, 503, 138, 27);
		adrs.add(txtstDose);
		
		txtDate = new JTextField();
		txtDate.setVerifyInputWhenFocusTarget(false);
		txtDate.setText(fddate);
		txtDate.setSelectionColor(new Color(0, 128, 128));
		txtDate.setColumns(10);
		txtDate.setBorder(UIManager.getBorder("MenuBar.border"));
		txtDate.setBounds(672, 503, 138, 27);
		adrs.add(txtDate);
		
		txtBatch = new JTextField();
		txtBatch.setVerifyInputWhenFocusTarget(false);
		txtBatch.setText(fdbatch);
		txtBatch.setSelectionColor(new Color(0, 128, 128));
		txtBatch.setColumns(10);
		txtBatch.setBorder(UIManager.getBorder("MenuBar.border"));
		txtBatch.setBounds(913, 503, 112, 27);
		adrs.add(txtBatch);
		
		txtndDose = new JTextField();
		txtndDose.setVerifyInputWhenFocusTarget(false);
		txtndDose.setText(snddose);
		txtndDose.setSelectionColor(new Color(0, 128, 128));
		txtndDose.setColumns(10);
		txtndDose.setBorder(UIManager.getBorder("MenuBar.border"));
		txtndDose.setBounds(429, 541, 138, 27);
		adrs.add(txtndDose);
		
		txtdDate = new JTextField();
		txtdDate.setVerifyInputWhenFocusTarget(false);
		txtdDate.setText(sddate);
		txtdDate.setSelectionColor(new Color(0, 128, 128));
		txtdDate.setColumns(10);
		txtdDate.setBorder(UIManager.getBorder("MenuBar.border"));
		txtdDate.setBounds(672, 541, 138, 27);
		adrs.add(txtdDate);
		
		txtdBatch = new JTextField();
		txtdBatch.setVerifyInputWhenFocusTarget(false);
		txtdBatch.setText(sdbatch);
		txtdBatch.setSelectionColor(new Color(0, 128, 128));
		txtdBatch.setColumns(10);
		txtdBatch.setBorder(UIManager.getBorder("MenuBar.border"));
		txtdBatch.setBounds(913, 541, 112, 27);
		adrs.add(txtdBatch);
		
		txtrdDose = new JTextField();
		txtrdDose.setVerifyInputWhenFocusTarget(false);
		txtrdDose.setText(trddose);
		txtrdDose.setSelectionColor(new Color(0, 128, 128));
		txtrdDose.setColumns(10);
		txtrdDose.setBorder(UIManager.getBorder("MenuBar.border"));
		txtrdDose.setBounds(429, 579, 138, 27);
		adrs.add(txtrdDose);
		
		txtdDate_1 = new JTextField();
		txtdDate_1.setVerifyInputWhenFocusTarget(false);
		txtdDate_1.setText(trddate);
		txtdDate_1.setSelectionColor(new Color(0, 128, 128));
		txtdDate_1.setColumns(10);
		txtdDate_1.setBorder(UIManager.getBorder("MenuBar.border"));
		txtdDate_1.setBounds(672, 579, 138, 27);
		adrs.add(txtdDate_1);
		
		txtdBatch_1 = new JTextField();
		txtdBatch_1.setVerifyInputWhenFocusTarget(false);
		txtdBatch_1.setText(trdbatch);
		txtdBatch_1.setSelectionColor(new Color(0, 128, 128));
		txtdBatch_1.setColumns(10);
		txtdBatch_1.setBorder(UIManager.getBorder("MenuBar.border"));
		txtdBatch_1.setBounds(913, 579, 112, 27);
		adrs.add(txtdBatch_1);
		
		txtDistrict = new JTextField();
		txtDistrict.setVerifyInputWhenFocusTarget(false);
		txtDistrict.setText(District);
		txtDistrict.setSelectionColor(new Color(0, 128, 128));
		txtDistrict.setColumns(10);
		txtDistrict.setBorder(UIManager.getBorder("MenuBar.border"));
		txtDistrict.setBounds(430, 427, 240, 27);
		adrs.add(txtDistrict);
		
		txtMoh = new JTextField();
		txtMoh.setVerifyInputWhenFocusTarget(false);
		txtMoh.setText(MOH);
		txtMoh.setSelectionColor(new Color(0, 128, 128));
		txtMoh.setColumns(10);
		txtMoh.setBorder(UIManager.getBorder("MenuBar.border"));
		txtMoh.setBounds(789, 427, 236, 27);
		adrs.add(txtMoh);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("NO");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1_2_1.setBounds(339, 275, 81, 27);
		adrs.add(lblNewLabel_1_2_1);
		
		txtNo = new JTextField();
		txtNo.setBackground(UIManager.getColor("Button.background"));
		txtNo.setVerifyInputWhenFocusTarget(false);
		txtNo.setText(NO);
		txtNo.setSelectionColor(new Color(0, 128, 128));
		txtNo.setColumns(10);
		txtNo.setBorder(UIManager.getBorder("MenuBar.border"));
		txtNo.setBounds(429, 275, 596, 27);
		adrs.add(txtNo);
		
		

	}
}
