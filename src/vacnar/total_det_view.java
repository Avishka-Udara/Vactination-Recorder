package vacnar;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class total_det_view extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					total_det_view frame = new total_det_view();
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
	public total_det_view() {
		setLocationByPlatform(true);
		setType(Type.POPUP);
		setUndecorated(true);
		setRootPaneCheckingEnabled(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(113, 285, 373, 385);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		JLabel lblNewLabel_4 = new JLabel("Astrazenica");
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(70, 59, 124, 27);
		contentPane.add(lblNewLabel_4);
		
		int ast = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 1stdose from records where 1stdose='Astrazenica'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	String snd = rs.getString("1stdose");
            	ast++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String az=String.valueOf(ast);
		
		JLabel lblNewLabel_1_3 = new JLabel(az);
		lblNewLabel_1_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(204, 59, 130, 27);
		contentPane.add(lblNewLabel_1_3);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(31, 59, 314, 27);
		contentPane.add(panel_1_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("Covaxin");
		lblNewLabel_4_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(70, 97, 124, 27);
		contentPane.add(lblNewLabel_4_1);

		int cox = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 1stdose from records where 1stdose='Covaxin'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	String snd = rs.getString("1stdose");
            	cox++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String coz=String.valueOf(cox);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(coz);
		lblNewLabel_1_3_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(204, 97, 130, 27);
		contentPane.add(lblNewLabel_1_3_1);
		
		
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBackground(Color.WHITE);
		panel_1_3_1.setBounds(31, 97, 314, 27);
		contentPane.add(panel_1_3_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Covishield");
		lblNewLabel_4_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(70, 135, 124, 27);
		contentPane.add(lblNewLabel_4_2);
		
		int cos = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 1stdose from records where 1stdose='Covishield'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	String snd = rs.getString("1stdose");
            	cos++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String covz=String.valueOf(cos);
		
		JLabel lblNewLabel_1_3_2 = new JLabel(covz);
		lblNewLabel_1_3_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_2.setBounds(204, 135, 130, 27);
		contentPane.add(lblNewLabel_1_3_2);
		
		
		JPanel panel_1_3_2 = new JPanel();
		panel_1_3_2.setBackground(Color.WHITE);
		panel_1_3_2.setBounds(31, 135, 314, 27);
		contentPane.add(panel_1_3_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Moderna");
		lblNewLabel_4_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(70, 173, 124, 27);
		contentPane.add(lblNewLabel_4_3);
		

		int mod = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 1stdose from records where 1stdose='Moderna'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	String snd = rs.getString("1stdose");
            	mod++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String modz=String.valueOf(mod);
		
		JLabel lblNewLabel_1_3_3 = new JLabel(modz);
		lblNewLabel_1_3_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_3.setBounds(204, 173, 130, 27);
		contentPane.add(lblNewLabel_1_3_3);
		
		JPanel panel_1_3_3 = new JPanel();
		panel_1_3_3.setBackground(Color.WHITE);
		panel_1_3_3.setBounds(31, 173, 314, 27);
		contentPane.add(panel_1_3_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Pfizer");
		lblNewLabel_4_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_4.setBounds(70, 211, 124, 27);
		contentPane.add(lblNewLabel_4_4);
		

		int pfi = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 1stdose from records where 1stdose='Pfizer'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	String snd = rs.getString("1stdose");
            	pfi++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String pfiz=String.valueOf(pfi);
		
		
		JLabel lblNewLabel_1_3_4 = new JLabel(pfiz);
		lblNewLabel_1_3_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_4.setBounds(204, 211, 130, 27);
		contentPane.add(lblNewLabel_1_3_4);
		
		JPanel panel_1_3_4 = new JPanel();
		panel_1_3_4.setBackground(Color.WHITE);
		panel_1_3_4.setBounds(31, 211, 314, 27);
		contentPane.add(panel_1_3_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Sinopharm");
		lblNewLabel_4_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_5.setBounds(70, 249, 124, 27);
		contentPane.add(lblNewLabel_4_5);
		

		int sin = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 1stdose from records where 1stdose='Sinopharm'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	String snd = rs.getString("1stdose");
            	sin++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String sinz=String.valueOf(sin);
		
		
		JLabel lblNewLabel_1_3_5 = new JLabel(sinz);
		lblNewLabel_1_3_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_3_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_5.setBounds(204, 249, 130, 27);
		contentPane.add(lblNewLabel_1_3_5);
		
		
		
		JPanel panel_1_3_5 = new JPanel();
		panel_1_3_5.setBackground(Color.WHITE);
		panel_1_3_5.setBounds(31, 249, 314, 27);
		contentPane.add(panel_1_3_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Sinovac");
		lblNewLabel_4_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_6.setBounds(70, 287, 124, 27);
		contentPane.add(lblNewLabel_4_6);
		

		int sio = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 1stdose from records where 1stdose='Sinovac'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	String snd = rs.getString("1stdose");
            	sio++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String sioz=String.valueOf(sio);
		
		JLabel lblNewLabel_1_3_6 = new JLabel(sioz);
		lblNewLabel_1_3_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_3_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_6.setBounds(204, 287, 130, 27);
		contentPane.add(lblNewLabel_1_3_6);
		
		
		
		JPanel panel_1_3_6 = new JPanel();
		panel_1_3_6.setBackground(Color.WHITE);
		panel_1_3_6.setBounds(31, 287, 314, 27);
		contentPane.add(panel_1_3_6);
		
		JLabel lblNewLabel_4_7 = new JLabel("Sputnic V");
		lblNewLabel_4_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_7.setBounds(70, 325, 124, 27);
		contentPane.add(lblNewLabel_4_7);
		

		int spu = 00;

		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select 1stdose from records where 1stdose='Sputnic V'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            	String snd = rs.getString("1stdose");
            	spu++;
            	
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		String spuz=String.valueOf(spu);
		
		JLabel lblNewLabel_1_3_7 = new JLabel(spuz);
		lblNewLabel_1_3_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_3_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_7.setBounds(204, 325, 130, 27);
		contentPane.add(lblNewLabel_1_3_7);
		
		JPanel panel_1_3_7 = new JPanel();
		panel_1_3_7.setBackground(Color.WHITE);
		panel_1_3_7.setBounds(31, 325, 314, 27);
		contentPane.add(panel_1_3_7);
		
		JLabel lblNewLabel_5 = new JLabel("VACINATIONS WITH");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(31, 11, 256, 37);
		contentPane.add(lblNewLabel_5);
		
		
		
		JButton exit = new JButton("X");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exit.setContentAreaFilled(false);
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.setBorder(null);
		exit.setDefaultCapable(false);
		exit.setOpaque(false);
		exit.setFocusable(false);
		exit.setFocusTraversalKeysEnabled(false);
		exit.setFocusPainted(false);
		exit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		exit.setForeground(new Color(255, 255, 255));
		exit.setRolloverEnabled(false);
		exit.setRequestFocusEnabled(false);
		exit.setBorderPainted(false);
		exit.setBounds(318, 0, 55, 56);
		contentPane.add(exit);
	}

}
