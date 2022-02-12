package arackiralama;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import arackiralama.uyegirisi;
import arackiralama.uyeolma;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class proje extends JFrame {

	private JPanel contentPane;
	
	private JTable table;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object [] kolonlar = {"�D", "MARKA", "MODEL", "PLAKA", "�ANZUMAN", "YIL", "YAKIT" , "F�YAT" };
	Object [] satirlar = new Object[8];
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proje frame = new proje();
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
	public proje() {
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ASUS\\Desktop\\PROJE \u00D6DEV\u0130\\BMW.png"));
				setFont(new Font("Dialog", Font.BOLD, 33));
				setForeground(Color.BLACK);
				setTitle("RENT A CAR");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(0, 0, 1290,790);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				
				
				Image imganasayfa = new ImageIcon(this.getClass().getResource("/anasayfa.png")).getImage();
				
				Image imgbmw = new ImageIcon(this.getClass().getResource("/BMW.png")).getImage();
				Image imgbmw2 = new ImageIcon(this.getClass().getResource("/BMW2.png")).getImage();
				
				Image imgmercedes = new ImageIcon(this.getClass().getResource("/MERCEDES.png")).getImage();
				Image imgmercedes2 = new ImageIcon(this.getClass().getResource("/MERCEDES2.png")).getImage();
				
				Image imgporche = new ImageIcon(this.getClass().getResource("/PORCHE.png")).getImage();
				Image imgporche2 = new ImageIcon(this.getClass().getResource("/PORCHE2.png")).getImage();
				
				Image imgaudi1 = new ImageIcon(this.getClass().getResource("/AUD�1.png")).getImage();
				Image imgaudi2 = new ImageIcon(this.getClass().getResource("/AUD�2.png")).getImage();
				
				
				
				Image imgfiat = new ImageIcon(this.getClass().getResource("/fiat.png")).getImage();
				Image imgfiat2 = new ImageIcon(this.getClass().getResource("/fiat2.png")).getImage();
				
				Image imgreno = new ImageIcon(this.getClass().getResource("/reno.png")).getImage();
				Image imgreno2 = new ImageIcon(this.getClass().getResource("/reno2.png")).getImage();
				
				Image imgseat = new ImageIcon(this.getClass().getResource("/seat.png")).getImage();
				Image imgseat2 = new ImageIcon(this.getClass().getResource("/seat2.png")).getImage();
				
				
				Image imgskoda = new ImageIcon(this.getClass().getResource("/skoda.png")).getImage();
				Image imgskoda2 = new ImageIcon(this.getClass().getResource("/skoda2.png")).getImage();
				
				Image imgfacebook = new ImageIcon(this.getClass().getResource("/facebook.png")).getImage();
				Image imgfacebook2 = new ImageIcon(this.getClass().getResource("/facebook2.png")).getImage();
				
				Image imginsta = new ImageIcon(this.getClass().getResource("/insta.png")).getImage();
				Image imginsta2 = new ImageIcon(this.getClass().getResource("/insta2.png")).getImage();
				
				Image imgyoutube = new ImageIcon(this.getClass().getResource("/youtub.png")).getImage();
				Image imgyoutube2 = new ImageIcon(this.getClass().getResource("/youtub2.png")).getImage();
				
				Image imglogo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
				Image imglogo2 = new ImageIcon(this.getClass().getResource("/logo2.png")).getImage();
				
				Image imgwf = new ImageIcon(this.getClass().getResource("/w.png")).getImage();
				Image imgwf2 = new ImageIcon(this.getClass().getResource("/w2.png")).getImage();
				
				
				Image imgmodel1 = new ImageIcon(this.getClass().getResource("/model1.png")).getImage();
				Image imgmodel2 = new ImageIcon(this.getClass().getResource("/model2.png")).getImage();
				
				Image imgmodel3 = new ImageIcon(this.getClass().getResource("/model3.png")).getImage();
				Image imgmodel4 = new ImageIcon(this.getClass().getResource("/model4.png")).getImage();
				
				Image imgmodel5 = new ImageIcon(this.getClass().getResource("/model5.png")).getImage();
				Image imgmodel6 = new ImageIcon(this.getClass().getResource("/model6.png")).getImage();
				
				Image imgmodel7 = new ImageIcon(this.getClass().getResource("/model7.png")).getImage();
				Image imgmodel8 = new ImageIcon(this.getClass().getResource("/model8.png")).getImage();
				
				Image imgmodel9 = new ImageIcon(this.getClass().getResource("/model9.png")).getImage();
				Image imgmodel10 = new ImageIcon(this.getClass().getResource("/model10.png")).getImage();
				
				
				Image imgmodel11 = new ImageIcon(this.getClass().getResource("/model11.png")).getImage();
				Image imgmodel12 = new ImageIcon(this.getClass().getResource("/model12.png")).getImage();
				
				Image imgmodel13 = new ImageIcon(this.getClass().getResource("/model13.png")).getImage();
				Image imgmodel14 = new ImageIcon(this.getClass().getResource("/model14.png")).getImage();
				
				Image imgmodel15 = new ImageIcon(this.getClass().getResource("/model15.png")).getImage();
				Image imgmodel16 = new ImageIcon(this.getClass().getResource("/model16.png")).getImage();
				
				Image imgmodel17 = new ImageIcon(this.getClass().getResource("/model17.png")).getImage();
				Image imgmodel18 = new ImageIcon(this.getClass().getResource("/model18.png")).getImage();
				
				
				
				
				Image imgbo�bmw = new ImageIcon(this.getClass().getResource("/bo�bmw.png")).getImage();
				
				Image imgbo�porche = new ImageIcon(this.getClass().getResource("/bo�porche.png")).getImage();
				
				Image imgbo�mercedes = new ImageIcon(this.getClass().getResource("/bo�mercedes.png")).getImage();
				
				Image imgbo�audi = new ImageIcon(this.getClass().getResource("/bo�audi.png")).getImage();
				
				Image imgbo�fiat = new ImageIcon(this.getClass().getResource("/bo�fiat.png")).getImage();
				
				Image imgbo�renault = new ImageIcon(this.getClass().getResource("/bo�renault.png")).getImage();
				
				Image imgbo�seat = new ImageIcon(this.getClass().getResource("/bo�seat.png")).getImage();
				
				Image imgbo�skoda = new ImageIcon(this.getClass().getResource("/bo�skoda.png")).getImage();
				
				Image imgbo�volkswagen = new ImageIcon(this.getClass().getResource("/bo�volkswagen.png")).getImage();
				
				
				
				
				
				Image imgarkaplan = new ImageIcon(this.getClass().getResource("/arkaplan.png")).getImage();
				Image imgarkaplan2 = new ImageIcon(this.getClass().getResource("/arkaplan2.png")).getImage();
				
				
				Image imgtoureg = new ImageIcon(this.getClass().getResource("/toureg.png")).getImage();
				Image imgarteon = new ImageIcon(this.getClass().getResource("/arteon.png")).getImage();
				
				Image imga5 = new ImageIcon(this.getClass().getResource("/a5.png")).getImage();
				Image imgq8 = new ImageIcon(this.getClass().getResource("/q8.png")).getImage();
				
				Image imgf30 = new ImageIcon(this.getClass().getResource("/f30.png")).getImage();
				Image imgx5 = new ImageIcon(this.getClass().getResource("/x5.png")).getImage();
				
				Image imgcayman = new ImageIcon(this.getClass().getResource("/cayman.png")).getImage();
				Image imgpanemera = new ImageIcon(this.getClass().getResource("/panemera.png")).getImage();
				
				Image imgg500 = new ImageIcon(this.getClass().getResource("/g500.png")).getImage();
			    Image imgc200 = new ImageIcon(this.getClass().getResource("/c200.png")).getImage();
				
				Image imgtal�sman = new ImageIcon(this.getClass().getResource("/tal�sman.png")).getImage();
				Image imgegea = new ImageIcon(this.getClass().getResource("/egea.png")).getImage();
				
				Image imgleon = new ImageIcon(this.getClass().getResource("/leon.png")).getImage();
				Image imgateca = new ImageIcon(this.getClass().getResource("/ateca.png")).getImage();
				
				Image imgdoblo = new ImageIcon(this.getClass().getResource("/doblo.png")).getImage();
				Image imgkadjar = new ImageIcon(this.getClass().getResource("/kadjar.png")).getImage();
				
				Image imgoctav�a = new ImageIcon(this.getClass().getResource("/octav�a.png")).getImage();
				Image imgkod�ak = new ImageIcon(this.getClass().getResource("/kod�ak.png")).getImage();
				
				JButton btnNewButton_1 = new JButton("ARA\u00C7 K\u0130RALA");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						araclar�kirala kira = new araclar�kirala();
						kira.setVisible(true);
					}
				});
				btnNewButton_1.setBackground(new Color(128, 0, 0));
				btnNewButton_1.setForeground(Color.WHITE);
				btnNewButton_1.setBounds(824, 616, 142, 31);
				contentPane.add(btnNewButton_1);
				
				
				
				JLabel lblNewLabel_8 = new JLabel("");
				
				lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
				
				lblNewLabel_8.setBounds(505, 248, 461, 306);
				contentPane.add(lblNewLabel_8);
				
				JLabel lblOk = new JLabel(".");
				lblOk.setForeground(Color.BLACK);
				lblOk.setFont(new Font("Tahoma", Font.BOLD, 50));
				lblOk.setHorizontalAlignment(SwingConstants.CENTER);
				lblOk.setBounds(550, 650, 100, 100);
				contentPane.add(lblOk);
				
				JLabel label = new JLabel(".");
				label.setForeground(Color.BLACK);
				
				label.setFont(new Font("Tahoma", Font.BOLD, 50));
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setBounds(600, 650, 100, 100);
				contentPane.add(label);
				
				JLabel lblModel = new JLabel("");
				
				
				lblModel.setHorizontalAlignment(SwingConstants.CENTER);
				lblModel.setBounds(10, 283, 430, 201);
				contentPane.add(lblModel);
				
				JLabel lblModel_1 = new JLabel("");
				lblModel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblModel_1.setBounds(477, 244, 578, 277);
				contentPane.add(lblModel_1);
				
				JLabel lblNewLabel_6 = new JLabel("");
				
				lblNewLabel_6.setIcon(new ImageIcon(imglogo));
				lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6.setBounds(0, 0, 150, 141);
				contentPane.add(lblNewLabel_6);
				
				
				
				JLabel lblNewLabel_5 = new JLabel("");
				
				lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_5.setIcon(new ImageIcon(imgfacebook2));
				lblNewLabel_5.setBounds(1070, 670, 100, 100);
				contentPane.add(lblNewLabel_5);
				
				
				JLabel lblNewLabel_7 = new JLabel("");
				
				lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
				
				
				lblNewLabel_7.setIcon(new ImageIcon(imgwf));
				
				lblNewLabel_7.setBounds(900, 100, 160, 160);
				contentPane.add(lblNewLabel_7);
				
				JLabel lblInsata = new JLabel("");
				lblInsata.setHorizontalAlignment(SwingConstants.CENTER);
				
				
				lblInsata.setBounds(1130, 670, 100, 100);
				contentPane.add(lblInsata);
				lblInsata.setIcon(new ImageIcon(imginsta2));
				
				JLabel lblYoutube = new JLabel("");
				lblYoutube.setHorizontalAlignment(SwingConstants.CENTER);
				
				
			
				lblYoutube.setIcon(new ImageIcon(imgyoutube2));
				lblYoutube.setBounds(1190, 670, 100, 100);
				contentPane.add(lblYoutube);
				
				
				
				JLabel b2 = new JLabel("");
				
				b2.setIcon(new ImageIcon(imgbmw));
				b2.setHorizontalAlignment(SwingConstants.CENTER);
				b2.setBounds(100, 100, 160, 160);
				contentPane.add(b2);
				
				JLabel yaz� = new JLabel("");
				
				yaz�.setIcon(new ImageIcon(imgporche));
				yaz�.setHorizontalAlignment(SwingConstants.CENTER);
				yaz�.setBounds(200, 100, 160, 160);
				contentPane.add(yaz�);
				
				JLabel b1 = new JLabel("");
				
				b1.setIcon(new ImageIcon(imgmercedes));
				b1.setHorizontalAlignment(SwingConstants.CENTER);
				b1.setBounds(300, 100, 160, 160);
				contentPane.add(b1);
				
				JButton btnOturumA = new JButton("OTURUM A\u00C7");
				btnOturumA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				
				btnOturumA.setForeground(Color.WHITE);
				btnOturumA.setBackground(new Color(128, 0, 0));
				btnOturumA.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnOturumA.setBounds(1008, 30, 128, 46);
				contentPane.add(btnOturumA);
				
				JButton btnNewButton = new JButton("KAYDOL");
				
				
				btnNewButton.setBackground(new Color(128, 0, 0));
				btnNewButton.setForeground(Color.WHITE);
				btnNewButton.setBounds(1146, 30, 89, 46);
				contentPane.add(btnNewButton);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				
				lblNewLabel.setIcon(new ImageIcon(imgaudi2));
				lblNewLabel.setBounds(400,100, 160, 160);
				contentPane.add(lblNewLabel);
				
				JLabel lblFiat = new JLabel();
				lblFiat.setHorizontalAlignment(SwingConstants.CENTER);
				
				lblFiat.setIcon(new ImageIcon(imgfiat));
				lblFiat.setBounds(500,100, 160, 160);
				contentPane.add(lblFiat);
				
				JLabel lblNewLabel_3 = new JLabel();
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				
				lblNewLabel_3.setIcon(new ImageIcon(imgreno));
				lblNewLabel_3.setBounds(600,100, 160, 160);
				contentPane.add(lblNewLabel_3);
				
				JLabel lblNewLabel_2 = new JLabel();
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
				
				lblNewLabel_2.setIcon(new ImageIcon(imgseat));
				lblNewLabel_2.setBounds(700, 100, 160, 160);
				contentPane.add(lblNewLabel_2);
				
				JLabel lblNewLabel_4 = new JLabel("");
				
				lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_4.setIcon(new ImageIcon(imgskoda2));
				lblNewLabel_4.setBounds(800, 100, 160, 160);
				contentPane.add(lblNewLabel_4);
				
		        JLabel bmw2 = new JLabel("");
				
				
				bmw2.setHorizontalAlignment(SwingConstants.CENTER);
				
				bmw2.setBounds(572, 335, 781, 383);
				contentPane.add(bmw2);
				
				
				
				JLabel bmw = new JLabel("");
				
				
				bmw.setHorizontalAlignment(SwingConstants.CENTER);
				bmw.setBounds(119, 428, 508, 219);
				contentPane.add(bmw);
				
		        JLabel porche = new JLabel("");
				
				porche.setHorizontalAlignment(SwingConstants.CENTER);
				porche.setBounds(119, 428, 508, 219);
				contentPane.add(porche);
				
				JLabel porche2 = new JLabel("");
				
				porche2.setHorizontalAlignment(SwingConstants.CENTER);
				porche2.setBounds(572, 335, 781, 383);
				contentPane.add(porche2);
				
				JLabel mercedes2 = new JLabel("");
				
				mercedes2.setHorizontalAlignment(SwingConstants.CENTER);
				mercedes2.setBounds(572, 335, 781, 383);
				contentPane.add(mercedes2);
				
				JLabel mercedes = new JLabel("");
				
				mercedes.setHorizontalAlignment(SwingConstants.CENTER);
				mercedes.setBounds(119, 428, 508, 219);
				contentPane.add(mercedes);
				
				JLabel aud� = new JLabel("");
				
				aud�.setHorizontalAlignment(SwingConstants.CENTER);
				aud�.setBounds(119, 428, 508, 219);
				contentPane.add(aud�);
				
				JLabel aud�2 = new JLabel("");
				aud�2.setHorizontalAlignment(SwingConstants.CENTER);
				aud�2.setBounds(572, 335, 781, 383);
				contentPane.add(aud�2);
				
				JLabel f�at = new JLabel("");
				
				f�at.setHorizontalAlignment(SwingConstants.CENTER);
				f�at.setBounds(119, 428, 508, 219);
				contentPane.add(f�at);
				
				JLabel f�at2 = new JLabel("");
				f�at2.setHorizontalAlignment(SwingConstants.CENTER);
				f�at2.setBounds(572, 335, 781, 383);
				contentPane.add(f�at2);
				
				JLabel reno = new JLabel("");
				reno.setHorizontalAlignment(SwingConstants.CENTER);
				reno.setBounds(119, 428, 508, 219);
				contentPane.add(reno);
				
				JLabel reno2 = new JLabel("");
				reno2.setHorizontalAlignment(SwingConstants.CENTER);
				reno2.setBounds(572, 335, 781, 383);
				contentPane.add(reno2);
				
				JLabel seat2 = new JLabel("");
				seat2.setHorizontalAlignment(SwingConstants.CENTER);
				seat2.setBounds(572, 335, 781, 383);
				contentPane.add(seat2);
				
				JLabel seat = new JLabel("");
				seat.setHorizontalAlignment(SwingConstants.CENTER);
				seat.setBounds(119, 428, 508, 219);
				contentPane.add(seat);
				
				JLabel skoda = new JLabel("");
				skoda.setHorizontalAlignment(SwingConstants.CENTER);
				skoda.setBounds(119, 428, 508, 219);
				contentPane.add(skoda);
				
				JLabel skoda2 = new JLabel("");
				skoda2.setHorizontalAlignment(SwingConstants.CENTER);
				skoda2.setBounds(572, 335, 781, 383);
				contentPane.add(skoda2);
				
				JLabel w = new JLabel("");
				w.setHorizontalAlignment(SwingConstants.CENTER);
				w.setBounds(119, 428, 508, 219);
				contentPane.add(w);
				
				JLabel w2 = new JLabel("");
				
				
				w2.setHorizontalAlignment(SwingConstants.CENTER);
				w2.setBounds(572, 335, 781, 383);
				contentPane.add(w2);
				
				
				
				
				
				JLabel lblFgd = new JLabel("fgd");
				lblFgd.setBounds(16, 169, 46, 14);
				contentPane.add(lblFgd);
				lblFgd.setIcon(new ImageIcon(imgfiat));
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(imganasayfa));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setBounds(-39, -156, 1355,1024);
				contentPane.add(lblNewLabel_1);
				
				JTextField txtBmw = new JTextField();
				txtBmw.setForeground(Color.WHITE);
				txtBmw.setBackground(Color.BLACK);
				txtBmw.setHorizontalAlignment(SwingConstants.CENTER);
				txtBmw.setText("BMW");
				txtBmw.setBounds(140, 224, 86, 20);
				contentPane.add(txtBmw);
				txtBmw.setColumns(10);
				
				JTextField txtporche = new JTextField();
				txtporche.setText("PORCHE");
				txtporche.setHorizontalAlignment(SwingConstants.CENTER);
				txtporche.setForeground(Color.WHITE);
				txtporche.setColumns(10);
				txtporche.setBackground(Color.BLACK);
				txtporche.setBounds(236, 224, 86, 20);
				contentPane.add(txtporche);
				
				JTextField txtmercedes = new JTextField();
				txtmercedes.setText("MERCEDES");
				txtmercedes.setHorizontalAlignment(SwingConstants.CENTER);
				txtmercedes.setForeground(Color.WHITE);
				txtmercedes.setColumns(10);
				txtmercedes.setBackground(Color.BLACK);
				txtmercedes.setBounds(342, 224, 86, 20);
				contentPane.add(txtmercedes);
				
				JTextField txtaudi = new JTextField();
				txtaudi.setText("AUD\u0130");
				txtaudi.setHorizontalAlignment(SwingConstants.CENTER);
				txtaudi.setForeground(Color.WHITE);
				txtaudi.setColumns(10);
				txtaudi.setBackground(Color.BLACK);
				txtaudi.setBounds(438, 224, 86, 20);
				contentPane.add(txtaudi);
				
				JTextField txtfiat = new JTextField();
				txtfiat.setText("F\u0130AT");
				txtfiat.setHorizontalAlignment(SwingConstants.CENTER);
				txtfiat.setForeground(Color.WHITE);
				txtfiat.setColumns(10);
				txtfiat.setBackground(Color.BLACK);
				txtfiat.setBounds(541, 224, 86, 20);
				contentPane.add(txtfiat);
				
				JTextField txtreno = new JTextField();
				txtreno.setText("RENAULT");
				txtreno.setHorizontalAlignment(SwingConstants.CENTER);
				txtreno.setForeground(Color.WHITE);
				txtreno.setColumns(10);
				txtreno.setBackground(Color.BLACK);
				txtreno.setBounds(642, 224, 86, 20);
				contentPane.add(txtreno);
				
				JTextField txtseat = new JTextField();
				txtseat.setText("SEAT");
				txtseat.setHorizontalAlignment(SwingConstants.CENTER);
				txtseat.setForeground(Color.WHITE);
				txtseat.setColumns(10);
				txtseat.setBackground(Color.BLACK);
				txtseat.setBounds(738, 224, 86, 20);
				contentPane.add(txtseat);
				
				JTextField txtskoda = new JTextField();
				txtskoda.setText("SKODA");
				txtskoda.setHorizontalAlignment(SwingConstants.CENTER);
				txtskoda.setForeground(Color.WHITE);
				txtskoda.setColumns(10);
				txtskoda.setBackground(Color.BLACK);
				txtskoda.setBounds(840, 224, 86, 20);
				contentPane.add(txtskoda);
				
				JTextField txtvolkswogen = new JTextField();
				txtvolkswogen.setText("BMW");
				txtvolkswogen.setHorizontalAlignment(SwingConstants.CENTER);
				txtvolkswogen.setForeground(Color.WHITE);
				txtvolkswogen.setColumns(10);
				txtvolkswogen.setBackground(Color.BLACK);
				txtvolkswogen.setBounds(936, 224, 93, 20);
				contentPane.add(txtvolkswogen);
				
				table_2 = new JTable();
				table_2.setBounds(119, 709, 657, 20);
				contentPane.add(table_2);
				
				btnNewButton_1.setVisible(false);
				
				b2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						b2.setIcon(new ImageIcon(imgbmw2));
						txtBmw.setText("BMW");
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						b2.setIcon(new ImageIcon(imgbmw));
						
					}
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(true);
						bmw2.setVisible(true);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						
						btnNewButton_1.setVisible(false);
						
						bmw.setIcon(new ImageIcon(imgmodel1));
						bmw2.setIcon(new ImageIcon(imgmodel2));
						
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�bmw));
						
					}
				});
				
				yaz�.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						yaz�.setIcon(new ImageIcon(imgporche2));
						txtporche.setText("PORCHE");

						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						yaz�.setIcon(new ImageIcon(imgporche));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						bmw.setVisible(false);
						bmw2.setVisible(false);
						porche.setVisible(true);
						porche2.setVisible(true);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(false);
						
						porche2.setIcon(new ImageIcon(imgmodel4));
						porche.setIcon(new ImageIcon(imgmodel5));
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�porche));
					}
				});
				
				b1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						b1.setIcon(new ImageIcon(imgmercedes2));
						txtmercedes.setText("MERCEDES");
					}
					@Override
					public void mouseExited(MouseEvent e) {
						b1.setIcon(new ImageIcon(imgmercedes));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						bmw.setVisible(false);
						bmw2.setVisible(false);
						porche.setVisible(false);
						porche2.setVisible(false);
						mercedes.setVisible(true);
						mercedes2.setVisible(true);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(false);
						
						mercedes2.setIcon(new ImageIcon(imgmodel6));
						mercedes.setIcon(new ImageIcon(imgmodel3));
						
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�mercedes));
					}
					
				});
				
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel.setIcon(new ImageIcon(imgaudi1));
						txtaudi.setText("AUD�");
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblNewLabel.setIcon(new ImageIcon(imgaudi2));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						bmw.setVisible(false);
						bmw2.setVisible(false);
						porche.setVisible(false);
						porche2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						aud�.setVisible(true);
						aud�2.setVisible(true);
						
						btnNewButton_1.setVisible(false);
						
						aud�.setIcon(new ImageIcon(imgmodel7));
						aud�2.setIcon(new ImageIcon(imgmodel8));
						
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�audi));
					}
				});
				lblFiat.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblFiat.setIcon(new ImageIcon(imgfiat2));
						txtfiat.setText("F�AT");
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblFiat.setIcon(new ImageIcon(imgfiat));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						f�at.setVisible(true);
						f�at2.setVisible(true);
						
						btnNewButton_1.setVisible(false);
						
						f�at.setIcon(new ImageIcon(imgmodel9));
						f�at2.setIcon(new ImageIcon(imgmodel10));
						
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�fiat));
					}
				});
				lblNewLabel_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel_3.setIcon(new ImageIcon(imgreno2));
						txtreno.setText("RENAULT");
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblNewLabel_3.setIcon(new ImageIcon(imgreno));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						reno.setVisible(true);
						reno2.setVisible(true);
						
						btnNewButton_1.setVisible(false);
						
		                 reno.setIcon(new ImageIcon(imgmodel11));
		                 reno2.setIcon(new ImageIcon(imgmodel12));
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�renault));
					}
				});
				lblNewLabel_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel_2.setIcon(new ImageIcon(imgseat2));
						txtseat.setText("SEAT");
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblNewLabel_2.setIcon(new ImageIcon(imgseat));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						bmw.setVisible(false);
						bmw2.setVisible(false);
						porche.setVisible(false);
						porche2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						seat.setVisible(true);
						seat2.setVisible(true);
						
						btnNewButton_1.setVisible(false);
						
						seat2.setIcon(new ImageIcon(imgmodel14));
						seat.setIcon(new ImageIcon(imgmodel13));
						
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�seat));
					}
				});
				lblInsata.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblInsata.setIcon(new ImageIcon(imginsta));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblInsata.setIcon(new ImageIcon(imginsta2));
					}
				});
				lblYoutube.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblYoutube.setIcon(new ImageIcon(imgyoutube));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblYoutube.setIcon(new ImageIcon(imgyoutube2));
					}
				});
				lblNewLabel_6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel_6.setIcon(new ImageIcon(imglogo2));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblNewLabel_6.setIcon(new ImageIcon(imglogo));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						btnNewButton_1.setVisible(false);
						
						
						bmw.setDisabledIcon(new ImageIcon(imgmodel1));
						lblModel_1.setDisabledIcon(new ImageIcon(imgmodel6));
						lblNewLabel_1.setIcon(new ImageIcon(imganasayfa));
						bmw2.setIcon(new ImageIcon());
						bmw.setIcon(new ImageIcon());
						
					}
				});
				
				lblNewLabel_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel_4.setIcon(new ImageIcon(imgskoda));
						txtskoda.setText("SKODA");
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblNewLabel_4.setIcon(new ImageIcon(imgskoda2));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						skoda.setVisible(true);
						skoda2.setVisible(true);
						
						btnNewButton_1.setVisible(false);
						
						skoda.setIcon(new ImageIcon(imgmodel15));
						skoda2.setIcon(new ImageIcon(imgmodel16));
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�skoda));
					}
				});
				lblNewLabel_7.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel_7.setIcon(new ImageIcon(imgwf2));
						txtvolkswogen.setText("VOLKSWAGEN");
						
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblNewLabel_7.setIcon(new ImageIcon(imgwf));
						
					}
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(true);
						w2.setVisible(true);
						
						btnNewButton_1.setVisible(false);
						
						w.setIcon(new ImageIcon(imgmodel17));
						w2.setIcon(new ImageIcon(imgmodel18));
						lblNewLabel_1.setIcon(new ImageIcon(imgbo�volkswagen));
						
					}
				});
				lblOk.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(false);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgarkaplan2));
						lblModel_1.setDisabledIcon(new ImageIcon(imgmodel6));
						bmw.setDisabledIcon(new ImageIcon(imgmodel1));
						bmw2.setIcon(new ImageIcon());
						bmw.setIcon(new ImageIcon());
					}
				});
				
				label.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(false);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgarkaplan));
						lblModel_1.setDisabledIcon(new ImageIcon(imgmodel6));
						bmw.setDisabledIcon(new ImageIcon(imgmodel1));
						bmw2.setIcon(new ImageIcon());
						bmw.setIcon(new ImageIcon());
					}
				});
				
				
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnNewButton.setBackground(new Color(0, 0, 0) );
					}
					@Override
					public void mousePressed(MouseEvent e) {
						uyeolma uye = null;
						try {
							uye = new uyeolma();
						} catch (ParseException e1) {
							
							e1.printStackTrace();
						}
						uye.setVisible(true);
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnNewButton.setBackground(new Color(153, 0, 70) );
					}
				});
				btnOturumA.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnOturumA.setBackground(new Color(0, 0, 0) );
					}
					@Override
					public void mousePressed(MouseEvent e) {
						uyegirisi uye = new uyegirisi();
						uye.setVisible(true);
					}
					@Override
					public void mouseExited(MouseEvent e) {
						
						btnOturumA.setBackground(new Color(153, 0, 70) );
					}
				});
				
				w.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgarteon));
					}
				});
				w2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgtoureg));
						
					}
				});
				bmw.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgf30));
						
						
						
					}	
				});
				bmw2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgx5));
					}
				});
				aud�.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imga5));
					}
				});
				
				aud�2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgq8));
					}
				});
				porche.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgpanemera));
					}
				});
				porche2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgcayman));
					}
				});
				
				mercedes.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						lblNewLabel_1.setIcon(new ImageIcon(imgc200));
					}
				});
				mercedes2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						lblNewLabel_1.setIcon(new ImageIcon(imgg500));
					}
				});
				f�at.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgegea));
					}
				});
				f�at2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						
						lblNewLabel_1.setIcon(new ImageIcon(imgdoblo));
					}
				});
				reno.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						
						btnNewButton_1.setVisible(true);
						lblNewLabel_1.setIcon(new ImageIcon(imgtal�sman));
					}
				});
				reno2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						
						btnNewButton_1.setVisible(true);
						lblNewLabel_1.setIcon(new ImageIcon(imgkadjar));
					}
				});
				seat.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						
						btnNewButton_1.setVisible(true);
						lblNewLabel_1.setIcon(new ImageIcon(imgleon));
					}
				});
				seat2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						
						btnNewButton_1.setVisible(true);
						lblNewLabel_1.setIcon(new ImageIcon(imgateca));
					}
				});
				skoda.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						lblNewLabel_1.setIcon(new ImageIcon(imgoctav�a));
					}
				});
				skoda2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						porche.setVisible(false);
						porche2.setVisible(false);
						bmw.setVisible(false);
						bmw2.setVisible(false);
						mercedes.setVisible(false);
						mercedes2.setVisible(false);
						aud�.setVisible(false);
						aud�2.setVisible(false);
						f�at.setVisible(false);
						f�at2.setVisible(false);
						reno.setVisible(false);
						reno2.setVisible(false);
						seat.setVisible(false);
						seat2.setVisible(false);
						skoda.setVisible(false);
						skoda2.setVisible(false);
						w.setVisible(false);
						w2.setVisible(false);
						
						btnNewButton_1.setVisible(true);
						lblNewLabel_1.setIcon(new ImageIcon(imgkod�ak));
					}
				});
				lblNewLabel_5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblNewLabel_5.setIcon(new ImageIcon(imgfacebook));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblNewLabel_5.setIcon(new ImageIcon(imgfacebook2));
					}
				});
				
				
			}
		}