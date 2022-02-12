package arackiralama;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class yoneticigirisi extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yoneticigirisi frame = new yoneticigirisi();
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
	public yoneticigirisi() {
		setFont(new Font("Dialog", Font.BOLD, 33));
		setForeground(Color.BLACK);
		setTitle("RENT A CAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1290,790);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Image imglogo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		Image imglogo2 = new ImageIcon(this.getClass().getResource("/logo2.png")).getImage();
		
		
		Image imganasayfa = new ImageIcon(this.getClass().getResource("/anasayfa.png")).getImage();
		
		
		
		JLabel rentacar = new JLabel("RENT  A  CAR");
		rentacar.setHorizontalAlignment(SwingConstants.CENTER);
		rentacar.setFont(new Font("Tahoma", Font.BOLD, 60));
		rentacar.setBounds(500, 150, 452, 71);
		contentPane.add(rentacar);
		
		JLabel yöneticipanel = new JLabel("Y\u00D6NET\u0130C\u0130 PANEL\u0130");
		yöneticipanel.setFont(new Font("Tahoma", Font.BOLD, 25));
		yöneticipanel.setHorizontalAlignment(SwingConstants.CENTER);
		yöneticipanel.setBounds(215, 305, 367, 71);
		contentPane.add(yöneticipanel);
		
		JButton button = new JButton("G\u0130R\u0130\u015E YAP");
		
		
		button.setBackground(new Color(153, 0, 51));
		button.setForeground(Color.WHITE);
		button.setBounds(285, 553, 224, 37);
		contentPane.add(button);
		
		JLabel sifre = new JLabel("\u015E\u0130FRE :");
		sifre.setBackground(Color.BLACK);
		sifre.setForeground(Color.BLACK);
		sifre.setFont(new Font("Tahoma", Font.BOLD, 25));
		sifre.setBounds(177, 484, 105, 38);
		contentPane.add(sifre);
		
		JLabel ad = new JLabel(" KULLANICI ADI :");
		ad.setBackground(Color.BLACK);
		ad.setForeground(Color.BLACK);
		ad.setFont(new Font("Tahoma", Font.BOLD, 25));
		ad.setBounds(51, 421, 224, 25);
		contentPane.add(ad);
		
		
		
		JLabel logo = new JLabel("");
		
		logo.setIcon(new ImageIcon(imglogo));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(40, 17, 150, 141);
		contentPane.add(logo);
		
		JTextField admin = new JTextField();
		admin.setBounds(285, 421, 224, 28);
		contentPane.add(admin);
		admin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(285, 490, 224, 28);
		contentPane.add(passwordField);
		
		JLabel arkaplan = new JLabel("");
		arkaplan.setIcon(new ImageIcon(imganasayfa));
		arkaplan.setHorizontalAlignment(SwingConstants.CENTER);
		arkaplan.setBounds(0, -70, 1270,858);
		contentPane.add(arkaplan);
		
		logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				logo.setIcon(new ImageIcon(imglogo2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				logo.setIcon(new ImageIcon(imglogo));
			}
			
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");

					Statement stmt=con.createStatement();
					String sql="Select * from adminpaneli where admin='"+admin.getText()+"' and sifre='"+passwordField.getText().toString()+"'";
					ResultSet rs= stmt.executeQuery(sql);
					if(rs.next()) {
					JOptionPane.showMessageDialog(null, "SÝSTEME GÝRÝÞ YAPTINIZ " + "**" + admin.getText()+"**" + " BEY");
					yoneticipaneli ytn = new yoneticipaneli();
					ytn.setVisible(true);
					
					
					}
					else
					JOptionPane.showMessageDialog(null, "Kullanýcý adý veya þifre yanlýþ..");
					admin.setText("");
					passwordField.setText("");

					con.close();
					} catch(Exception e1) { System.out.println(e1);}
				 
				
				
				
				
			}
			
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setBackground(new Color(0, 0, 0) );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(new Color(153, 0, 51) );
			}
		});
		
	}	
}
