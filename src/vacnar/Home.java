package vacnar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JTextField;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
                    frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param userName 
	 */
	public Home() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1400, 49);
		panel.setBackground(new Color(0, 128, 128));
		contentPane.add(panel);
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
		
		
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBounds(830, 11, 246, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("SEARCH");
		btnNewButton_3.addActionListener(new ActionListener() {
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
		
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBounds(1077, 11, 76, 26);
		panel.add(btnNewButton_3);
		
		JButton QBT = new JButton("?");
		QBT.setBounds(1312, 0, 58, 49);
		panel.add(QBT);
		QBT.setFont(new Font("Tahoma", Font.BOLD, 13));
		QBT.setForeground(new Color(255, 255, 255));
		QBT.setFocusTraversalKeysEnabled(false);
		QBT.setFocusPainted(false);
		QBT.setBorderPainted(false);
		QBT.setBackground(new Color(0, 128, 128));
		QBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				About aobj = new About();
                aobj.setTitle("About");
                aobj.setVisible(true);
				
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("Add Record");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(113, 651, 314, 49);
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setRolloverEnabled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADD_REC vr = new ADD_REC();
                vr.setTitle("Add Record");
                vr.setVisible(true);
                dispose();
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("View Record");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(524, 651, 314, 49);
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
		contentPane.add(btnNewButton_1_1);
		
		int x = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select * from records");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	
            	rs.getString("NO");	
    			x++;
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		
		JLabel lblNewLabel = new JLabel("TOTAL DATA ADDED :");
		lblNewLabel.setBounds(152, 104, 169, 117);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		String sx=String.valueOf(x);
		JLabel lblNewLabel_1 = new JLabel(sx);
		lblNewLabel_1.setBounds(331, 104, 130, 117);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(113, 104, 314, 117);
		panel_1.setBackground(new Color(0, 128, 128));
		contentPane.add(panel_1);
		
		int y = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 2nddose from records where 2nddose IN ('Pfizer','Sputnic V','Sinopharm','Sinovac','Moderna','Covishield','Covaxin','Astrazenica')");
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	rs.getString("2nddose");
            	y++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String sy=String.valueOf(y);
		
		JLabel lblNewLabel_1_1 = new JLabel(sy);
		lblNewLabel_1_1.setBounds(742, 104, 130, 117);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL SECOND DOSES :");
		lblNewLabel_2.setBounds(563, 104, 169, 117);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(524, 104, 314, 117);
		panel_1_1.setBackground(new Color(0, 128, 128));
		contentPane.add(panel_1_1);
		
		int z = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 3rddose from records where 3rddose IN ('Pfizer','Sputnic V','Sinopharm','Sinovac','Moderna','Covishield','Covaxin','Astrazenica')");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	rs.getString("3rddose");
            	z++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String sz=String.valueOf(z);
		
		JLabel lblNewLabel_1_2 = new JLabel(sz);
		lblNewLabel_1_2.setBounds(1152, 104, 130, 117);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("TOTAL THIRD DOSES :");
		lblNewLabel_3.setBounds(973, 104, 169, 117);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(934, 104, 314, 117);
		panel_1_2.setBackground(new Color(0, 128, 128));
		contentPane.add(panel_1_2);
		
		JButton view_total = new JButton("           VIEW DETAILS >>>");
		view_total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total_det_view tdv = new total_det_view();
				tdv.setVisible(true);
			}
		});
		view_total.setHorizontalTextPosition(SwingConstants.CENTER);
		view_total.setHorizontalAlignment(SwingConstants.LEFT);
		view_total.setFont(new Font("Tahoma", Font.PLAIN, 13));
		view_total.setForeground(new Color(255, 255, 255));
		view_total.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		view_total.setBorder(null);
		view_total.setBackground(new Color(47, 79, 79));
		view_total.setBounds(113, 228, 314, 32);
		contentPane.add(view_total);
		
		JButton view_total_1 = new JButton("           VIEW DETAILS >>>");
		view_total_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total_sec_dose tsd = new total_sec_dose();
				tsd.setVisible(true);
			}
		});
		view_total_1.setHorizontalTextPosition(SwingConstants.CENTER);
		view_total_1.setHorizontalAlignment(SwingConstants.LEFT);
		view_total_1.setForeground(Color.WHITE);
		view_total_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		view_total_1.setBorder(null);
		view_total_1.setBackground(new Color(47, 79, 79));
		view_total_1.setBounds(524, 228, 314, 32);
		contentPane.add(view_total_1);
		
		JButton view_total_2 = new JButton("           VIEW DETAILS >>>");
		view_total_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total_trd_dose ttd = new total_trd_dose();
				ttd.setVisible(true);
			}
		});
		view_total_2.setHorizontalTextPosition(SwingConstants.CENTER);
		view_total_2.setHorizontalAlignment(SwingConstants.LEFT);
		view_total_2.setForeground(Color.WHITE);
		view_total_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		view_total_2.setBorder(null);
		view_total_2.setBackground(new Color(47, 79, 79));
		view_total_2.setBounds(934, 228, 314, 32);
		contentPane.add(view_total_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Edit Record");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit_rec edr = new edit_rec(sz, sz, sz, sz, sz, sz, sz, sz, sz, sz, sz, sz, sz, sz, sz, sz, sz, sz);
				edr.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1.setRolloverEnabled(false);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_1.setFocusable(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1_1.setBounds(934, 651, 314, 49);
		contentPane.add(btnNewButton_1_1_1);
		
		
		
	
		  
		}   
}
