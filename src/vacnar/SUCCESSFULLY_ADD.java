package vacnar;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

public class SUCCESSFULLY_ADD extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    SUCCESSFULLY_ADD frame = new SUCCESSFULLY_ADD();
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
    public SUCCESSFULLY_ADD() {
        setUndecorated(true);
        setAlwaysOnTop(true);
        setBackground(UIManager.getColor("activeCaption"));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 200, 644, 369);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        new JPanel();

        JButton btnNewButton = new JButton("Back to Home");
        btnNewButton.setFocusPainted(false);
        btnNewButton.setFocusCycleRoot(true);
        btnNewButton.setBorderPainted(false);
        btnNewButton.setForeground(Color.DARK_GRAY);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.setBackground(new Color(32, 178, 170));
        btnNewButton.setBounds(341, 222, 205, 38);btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                Home hm = new Home();
                hm.setTitle("Dashboard");
                hm.setVisible(true);
            }
        });
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("X");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_1.setFocusable(false);
        btnNewButton_1.setFocusTraversalKeysEnabled(false);
        btnNewButton_1.setFocusPainted(false);
        btnNewButton_1.setContentAreaFilled(false);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setBorder(null);
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setOpaque(false);
        btnNewButton_1.setRequestFocusEnabled(false);
        btnNewButton_1.setBounds(585, 0, 59, 38);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog( contentPane,"confirm if you Want to Exit","VacNar Loging",
                        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        contentPane.add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel("DATA ADDED SUCCESSFULLY");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(111, 99, 409, 48);
        contentPane.add(lblNewLabel);

        JButton btnBackToEdit = new JButton("ADD ANOTHER ? ");
        btnBackToEdit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                dispose();
                ADD_REC ar = new ADD_REC();
                ar.setTitle("ADD ANOTHER");
                ar.setVisible(true);
            }
        });
        btnBackToEdit.setForeground(Color.DARK_GRAY);
        btnBackToEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnBackToEdit.setFocusPainted(false);
        btnBackToEdit.setFocusCycleRoot(true);
        btnBackToEdit.setBorderPainted(false);
        btnBackToEdit.setBackground(new Color(32, 178, 170));
        btnBackToEdit.setBounds(86, 222, 205, 38);
        contentPane.add(btnBackToEdit);

        JLabel lblNewLabel_1 = new JLabel("How You Like to proceed with");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(111, 158, 409, 30);
        contentPane.add(lblNewLabel_1);

        Component horizontalStrut = Box.createHorizontalStrut(20);
        horizontalStrut.setBackground(new Color(255, 255, 255));
        horizontalStrut.setBounds(111, 128, 409, 1);
        contentPane.add(horizontalStrut);
    }
}
