package vacnar;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Frame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.ComponentOrientation;
import java.awt.Rectangle;

public class View_Rec extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Rec frame = new View_Rec();
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
	public View_Rec() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 750);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 1400, 718);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1370, 49);
		panel_1.setVerifyInputWhenFocusTarget(false);
		panel_1.setBackground(new Color(0, 128, 128));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("VacnaR");
		btnNewButton_2.setRolloverEnabled(false);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(0, 128, 128));
		btnNewButton_2.setBounds(0, 0, 114, 49);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    dispose();
                    Home hm = new Home();
                    hm.setTitle("Dashboard");
                    hm.setVisible(true);
			}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Add Record");
		btnNewButton_1_1.setRolloverEnabled(false);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ADD_REC vr = new ADD_REC();
                vr.setTitle("Add Record");
                vr.setVisible(true);
			}
		});
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1.setBounds(1122, 0, 114, 49);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setFocusable(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(1246, 0, 104, 49);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logout obj = new logout();
                obj.setVisible(true);
			}
		});
		panel_1.add(btnNewButton);
		
		// frame
	    //JFrame f;
	    // Table
	    JTable j;
	 
	    // Constructor
	 
	        // Frame initialization
	        //f = new JFrame();
	 
	        // Frame Title
	        //f.setTitle("JTable Example");
	 
	        // Data to be displayed in the JTable
	        String[][] data = new String[100][18];

	 
	        // Column Names
	        String[] columnNames = {"NO", "Name", "address", "DOB" , "NIC", "gender", "District", "MOH", "Serial", "1stdose", "1ddate", "1dbatch", "2nddose", "2ddate", "2dbatch", "3rddose", "3ddate", "3dbatch" };
	 
	        
	    
		
		try {
            Connection connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb","root", "");

            PreparedStatement st = (PreparedStatement) connection1.prepareStatement("Select * from records");
            ResultSet rs = st.executeQuery();
            int x = 0;
            while (rs.next()) {
            	
            	String NO = rs.getString("NO");
    			System.out.println(NO);
    			data[x][0] = NO;
    			
    			String Name = rs.getString("Name");
    			System.out.println(Name);
    			data[x][1] = Name;
    			
    			String address = rs.getString("address");
    			System.out.println(address);
    			data[x][2] = address;
    			
    			String DOB = rs.getString("DOB");
    			System.out.println(DOB);
    			data[x][3] = DOB;
    			
    			String NIC = rs.getString("NIC");
    			System.out.println(NIC);
    			data[x][4] = NIC;
    			
    			String gender = rs.getString("gender");
    			System.out.println(gender);
    			data[x][5] = gender;
    			
    			String District = rs.getString("District");
    			System.out.println(District);
    			data[x][6] = District;
    			
    			String MOH = rs.getString("MOH");
    			System.out.println(MOH);
    			data[x][7] = MOH;
    			
    			String Serial = rs.getString("Serial");
    			System.out.println(Serial);
    			data[x][8] = Serial;
    			
    			String fstdose = rs.getString("1stdose");
    			System.out.println(fstdose);
    			data[x][9] = fstdose;
    			
    			String fddate = rs.getString("1ddate");
    			System.out.println(fddate);
    			data[x][10] = fddate;
    			
    			String fdbatch = rs.getString("1dbatch");
    			System.out.println(fdbatch);
    			data[x][11] = fdbatch;
    			
    			String snddose = rs.getString("2nddose");
    			System.out.println(snddose);
    			data[x][12] = snddose;
    			
    			String sddate = rs.getString("2ddate");
    			System.out.println(sddate);
    			data[x][13] = sddate;
    			
    			String sdbatch = rs.getString("2dbatch");
    			System.out.println(sdbatch);
    			data[x][14] = sdbatch;
    			
    			String trddose = rs.getString("3rddose");
    			System.out.println(trddose);
    			data[x][15] = trddose;
    			
    			String tddate = rs.getString("3ddate");
    			System.out.println(tddate);
    			data[x][16] = tddate;
    			
    			String tdbatch = rs.getString("3dbatch");
    			System.out.println(tdbatch);
    			data[x][17] = tdbatch;
    			
    			x++;
                // lblNewLabel_2 = new JLabel(Name);
  
				//lblNewLabel_2.setBounds(43, height, 127, 33);
				//panel.add(lblNewLabel_2);
        		
        		//JLabel lblNewLabel_3 = new JLabel(Name);
        		//lblNewLabel_3.setBounds(180, height, 127, 33);
        		//panel.add(lblNewLabel_3);	  
        		
        		//height = height+45;
          } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
		
		JPanel panel_2 = new JPanel();
        panel_2.setBounds(34, 77, 1279, 603);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
		// Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(5, 100, 1300, 603);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        sp.setBounds(new Rectangle(1, 1, 20, 10));
        sp.setAutoscrolls(true);
        sp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        sp.setBounds(0, 0, 1279, 603);
        panel_2.add(sp);
        
        
        // Frame Size
        //panel.setSize(500, 200);
				
		}
	}


