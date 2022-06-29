package vacnar;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;

public class Login extends JFrame {
	
	@Serial
	private static final long serialVersionUID = 1L;
    private final JPanel contentPane;
    
	private final JTextField textField;
	private final JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {

				Login frame = new Login();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setUndecorated(true);
		setAlwaysOnTop(true);
		setBackground(UIManager.getColor("activeCaption"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 655, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 282, 378);
		contentPane.add(panel);
		panel.setLayout(null);
		
		new JPanel();
        JLabel label = new JLabel();
        label.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        label.setDisplayedMnemonic(KeyEvent.VK_BEGIN);
        label.setIcon(new ImageIcon("C:\\Users\\Avishka Udara\\Documents\\GitHub\\Vactination-Recorder\\src\\vacnar\\log.jpeg")); //Sets the image to be displayed as an icon
        label.getPreferredSize();
        //label.setBounds(50, 30, size.width, size.height); //Sets the location of the image
        label.setBounds(0, 0, 282, 378);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(320, 119, 253, 27);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("User name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(320, 87, 75, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(320, 157, 68, 21);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(320, 186, 255, 27);
		contentPane.add(passwordField);

		JLabel lblNewLabel_3 = new JLabel("If you dont have a username and password.?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(320, 290, 300, 11);
		contentPane.add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("please contact the owner");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(320, 300, 300, 11);
		contentPane.add(lblNewLabel_4);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setBounds(320, 247, 253, 38);btnNewButton.addActionListener(e -> {
			String userName = textField.getText();
			@SuppressWarnings("deprecation")
			String password = passwordField.getText();
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

				PreparedStatement st = connection
					.prepareStatement("Select uname, password from usr where uname=? and password=?");

				st.setString(1, userName);
				st.setString(2, password);
				ResultSet rs = st.executeQuery();
				if (rs.next()) {
					dispose();
					Home ah = new Home();
					ah.setTitle("Welcome");
					ah.setVisible(true);
					JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
				}
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(new Color(0, 128, 128));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setRequestFocusEnabled(false);
		btnNewButton_1.setBounds(610, 0, 45, 23);
		btnNewButton_1.addActionListener(e -> {
			  if (JOptionPane.showConfirmDialog( contentPane,"confirm if you Want to Exit","VacNar Loging",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
						System.exit(0);
		});
		contentPane.add(btnNewButton_1);
	}
}
