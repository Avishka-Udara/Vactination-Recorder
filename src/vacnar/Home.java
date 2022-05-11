package vacnar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Frame;

public class Home extends JFrame {

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
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 1370, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton QBT = new JButton("?");
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
		QBT.setBounds(1193, 0, 58, 49);
		panel.add(QBT);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(1261, 0, 99, 49);
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
                    obj.setTitle("Login Again");
                    obj.setVisible(true);
                }
                //dispose();
                //Loging obj = new Loging();

                //obj.setTitle("Login again");
               // obj.setVisible(true);
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
                    dispose();
                    Home hm = new Home();
                    hm.setTitle("Dashboard");
                    hm.setVisible(true);
			}
		});
		panel.add(btnNewButton_2);
		
		
		
		JButton btnNewButton_1 = new JButton("Add Record");
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setBounds(414, 362, 121, 49);
		btnNewButton_1.setRolloverEnabled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ADD_REC vr = new ADD_REC();
                vr.setTitle("Add Record");
                vr.setVisible(true);

			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("View Record");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				View_Rec vr = new View_Rec();
                vr.setTitle("View Record");
                vr.setVisible(true);
			}
		});
		btnNewButton_1_1.setRolloverEnabled(false);
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1.setBounds(653, 362, 121, 49);
		contentPane.add(btnNewButton_1_1);
	}
}
