package vacnar;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;

public class Load extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Load frame = new Load();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		/* Create and display the form */
        Load load = new Load();
        load.setVisible(true);
        try
        {
            for(int i = 0; i < 100; i++)
            {
                Thread.sleep(25);
                
            }
            try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/vacdb", "root", "");
                    load.setVisible(false);
                    load.setOpacity(0.0f);
                    System.out.println("connected");
                    Login log = new Login();
                    log.setVisible(true); 
                    
                }
            
            catch(Exception e)
            {
                System.out.println(e);
                load.setVisible(false);
                db_error_popup_cant_load view = new db_error_popup_cant_load();
                view.setVisible(true);
        }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
	}

	
	/**
	 * Create the frame.
	 */
	public Load() {
		setAutoRequestFocus(false);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setUndecorated(true);
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 250, 634, 308);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel text = new JLabel("WELCOME TO");
		text.setFont(new Font("Tahoma", Font.PLAIN, 13));
		text.setBackground(new Color(0, 128, 128));
		text.setBounds(10, 241, 240, 16);
		contentPane.add(text);

		JLabel text_2 = new JLabel("VACNAR SYSTEM");
		text_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		text_2.setBackground(new Color(0, 128, 128));
		text_2.setBounds(10, 254, 240, 23);
		contentPane.add(text_2);
		
		JLabel text_1 = new JLabel("please wait.. we are loading the data..");
		text_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		text_1.setBackground(new Color(0, 128, 128));
		text_1.setBounds(10, 274, 240, 23);
		contentPane.add(text_1);
		
		
		
		JLabel loadlable = new JLabel("LOADING");
		loadlable.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		loadlable.setHorizontalAlignment(SwingConstants.RIGHT);
		loadlable.setHorizontalTextPosition(SwingConstants.LEFT);
		loadlable.setVerticalTextPosition(SwingConstants.TOP);
		loadlable.setVerticalAlignment(SwingConstants.TOP);
		loadlable.setBounds(5, 5, 624, 298);
		loadlable.setIcon(new ImageIcon("C:\\Users\\Avishka Udara\\Documents\\GitHub\\Vactination-Recorder\\src\\vacnar\\load.jpeg"));
		loadlable.setFont(new Font("Calibri Light", Font.BOLD, 15));
		contentPane.add(loadlable);
		
	};
}
