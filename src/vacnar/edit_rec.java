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


public class edit_rec extends JFrame {

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
					edit_rec frame = new edit_rec(Name,address,DOB,NIC,gender,District,MOH,Serial,fstdose,fddate,fdbatch,snddose,sddate,sdbatch,trddose,trddate,trdbatch,NO);
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
	public edit_rec(String Name, String address, String DOB, String NIC, String gender, String District, String MOH, String Serial, String fstdose, String fddate, String fdbatch, String snddose, String sddate, String sdbatch, String trddose, String trddate, String trdbatch, String NO) {
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
		lblNewLabel.setBounds(313, 199, 296, 53);
		adrs.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(0, 48, 1370, 120);
		adrs.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(306, 34, 586, 46);
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

		                String Name1 = rs.getString(1);  
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
		                edit_rec search = new edit_rec(Name1,address,DOB,NIC,gender,District,MOH,Serial,fstdose,fddate,fdbatch,snddose,sddate,sdbatch,trddose,trddate,trdbatch,NO);
		                search.setTitle("Search Records");
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
		btnNewButton_1.setBounds(902, 34, 174, 46);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("NAME");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setBounds(340, 295, 81, 27);
		adrs.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Address");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(340, 334, 81, 27);
		adrs.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("DOB");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_5.setBounds(340, 371, 81, 27);
		adrs.add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_3_2 = new JLabel("District");
		lblNewLabel_1_1_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_3_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1_1_1_3_2.setBounds(340, 409, 81, 27);
		adrs.add(lblNewLabel_1_1_1_3_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Serial NO");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(340, 447, 81, 27);
		adrs.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_4_3 = new JLabel("1st dose");
		lblNewLabel_1_1_1_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_4_3.setBounds(340, 485, 81, 27);
		adrs.add(lblNewLabel_1_1_1_4_3);
		
		JLabel lblNewLabel_1_1_1_4_2_1 = new JLabel("3rd dose");
		lblNewLabel_1_1_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_4_2_1.setBounds(340, 561, 81, 27);
		adrs.add(lblNewLabel_1_1_1_4_2_1);
		
		JLabel lblNewLabel_1_1_1_4_1_1 = new JLabel("2nd dose");
		lblNewLabel_1_1_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_4_1_1.setBounds(340, 523, 81, 27);
		adrs.add(lblNewLabel_1_1_1_4_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("NIC");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_2.setBounds(623, 371, 40, 27);
		adrs.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_3 = new JLabel("DATE");
		lblNewLabel_1_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_3.setBounds(623, 485, 40, 27);
		adrs.add(lblNewLabel_1_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_2_1 = new JLabel("DATE");
		lblNewLabel_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_2_1.setBounds(623, 561, 40, 27);
		adrs.add(lblNewLabel_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("DATE");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(623, 523, 40, 27);
		adrs.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("Gender");
		lblNewLabel_1_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_2.setBounds(857, 371, 47, 27);
		adrs.add(lblNewLabel_1_1_1_2_2);
		
		JLabel lblNewLabel_1_1_1_2_1_3 = new JLabel("Batch");
		lblNewLabel_1_1_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_1_3.setBounds(857, 485, 47, 27);
		adrs.add(lblNewLabel_1_1_1_2_1_3);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("Batch");
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(857, 523, 47, 27);
		adrs.add(lblNewLabel_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_2_1 = new JLabel("Batch");
		lblNewLabel_1_1_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_1_2_1.setBounds(857, 561, 47, 27);
		adrs.add(lblNewLabel_1_1_1_2_1_2_1);
		
		JLabel lblNewLabel_1_1_1_3_1_1 = new JLabel("MOH");
		lblNewLabel_1_1_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_3_1_1.setBounds(739, 409, 41, 27);
		adrs.add(lblNewLabel_1_1_1_3_1_1);
		
		
		txtName = new JTextField();
		txtName.setVerifyInputWhenFocusTarget(false);
		txtName.setSelectionColor(new Color(0, 128, 128));
		txtName.setText(Name);
		txtName.setBorder(UIManager.getBorder("MenuBar.border"));
		txtName.setBounds(430, 295, 596, 27);
		adrs.add(txtName);
		txtName.setColumns(10);  
		
		txtAddress = new JTextField();
		txtAddress.setVerifyInputWhenFocusTarget(false);
		txtAddress.setText(address);
		txtAddress.setSelectionColor(new Color(0, 128, 128));
		txtAddress.setColumns(10);
		txtAddress.setBorder(UIManager.getBorder("MenuBar.border"));
		txtAddress.setBounds(430, 334, 596, 27);
		adrs.add(txtAddress);
		
		txtSerialNo = new JTextField();
		txtSerialNo.setVerifyInputWhenFocusTarget(false);
		txtSerialNo.setText(Serial);
		txtSerialNo.setSelectionColor(new Color(0, 128, 128));
		txtSerialNo.setColumns(10);
		txtSerialNo.setBorder(UIManager.getBorder("MenuBar.border"));
		txtSerialNo.setBounds(430, 447, 596, 27);
		adrs.add(txtSerialNo);
		
		txtDob = new JTextField();
		txtDob.setVerifyInputWhenFocusTarget(false);
		txtDob.setText(DOB);
		txtDob.setSelectionColor(new Color(0, 128, 128));
		txtDob.setColumns(10);
		txtDob.setBorder(UIManager.getBorder("MenuBar.border"));
		txtDob.setBounds(430, 371, 138, 27);
		adrs.add(txtDob);
		
		txtNic = new JTextField();
		txtNic.setVerifyInputWhenFocusTarget(false);
		txtNic.setText(NIC);
		txtNic.setSelectionColor(new Color(0, 128, 128));
		txtNic.setColumns(10);
		txtNic.setBorder(UIManager.getBorder("MenuBar.border"));
		txtNic.setBounds(673, 371, 138, 27);
		adrs.add(txtNic);
		
		txtGender = new JTextField();
		txtGender.setVerifyInputWhenFocusTarget(false);
		txtGender.setText(gender);
		txtGender.setSelectionColor(new Color(0, 128, 128));
		txtGender.setColumns(10);
		txtGender.setBorder(UIManager.getBorder("MenuBar.border"));
		txtGender.setBounds(914, 371, 112, 27);
		adrs.add(txtGender);
		
		txtstDose = new JTextField();
		txtstDose.setVerifyInputWhenFocusTarget(false);
		txtstDose.setText(fstdose);
		txtstDose.setSelectionColor(new Color(0, 128, 128));
		txtstDose.setColumns(10);
		txtstDose.setBorder(UIManager.getBorder("MenuBar.border"));
		txtstDose.setBounds(430, 485, 138, 27);
		adrs.add(txtstDose);
		
		txtDate = new JTextField();
		txtDate.setVerifyInputWhenFocusTarget(false);
		txtDate.setText(fddate);
		txtDate.setSelectionColor(new Color(0, 128, 128));
		txtDate.setColumns(10);
		txtDate.setBorder(UIManager.getBorder("MenuBar.border"));
		txtDate.setBounds(673, 485, 138, 27);
		adrs.add(txtDate);
		
		txtBatch = new JTextField();
		txtBatch.setVerifyInputWhenFocusTarget(false);
		txtBatch.setText(fdbatch);
		txtBatch.setSelectionColor(new Color(0, 128, 128));
		txtBatch.setColumns(10);
		txtBatch.setBorder(UIManager.getBorder("MenuBar.border"));
		txtBatch.setBounds(914, 485, 112, 27);
		adrs.add(txtBatch);
		
		txtndDose = new JTextField();
		txtndDose.setVerifyInputWhenFocusTarget(false);
		txtndDose.setText(snddose);
		txtndDose.setSelectionColor(new Color(0, 128, 128));
		txtndDose.setColumns(10);
		txtndDose.setBorder(UIManager.getBorder("MenuBar.border"));
		txtndDose.setBounds(430, 523, 138, 27);
		adrs.add(txtndDose);
		
		txtdDate = new JTextField();
		txtdDate.setVerifyInputWhenFocusTarget(false);
		txtdDate.setText(sddate);
		txtdDate.setSelectionColor(new Color(0, 128, 128));
		txtdDate.setColumns(10);
		txtdDate.setBorder(UIManager.getBorder("MenuBar.border"));
		txtdDate.setBounds(673, 523, 138, 27);
		adrs.add(txtdDate);
		
		txtdBatch = new JTextField();
		txtdBatch.setVerifyInputWhenFocusTarget(false);
		txtdBatch.setText(sdbatch);
		txtdBatch.setSelectionColor(new Color(0, 128, 128));
		txtdBatch.setColumns(10);
		txtdBatch.setBorder(UIManager.getBorder("MenuBar.border"));
		txtdBatch.setBounds(914, 523, 112, 27);
		adrs.add(txtdBatch);
		
		txtrdDose = new JTextField();
		txtrdDose.setVerifyInputWhenFocusTarget(false);
		txtrdDose.setText(trddose);
		txtrdDose.setSelectionColor(new Color(0, 128, 128));
		txtrdDose.setColumns(10);
		txtrdDose.setBorder(UIManager.getBorder("MenuBar.border"));
		txtrdDose.setBounds(430, 561, 138, 27);
		adrs.add(txtrdDose);
		
		txtdDate_1 = new JTextField();
		txtdDate_1.setVerifyInputWhenFocusTarget(false);
		txtdDate_1.setText(trddate);
		txtdDate_1.setSelectionColor(new Color(0, 128, 128));
		txtdDate_1.setColumns(10);
		txtdDate_1.setBorder(UIManager.getBorder("MenuBar.border"));
		txtdDate_1.setBounds(673, 561, 138, 27);
		adrs.add(txtdDate_1);
		
		txtdBatch_1 = new JTextField();
		txtdBatch_1.setVerifyInputWhenFocusTarget(false);
		txtdBatch_1.setText(trdbatch);
		txtdBatch_1.setSelectionColor(new Color(0, 128, 128));
		txtdBatch_1.setColumns(10);
		txtdBatch_1.setBorder(UIManager.getBorder("MenuBar.border"));
		txtdBatch_1.setBounds(914, 561, 112, 27);
		adrs.add(txtdBatch_1);
		
		txtDistrict = new JTextField();
		txtDistrict.setVerifyInputWhenFocusTarget(false);
		txtDistrict.setText(District);
		txtDistrict.setSelectionColor(new Color(0, 128, 128));
		txtDistrict.setColumns(10);
		txtDistrict.setBorder(UIManager.getBorder("MenuBar.border"));
		txtDistrict.setBounds(431, 409, 240, 27);
		adrs.add(txtDistrict);
		
		txtMoh = new JTextField();
		txtMoh.setVerifyInputWhenFocusTarget(false);
		txtMoh.setText(MOH);
		txtMoh.setSelectionColor(new Color(0, 128, 128));
		txtMoh.setColumns(10);
		txtMoh.setBorder(UIManager.getBorder("MenuBar.border"));
		txtMoh.setBounds(790, 409, 236, 27);
		adrs.add(txtMoh);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("NO");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1_2_1.setBounds(340, 257, 81, 27);
		adrs.add(lblNewLabel_1_2_1);
		
		txtNo = new JTextField();
		txtNo.setBackground(UIManager.getColor("Button.background"));
		txtNo.setVerifyInputWhenFocusTarget(false);
		txtNo.setText(NO);
		txtNo.setSelectionColor(new Color(0, 128, 128));
		txtNo.setColumns(10);
		txtNo.setBorder(UIManager.getBorder("MenuBar.border"));
		txtNo.setBounds(430, 257, 596, 27);
		adrs.add(txtNo);
		
		JButton btnNewButton_1_3 = new JButton("SUBMIT");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				String Name2 = txtName.getText();
				String address = txtAddress.getText();

				String DOB = txtDob.getText();
				
				String nic = txtNic.getText();
				String gender = txtGender.getText();
				String district = txtDistrict.getText();
				String moh = txtMoh.getText();
				String serial = txtSerialNo.getText();
				
				String fd = txtstDose.getText();
				String FDD = txtDate.getText();
				String fbbatch = txtBatch.getText();
				
				String sd = txtndDose.getText();
				String SDD = txtdDate.getText();
				String sbbatch = txtdBatch.getText();
				
				String td = txtrdDose.getText();
				String BDD = txtdDate_1.getText();
				String tbbatch = txtdBatch_1.getText();
				
				try {  
					
		            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");
		            PreparedStatement st = con.prepareStatement("select * from records where Name=?");  
		            st.setString(1, Name);  
		            //Executing Query  
		            ResultSet rs = st.executeQuery();  

		            if (rs.next()) {   
		            
		            	System.out.println("name : "+ Name);
			            String query1=("UPDATE records "+ 
			            "SET Name= '"+Name2+"', address= '"+address+"', DOB ='"+ DOB +"',NIC ='"+ nic +"',gender ='"+ gender +"',District ='"+ district +"', MOH ='"+ moh +"', Serial ='"+ serial +"',1stdose ='"+ fd +"',1ddate ='"+ FDD +"',1dbatch ='"+ fbbatch +"',2nddose ='"+ sd +"', 2ddate='"+ SDD +"',2dbatch ='"+ sbbatch+"',3rddose ='"+td+"',3ddate ='"+BDD +"',3dbatch ='"+ tbbatch+"'"
			            		+ "where Name= '"+Name +"';");
			            System.out.println("on submit "+Name2+address+DOB+NIC+gender+District+MOH+Serial+fstdose+fddate+fdbatch+snddose+sddate+sdbatch+trddose+trddate+trdbatch+NO);
			            st.executeUpdate(query1);
			            con.close(); 
			            SUCCESSFULLY_EDIT se = new SUCCESSFULLY_EDIT();
		                se.setTitle("SUCCESSFULLY EDIT");
		                se.setVisible(true);
		            }
		        } catch (Exception e1) { 
		            System.err.println("Got an exception! "); 
		            System.err.println(e1.getMessage()); 
		        }
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBackground(new Color(64, 224, 208));
		btnNewButton_1_3.setBounds(790, 632, 236, 46);
		adrs.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4_1 = new JButton("RESET");
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
                edit_rec search = new edit_rec(Name,address,DOB,NIC,gender,District,MOH,Serial,fstdose,fddate,fdbatch,snddose,sddate,sdbatch,trddose,trddate,trdbatch,NO);
                search.setTitle("Search");
                search.setVisible(true);
                				
			}
		});
		btnNewButton_1_4_1.setForeground(Color.WHITE);
		btnNewButton_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_4_1.setBorderPainted(false);
		btnNewButton_1_4_1.setBorder(null);
		btnNewButton_1_4_1.setBackground(new Color(0, 139, 139));
		btnNewButton_1_4_1.setBounds(598, 632, 166, 46);
		adrs.add(btnNewButton_1_4_1);
		
		

	}
}
