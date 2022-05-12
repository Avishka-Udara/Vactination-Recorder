package vacnar;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class About extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setUndecorated(true);
		setRootPaneCheckingEnabled(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 150, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		exit.setBounds(400, 0, 50, 29);
		contentPane.add(exit);
		
		JLabel lblNewLabel = new JLabel("VacnaR");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 23));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(22, 11, 152, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The Covid -19 vaccination record system is the is the most important");
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(22, 73, 404, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("software for clients  in the present  because covid 19 pandemic");
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(22, 98, 404, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JTextArea txtrOurMissionIs = new JTextArea();
		txtrOurMissionIs.setEditable(false);
		txtrOurMissionIs.setOpaque(false);
		txtrOurMissionIs.setRequestFocusEnabled(false);
		txtrOurMissionIs.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtrOurMissionIs.setText("Our mission is develop this system to provide a tamplate to\r\nclients to get all vaccination details without collision with each other.\r\nAs well as it will provide all the clients to get their vaccines \r\nin the scheduled time period .And also clients can see all vaccine types \r\ndetails from this system. \r\nWe developed this system as a team and we do this for our \r\nsecond year first semester OOP(Object Oriented Programming ) mini project .");
		txtrOurMissionIs.setForeground(new Color(255, 255, 255));
		txtrOurMissionIs.setBackground(new Color(95, 158, 160));
		txtrOurMissionIs.setToolTipText("");
		txtrOurMissionIs.setBounds(18, 141, 410, 148);
		contentPane.add(txtrOurMissionIs);
	}
}
