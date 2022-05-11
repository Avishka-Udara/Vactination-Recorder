package vacnar;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.DropMode;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;

public class View_record extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAddRecords;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_record frame = new View_record();
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
	public View_record() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 557);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 765, 49);
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
		btnNewButton.setBounds(661, 0, 104, 49);
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                JOptionPane.setRootFrame(null);
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
		
	

		JButton btnNewButton_1_1 = new JButton("Add Record");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ADD_REC ar = new ADD_REC();
                ar.setTitle("Add Record");
                ar.setVisible(true);
			}
		});
		
		btnNewButton_1_1.setBounds(537, 0, 114, 49);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.setRolloverEnabled(false);
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		
		txtAddRecords = new JTextField();
		txtAddRecords.setVerifyInputWhenFocusTarget(false);
		txtAddRecords.setAlignmentY(0.1f);
		txtAddRecords.setAlignmentX(0.1f);
		txtAddRecords.setDropMode(DropMode.ON);
		txtAddRecords.setEnabled(false);
		txtAddRecords.setRequestFocusEnabled(false);
		txtAddRecords.setOpaque(false);
		txtAddRecords.setBorder(null);
		txtAddRecords.setAutoscrolls(false);
		txtAddRecords.setBounds(0, 48, 765, 61);
		txtAddRecords.setFocusTraversalKeysEnabled(false);
		txtAddRecords.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAddRecords.setBackground(SystemColor.controlHighlight);
		txtAddRecords.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddRecords.setText("    View Records");
		contentPane.add(txtAddRecords);
		txtAddRecords.setFocusable(false);
		txtAddRecords.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 109, 765, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel name = new JLabel("Name");
		name.setBounds(21, 24, 69, 14);
		panel_1.add(name);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setBounds(100, 24, 69, 14);
		panel_1.add(lblAddress);
		
		JLabel dob = new JLabel("DOB");
		dob.setBounds(177, 24, 61, 14);
		panel_1.add(dob);
		
		JLabel lblNic = new JLabel("NIC");
		lblNic.setBounds(248, 24, 46, 14);
		panel_1.add(lblNic);
		
		JLabel lblGender = new JLabel("gender");
		lblGender.setBounds(304, 24, 40, 14);
		panel_1.add(lblGender);
		
		JLabel lblDistrict = new JLabel("District");
		lblDistrict.setBounds(354, 24, 51, 14);
		panel_1.add(lblDistrict);
		
		JLabel lblMoh = new JLabel("MOH");
		lblMoh.setBounds(420, 24, 52, 14);
		panel_1.add(lblMoh);
		
		JLabel lblSerial = new JLabel("serial");
		lblSerial.setBounds(482, 24, 58, 14);
		panel_1.add(lblSerial);
		
		JLabel lblFdDate = new JLabel("FD date");
		lblFdDate.setBounds(547, 24, 58, 14);
		panel_1.add(lblFdDate);
		
		JLabel lblSdDate = new JLabel("SD date");
		lblSdDate.setBounds(612, 24, 58, 14);
		panel_1.add(lblSdDate);
		
		JLabel lblTdDate = new JLabel("TD date");
		lblTdDate.setBounds(683, 24, 58, 14);
		panel_1.add(lblTdDate);
		
		
		

    	int height = 158;
 
    	int results = 0;
		while (results<11) {
 
    		try {
                Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

                PreparedStatement st = (PreparedStatement) connection1
                    .prepareStatement("SELECT * FROM `records`");

                String Name = null;
				st.setString(1, Name);
				String address = null;
				st.setString(2, address);
				String DOB = null;
				st.setString(3, DOB);
				String NIC = null;
				st.setString(4, NIC);
				String gender = null;
				st.setString(5, gender);
				String District = null;
				st.setString(6, District);
				String MOH = null;
				st.setString(7, MOH);
				String Serial = null;
				st.setString(8, Serial);
				String fdose = null;
				st.setString(9, fdose);
				String fdate = null;
				st.setString(10, fdate);
				String fbatch = null;
				st.setString(11, fbatch);
				String sdose = null;
				st.setString(12, sdose);
				String sdate = null;
				st.setString(13, sdate);
				String sbatch = null;
				st.setString(14, sbatch);
				String tdose = null;
				st.setString(15, tdose);
				String tdate = null;
				st.setString(16, tdate);
				String tbatch = null;
				st.setString(17, tbatch);
				int NO = 000;
				st.setInt(18, NO);
				
                results++;
                
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }						
				height = height + 20;
				
    	}
	}
}
 
	/*
	 
	  * Please note :
	 
	  * ResultSet API provides appropriate methods for retrieving data 
	 
	  * based on each column data type e.g.
	 
	  * 
	 
	  * boolean bool = rs.getBoolean("test_col");
	 
	  * byte b = rs.getByte("test_col");
	 
	  * short s = rs.getShort("test_col");
	 
	  * int i = rs.getInt("test_col");
	 
	  * long l = rs.getLong("test_col");
	 
	  * float f = rs.getFloat("test_col");
	 
	  * double d = rs.getDouble("test_col");
	 
	  * BigDecimal bd = rs.getBigDecimal("test_col");
	 
	  * String str = rs.getString("test_col");
	 
	  * Date date = rs.getDate("test_col");
	 
	  * Time t = rs.getTime("test_col");
	 
	  * Timestamp ts = rs.getTimestamp("test_col");
	 
	  * InputStream ais = rs.getAsciiStream("test_col");
	 
	  * InputStream bis = rs.getBinaryStream("test_col");
	 
	  * Blob blob = rs.getBlob("test_col");
	 
	  *
	 
	  *  } 
		*
		*catch (SQLException e) {
	 
	   * }
	 *
	*}
*}
*/