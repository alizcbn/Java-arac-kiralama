package arackiralama;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

public class aracbilgisi extends JFrame {

	private JPanel contentPane;
    private JTable table;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object [] kolonlar = {"ÝD", "MARKA", "MODEL", "PLAKA", "ÞANZUMAN", "YIL", "YAKIT" , "FÝYAT" };
	Object [] satirlar = new Object[8];
	
	
    DefaultTableModel modelim2 = new DefaultTableModel();
	
	Object [] kolonlar2 = {"ÝD", "MARKA", "MODEL", "RENK", "YIL", "YAKIT", "FÝYAT"};
	Object [] satirlar2 = new Object[7];
	
	private JTextField marka;
	private JTextField model;
	private JTextField plaka;
	private JTextField sanzuman;
	private JTextField yýl;
	private JTextField yakit;
	private JTextField fiyat;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aracbilgisi frame = new aracbilgisi();
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
	public aracbilgisi() {
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
		
		Image imgaudi1 = new ImageIcon(this.getClass().getResource("/AUDÝ1.png")).getImage();
		Image imgaudi2 = new ImageIcon(this.getClass().getResource("/AUDÝ2.png")).getImage();
		
		
		
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
		
		
		
		
		Image imgboþbmw = new ImageIcon(this.getClass().getResource("/boþbmw.png")).getImage();
		
		Image imgboþporche = new ImageIcon(this.getClass().getResource("/boþporche.png")).getImage();
		
		Image imgboþmercedes = new ImageIcon(this.getClass().getResource("/boþmercedes.png")).getImage();
		
		Image imgboþaudi = new ImageIcon(this.getClass().getResource("/boþaudi.png")).getImage();
		
		Image imgboþfiat = new ImageIcon(this.getClass().getResource("/boþfiat.png")).getImage();
		
		Image imgboþrenault = new ImageIcon(this.getClass().getResource("/boþrenault.png")).getImage();
		
		Image imgboþseat = new ImageIcon(this.getClass().getResource("/boþseat.png")).getImage();
		
		Image imgboþskoda = new ImageIcon(this.getClass().getResource("/boþskoda.png")).getImage();
		
		Image imgboþvolkswagen = new ImageIcon(this.getClass().getResource("/boþvolkswagen.png")).getImage();
		
		
		
		
		
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
		
		Image imgtalýsman = new ImageIcon(this.getClass().getResource("/talýsman.png")).getImage();
		Image imgegea = new ImageIcon(this.getClass().getResource("/egea.png")).getImage();
		
		Image imgleon = new ImageIcon(this.getClass().getResource("/leon.png")).getImage();
		Image imgateca = new ImageIcon(this.getClass().getResource("/ateca.png")).getImage();
		
		Image imgdoblo = new ImageIcon(this.getClass().getResource("/doblo.png")).getImage();
		Image imgkadjar = new ImageIcon(this.getClass().getResource("/kadjar.png")).getImage();
		
		Image imgoctavýa = new ImageIcon(this.getClass().getResource("/octavýa.png")).getImage();
		Image imgkodýak = new ImageIcon(this.getClass().getResource("/kodýak.png")).getImage();
		Image imgboþ = new ImageIcon(this.getClass().getResource("/boþ.png")).getImage();
		
		JLabel lblBotakiAralar = new JLabel("\u015EU AN BO\u015ETA OLAN ARA\u00C7LAR");
		lblBotakiAralar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBotakiAralar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBotakiAralar.setBounds(163, 509, 292, 23);
		contentPane.add(lblBotakiAralar);
		
		JLabel lblNewLabel_9 = new JLabel("\u015EU AN KULLANIMDA OLAN ARA\u00C7LAR");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(147, 509, 332, 23);
		contentPane.add(lblNewLabel_9);
		
		
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
		lblModel.setBounds(10, 278, 430, 201);
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
		
		JLabel yazý = new JLabel("");
		
		yazý.setIcon(new ImageIcon(imgporche));
		yazý.setHorizontalAlignment(SwingConstants.CENTER);
		yazý.setBounds(200, 100, 160, 160);
		contentPane.add(yazý);
		
		JLabel b1 = new JLabel("");
		
		b1.setIcon(new ImageIcon(imgmercedes));
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setBounds(300, 100, 160, 160);
		contentPane.add(b1);
		
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
		
		bmw2.setBounds(710, 200, 635, 297);
		contentPane.add(bmw2);
		
		
		
		JLabel bmw = new JLabel("");
		
		
		bmw.setHorizontalAlignment(SwingConstants.CENTER);
		bmw.setBounds(808, 446, 422, 304);
		contentPane.add(bmw);
		
        JLabel porche = new JLabel("");
		
		porche.setHorizontalAlignment(SwingConstants.CENTER);
		porche.setBounds(733, 212, 531, 264);
		contentPane.add(porche);
		
		JLabel porche2 = new JLabel("");
		
		porche2.setHorizontalAlignment(SwingConstants.CENTER);
		porche2.setBounds(720, 453, 610, 277);
		contentPane.add(porche2);
		
		JLabel mercedes2 = new JLabel("");
		
		mercedes2.setHorizontalAlignment(SwingConstants.CENTER);
		mercedes2.setBounds(759, 465, 594, 253);
		contentPane.add(mercedes2);
		
		JLabel mercedes = new JLabel("");
		
		mercedes.setHorizontalAlignment(SwingConstants.CENTER);
		mercedes.setBounds(810, 212, 464, 264);
		contentPane.add(mercedes);
		
		JLabel audý = new JLabel("");
		
		audý.setHorizontalAlignment(SwingConstants.CENTER);
		audý.setBounds(733, 213, 531, 253);
		contentPane.add(audý);
		
		JLabel audý2 = new JLabel("");
		audý2.setHorizontalAlignment(SwingConstants.CENTER);
		audý2.setBounds(743, 446, 552, 270);
		contentPane.add(audý2);
		
		JLabel fýat = new JLabel("");
		
		fýat.setHorizontalAlignment(SwingConstants.CENTER);
		fýat.setBounds(800, 212, 464, 264);
		contentPane.add(fýat);
		
		JLabel fýat2 = new JLabel("");
		fýat2.setHorizontalAlignment(SwingConstants.CENTER);
		fýat2.setBounds(780, 465, 543, 253);
		contentPane.add(fýat2);
		
		JLabel reno = new JLabel("");
		reno.setHorizontalAlignment(SwingConstants.CENTER);
		reno.setBounds(834, 212, 430, 264);
		contentPane.add(reno);
		
		JLabel reno2 = new JLabel("");
		reno2.setHorizontalAlignment(SwingConstants.CENTER);
		reno2.setBounds(790, 487, 563, 231);
		contentPane.add(reno2);
		
		JLabel seat2 = new JLabel("");
		seat2.setHorizontalAlignment(SwingConstants.CENTER);
		seat2.setBounds(700, 465, 610, 253);
		contentPane.add(seat2);
		
		JLabel seat = new JLabel("");
		seat.setHorizontalAlignment(SwingConstants.CENTER);
		seat.setBounds(764, 200, 500, 253);
		contentPane.add(seat);
		
		JLabel skoda = new JLabel("");
		skoda.setHorizontalAlignment(SwingConstants.CENTER);
		skoda.setBounds(770, 212, 494, 253);
		contentPane.add(skoda);
		
		JLabel skoda2 = new JLabel("");
		skoda2.setHorizontalAlignment(SwingConstants.CENTER);
		skoda2.setBounds(757, 466, 533, 264);
		contentPane.add(skoda2);
		
		JLabel w = new JLabel("");
		w.setHorizontalAlignment(SwingConstants.CENTER);
		w.setBounds(800, 212, 474, 242);
		contentPane.add(w);
		
		JLabel w2 = new JLabel("");
		
		
		w2.setHorizontalAlignment(SwingConstants.CENTER);
		w2.setBounds(774, 446, 494, 272);
		contentPane.add(w2);
		
		JLabel lblFgd = new JLabel("fgd");
		lblFgd.setBounds(16, 169, 46, 14);
		contentPane.add(lblFgd);
		lblFgd.setIcon(new ImageIcon(imgfiat));
		
		JLabel lblAraEkle = new JLabel("ARA\u00C7 B\u0130LG\u0130LER\u0130");
		lblAraEkle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAraEkle.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblAraEkle.setBounds(437, 39, 366, 66);
		contentPane.add(lblAraEkle);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setToolTipText("");
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), null, new Color(139, 0, 0), null));
		scrollPane.setBounds(20, 338, 570, 160);
		contentPane.add(scrollPane);
		
        table = new JTable();
		
		table.setBounds(190, 218, 339, 151);
		scrollPane.setViewportView(table);
		
		table.setModel(modelim);
		
        JScrollPane scrollPane2 = new JScrollPane();
		
		scrollPane2.setToolTipText("");
		scrollPane2.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), null, new Color(139, 0, 0), null));
		scrollPane2.setBounds(20, 338, 570, 160);
		contentPane.add(scrollPane2);
		
		
		
        JTable table2 = new JTable();
		
		table2.setBounds(190, 218, 339, 151);
		scrollPane2.setViewportView(table2);
		
		table2.setModel(modelim2);
		
		JButton btnNewButton = new JButton("\u015EU AN BO\u015ETA OLAN ARA\u00C7LAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				scrollPane.setVisible(false);
				scrollPane2.setVisible(true);
				lblBotakiAralar.setVisible(true);
				lblNewLabel_9.setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(310, 553, 280, 55);
		contentPane.add(btnNewButton);
		
		JButton btnBoAralar = new JButton("\u015EU AN KULLANIMDA OLAN ARA\u00C7LAR");
		
		btnBoAralar.setForeground(Color.WHITE);
		btnBoAralar.setBackground(new Color(128, 0, 0));
		btnBoAralar.setBounds(20, 553, 280, 55);
		contentPane.add(btnBoAralar);
		
		JButton btnNewButton_1 = new JButton("GER\u0130");
		
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(153, 0, 0));
		btnNewButton_1.setBounds(38, 248, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(imganasayfa));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(-39, -156, 1355,1024);
		contentPane.add(lblNewLabel_1);
		modelim.setColumnIdentifiers(kolonlar);
		
		ResultSet myRs  = baglanti.yap3();
		
		try {
			while(myRs.next()) {
			
				satirlar[0] = myRs.getString("id");
				satirlar[1] = myRs.getString("marka");
				satirlar[2] = myRs.getString("model");
				satirlar[3] = myRs.getString("renk");
				satirlar[4] = myRs.getString("baslangýc_tarihi");
				satirlar[5] = myRs.getString("bitis_tarihi");
				satirlar[6] = myRs.getString("toplam_gün");
				satirlar[7] = myRs.getString("ücret");
				modelim.addRow(satirlar);
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
        modelim2.setColumnIdentifiers(kolonlar2);
		
		ResultSet myRs1  = baglanti.yap4();
		
		try {
			while(myRs1.next()) {
			
				satirlar2[0] = myRs1.getString("id");
				satirlar2[1] = myRs1.getString("marka");
				satirlar2[2] = myRs1.getString("model");
				satirlar2[3] = myRs1.getString("renk");
				satirlar2[4] = myRs1.getString("yýl");
				satirlar2[5] = myRs1.getString("yakýt");
				satirlar2[6] = myRs1.getString("fiyat");
				modelim2.addRow(satirlar2);
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		bmw2.setVisible(false);
		bmw.setVisible(false);
		porche.setVisible(false);
		porche2.setVisible(false);
		mercedes.setVisible(false);
		mercedes2.setVisible(false);
		audý.setVisible(false);
		audý2.setVisible(false);
		fýat.setVisible(false);
		fýat2.setVisible(false);
		reno.setVisible(false);
		reno2.setVisible(false);
		seat.setVisible(false);
		seat2.setVisible(false);
		skoda.setVisible(false);
		skoda2.setVisible(false);
		w.setVisible(false);
		w2.setVisible(false);
		scrollPane.setVisible(false);
		lblBotakiAralar.setVisible(true);
		lblNewLabel_9.setVisible(false);
		
		btnBoAralar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				scrollPane.setVisible(true);
				scrollPane2.setVisible(false);
				lblBotakiAralar.setVisible(false);
				lblNewLabel_9.setVisible(true);
			}
		});
		
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b2.setIcon(new ImageIcon(imgbmw2));
				
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				
				
				
				
				bmw.setIcon(new ImageIcon(imgmodel1));
				bmw2.setIcon(new ImageIcon(imgmodel2));
				
				lblNewLabel_1.setIcon(new ImageIcon(imgboþbmw));
				
			}
		});
		
		yazý.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				yazý.setIcon(new ImageIcon(imgporche2));
				

				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				yazý.setIcon(new ImageIcon(imgporche));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				bmw.setVisible(false);
				bmw2.setVisible(false);
				porche.setVisible(true);
				porche2.setVisible(true);
				mercedes.setVisible(false);
				mercedes2.setVisible(false);
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				
				
				
				
				
				porche2.setIcon(new ImageIcon(imgmodel4));
				porche.setIcon(new ImageIcon(imgmodel5));
				lblNewLabel_1.setIcon(new ImageIcon(imgboþporche));
			}
		});
		
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b1.setIcon(new ImageIcon(imgmercedes2));
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				
				
				
				
				mercedes2.setIcon(new ImageIcon(imgmodel6));
				mercedes.setIcon(new ImageIcon(imgmodel3));
				
				lblNewLabel_1.setIcon(new ImageIcon(imgboþmercedes));
			}
			
		});
		
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setIcon(new ImageIcon(imgaudi1));
				
				
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
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				audý.setVisible(true);
				audý2.setVisible(true);
				
				
				
				
				
				audý.setIcon(new ImageIcon(imgmodel7));
				audý2.setIcon(new ImageIcon(imgmodel8));
				
				lblNewLabel_1.setIcon(new ImageIcon(imgboþaudi));
			}
		});
		lblFiat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblFiat.setIcon(new ImageIcon(imgfiat2));
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				fýat.setVisible(true);
				fýat2.setVisible(true);
				
				
				
				
				
				fýat.setIcon(new ImageIcon(imgmodel9));
				fýat2.setIcon(new ImageIcon(imgmodel10));
				
				lblNewLabel_1.setIcon(new ImageIcon(imgboþfiat));
			}
		});
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_3.setIcon(new ImageIcon(imgreno2));
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				reno.setVisible(true);
				reno2.setVisible(true);
				
				
				
				
				
                 reno.setIcon(new ImageIcon(imgmodel11));
                 reno2.setIcon(new ImageIcon(imgmodel12));
				lblNewLabel_1.setIcon(new ImageIcon(imgboþrenault));
			}
		});
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_2.setIcon(new ImageIcon(imgseat2));
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				seat.setVisible(true);
				seat2.setVisible(true);
				
				
				
				
				
				seat2.setIcon(new ImageIcon(imgmodel14));
				seat.setIcon(new ImageIcon(imgmodel13));
				
				lblNewLabel_1.setIcon(new ImageIcon(imgboþseat));
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				
				
				
				
				scrollPane.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				skoda.setVisible(true);
				skoda2.setVisible(true);
				
				
				
				
				
				skoda.setIcon(new ImageIcon(imgmodel15));
				skoda2.setIcon(new ImageIcon(imgmodel16));
				lblNewLabel_1.setIcon(new ImageIcon(imgboþskoda));
			}
		});
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_7.setIcon(new ImageIcon(imgwf2));
				
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(true);
				w2.setVisible(true);
				
				
				
				
				
				w.setIcon(new ImageIcon(imgmodel17));
				w2.setIcon(new ImageIcon(imgmodel18));
				lblNewLabel_1.setIcon(new ImageIcon(imgboþvolkswagen));
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				
				
				
				
				scrollPane.setVisible(false);
				
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				
				
				
				
				scrollPane.setVisible(false);
				
				lblNewLabel_1.setIcon(new ImageIcon(imgarkaplan));
				lblModel_1.setDisabledIcon(new ImageIcon(imgmodel6));
				bmw.setDisabledIcon(new ImageIcon(imgmodel1));
				bmw2.setIcon(new ImageIcon());
				bmw.setIcon(new ImageIcon());
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				lblNewLabel_1.setIcon(new ImageIcon(imgx5));
			}
		});
		audý.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				porche.setVisible(false);
				porche2.setVisible(false);
				bmw.setVisible(false);
				bmw2.setVisible(false);
				mercedes.setVisible(false);
				mercedes2.setVisible(false);
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				lblNewLabel_1.setIcon(new ImageIcon(imga5));
			}
		});
		
		audý2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				porche.setVisible(false);
				porche2.setVisible(false);
				bmw.setVisible(false);
				bmw2.setVisible(false);
				mercedes.setVisible(false);
				mercedes2.setVisible(false);
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				lblNewLabel_1.setIcon(new ImageIcon(imgg500));
			}
		});
		fýat.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				porche.setVisible(false);
				porche2.setVisible(false);
				bmw.setVisible(false);
				bmw2.setVisible(false);
				mercedes.setVisible(false);
				mercedes2.setVisible(false);
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				lblNewLabel_1.setIcon(new ImageIcon(imgegea));
			}
		});
		fýat2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				porche.setVisible(false);
				porche2.setVisible(false);
				bmw.setVisible(false);
				bmw2.setVisible(false);
				mercedes.setVisible(false);
				mercedes2.setVisible(false);
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				lblNewLabel_1.setIcon(new ImageIcon(imgtalýsman));
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				lblNewLabel_1.setIcon(new ImageIcon(imgoctavýa));
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
				audý.setVisible(false);
				audý2.setVisible(false);
				fýat.setVisible(false);
				fýat2.setVisible(false);
				reno.setVisible(false);
				reno2.setVisible(false);
				seat.setVisible(false);
				seat2.setVisible(false);
				skoda.setVisible(false);
				skoda2.setVisible(false);
				w.setVisible(false);
				w2.setVisible(false);
				
				lblNewLabel_1.setIcon(new ImageIcon(imgkodýak));
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
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				yoneticipaneli panel = new yoneticipaneli();
				panel.setVisible(true);
			}
		});
		
		
	}
}

