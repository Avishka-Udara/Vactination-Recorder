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
import java.awt.Dimension;

import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;

public class Login extends JFrame {
	
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
	private JTextField textField;
	private JPasswordField passwordField;

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
        label.setIcon(new ImageIcon("C:\\Users\\Avishka Udara\\Documents\\GitHub\\VAC\\src\\vacnar\\log.jpeg")); //Sets the image to be displayed as an icon
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
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setBounds(320, 247, 253, 38);btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String userName = textField.getText();
                @SuppressWarnings("deprecation")
				String password = passwordField.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

                    PreparedStatement st = (PreparedStatement) connection
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  if (JOptionPane.showConfirmDialog( contentPane,"confirm if you Want to Exit","VacNar Loging",
				            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				            System.exit(0);
			}
		});
		contentPane.add(btnNewButton_1);
	}
}
