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
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import arackiralama.uyeolma;
import javax.swing.JPasswordField;

public class uyegirisi extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uyegirisi frame = new uyegirisi();
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
	public uyegirisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		
		JLabel lblRentACar = new JLabel("RENT  A  CAR");
		lblRentACar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRentACar.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblRentACar.setBounds(500, 150, 452, 71);
		contentPane.add(lblRentACar);
		
		JLabel lblYa = new JLabel("----------------------- YA DA -----------------------");
		lblYa.setBounds(285, 601, 224, 37);
		contentPane.add(lblYa);
		
		JLabel lblyeGirii = new JLabel("\u00DCYE G\u0130R\u0130\u015E\u0130");
		lblyeGirii.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblyeGirii.setHorizontalAlignment(SwingConstants.CENTER);
		lblyeGirii.setBounds(215, 305, 367, 71);
		contentPane.add(lblyeGirii);
		
		JButton button = new JButton("G\u0130R\u0130\u015E YAP");
		
		
		button.setBackground(new Color(153, 0, 51));
		button.setForeground(Color.WHITE);
		button.setBounds(285, 553, 224, 37);
		contentPane.add(button);
		
		JButton button2 = new JButton("\u00DCYE OL");
		
		
		button2.setBackground(new Color(153, 0, 51));
		button2.setForeground(Color.WHITE);
		button2.setBounds(285, 649, 224, 37);
		contentPane.add(button2);
		
		JLabel lblifre = new JLabel("\u015E\u0130FRE :");
		lblifre.setBackground(Color.BLACK);
		lblifre.setForeground(Color.BLACK);
		lblifre.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblifre.setBounds(177, 484, 105, 38);
		contentPane.add(lblifre);
		
		JLabel lblyeAd = new JLabel(" KULLANICI ADI :");
		lblyeAd.setBackground(Color.BLACK);
		lblyeAd.setForeground(Color.BLACK);
		lblyeAd.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblyeAd.setBounds(51, 421, 224, 25);
		contentPane.add(lblyeAd);
		
		JLabel logo = new JLabel("");
		
		logo.setIcon(new ImageIcon(imglogo));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(40, 17, 150, 141);
		contentPane.add(logo);
		
		
		
		
		
		JTextField ad = new JTextField();
		ad.setBounds(285, 421, 224, 37);
		contentPane.add(ad);
		ad.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(285, 486, 224, 37);
		contentPane.add(passwordField);
		
		JLabel arkaplan = new JLabel("");
		arkaplan.setIcon(new ImageIcon(imganasayfa));
		arkaplan.setHorizontalAlignment(SwingConstants.CENTER);
		arkaplan.setBounds(-311, -157, 1902,1020);
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
		
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				uyeolma uye = null;
				try {
					uye = new uyeolma();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				uye.setVisible(true);
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");

					Statement stmt=con.createStatement();
					String sql="Select * from uye_bilgileri where kullanýcýadi='"+ad.getText()+"' and sifre='"+passwordField.getText().toString()+"'";
					ResultSet rs= stmt.executeQuery(sql);
					if(rs.next()) {
					JOptionPane.showMessageDialog(null, "Hoþgeldiniz Sayýn   " + ad.getText() );
					proje prj = new proje();
					prj.setVisible(true);
					}
					else
					JOptionPane.showMessageDialog(null, "Kullanýcý adý veya þifre yanlýþ..");

					con.close();
					} catch(Exception e1) { System.out.println(e1);}
				 
				
				
				
			}
			
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(new Color(0, 0, 0) );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(new Color(153, 0, 51) );
			}
		});
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button2.setBackground(new Color(0, 0, 0) );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button2.setBackground(new Color(153, 0, 51) );
			}
		});
		
	}	
}