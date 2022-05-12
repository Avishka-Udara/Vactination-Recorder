package vacnar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.KeyEvent;
import java.awt.ComponentOrientation;

public class logout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logout frame = new logout();
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
	public logout() {
		setUndecorated(true);
		setRootPaneCheckingEnabled(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(480, 200, 451, 209);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JButton exit = new JButton("X");
		exit.setBackground(new Color(192, 192, 192));
		exit.setBounds(400, 0, 50, 29);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		exit.setContentAreaFilled(false);
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.setBorder(null);
		exit.setDefaultCapable(false);
		exit.setOpaque(false);
		exit.setFocusable(false);
		exit.setFocusTraversalKeysEnabled(false);
		exit.setFocusPainted(false);
		exit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		exit.setForeground(new Color(0, 0, 0));
		exit.setRolloverEnabled(false);
		exit.setRequestFocusEnabled(false);
		exit.setBorderPainted(false);
		contentPane.add(exit);
		
		JLabel lblNewLabel = new JLabel("ARE YOU SURE TO LOGOUT AND EXIT ?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(84, 69, 273, 29);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		panel_1.setBackground(UIManager.getColor("Button.background"));
		panel_1.setBounds(400, 0, 50, 29);
		contentPane.add(panel_1);
		
		JLabel lblLogout = new JLabel("LOGOUT");
		lblLogout.setForeground(new Color(0, 0, 0));
		lblLogout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogout.setBounds(21, 0, 207, 29);
		contentPane.add(lblLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 451, 29);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("NO");
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setVerifyInputWhenFocusTarget(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setBounds(84, 120, 108, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    dispose();
			}});
		
		contentPane.add(btnNewButton);
		
		JButton btnYes = new JButton("YES");
		btnYes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnYes.setFocusable(false);
		btnYes.setFocusPainted(false);
		btnYes.setMnemonic(KeyEvent.VK_ACCEPT);
		btnYes.setRolloverEnabled(false);
		btnYes.setRequestFocusEnabled(false);
		btnYes.setBorder(null);
		btnYes.setBounds(249, 120, 108, 37);
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    dispose();
                    Home hm = new Home();
                    hm.setVisible(false);
                    System.exit(0); //temporary added
                    Login obj = new Login();
                    obj.setTitle("Login Again");
                    obj.setVisible(true);
			}});
		contentPane.add(btnYes);
		
		
	}

}
