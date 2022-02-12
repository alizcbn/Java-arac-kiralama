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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

public class sozlesme extends JFrame {

	
	private JPanel contentPane;
    private JTable table;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object [] kolonlar = {"ÝD", "MARKA", "MODEL", "PLAKA", "ÞANZUMAN"};
	Object [] satirlar = new Object[5];
	
    DefaultTableModel modelim2 = new DefaultTableModel();
	
	Object [] kolonlar2 = {"ÝD", "MARKA", "MODEL", "PLAKA", "ÞANZUMAN", "MARKA", "MODEL", "PLAKA", "ÞANZUMAN"};
	Object [] satirlar2 = new Object[9];
	private JTextField ehno;
	private JTextField ehta;
	private JTextField ehye;
	private JTextField plaka;
	private JTextField renk;
	private JTextField kira;
	private JTextField tutar;
	private JTextField marka;
	private JTextField gunsayý;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sozlesme frame = new sozlesme();
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
	public sozlesme() {
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
		
		JLabel lblNewLabel_11 = new JLabel("HAYIRLI OLSUN \u0130Y\u0130 G\u00DCNLERDE KULLANIN ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_11.setBounds(66, 357, 934, 97);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("M.E RENT A CAR");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_12.setBounds(352, 460, 331, 38);
		contentPane.add(lblNewLabel_12);
		
		
		JLabel lblNewLabel_8 = new JLabel("");
		
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_8.setBounds(510, 248, 461, 306);
		contentPane.add(lblNewLabel_8);
		
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
		
		JButton gnc = new JButton("KAYDET");
		gnc.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				sozlesme szm = new sozlesme();
				szm.setVisible(true);
			}
		});
		gnc.setBackground(new Color(128, 0, 0));
		gnc.setForeground(new Color(255, 255, 255));
		gnc.setBounds(116, 654, 338, 35);
		contentPane.add(gnc);
		
		JButton Liste = new JButton("\u0130\u015ELEM\u0130 B\u0130T\u0130R");
		Liste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Liste.setForeground(Color.WHITE);
		Liste.setBackground(new Color(128, 0, 0));
		Liste.setBounds(116, 695, 708, 35);
		contentPane.add(Liste);
		
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
		
		JLabel lblAraEkle = new JLabel("S\u00D6ZLE\u015EME SAYFASI");
		lblAraEkle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAraEkle.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblAraEkle.setBounds(400, 39, 449, 66);
		contentPane.add(lblAraEkle);
		
		JLabel lblNewLabel_9 = new JLabel("AD");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_9.setBounds(116, 381, 89, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblModel_2 = new JLabel("SOYAD");
		lblModel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblModel_2.setBounds(116, 420, 82, 14);
		contentPane.add(lblModel_2);
		
		JLabel lblPlaka = new JLabel("TC");
		lblPlaka.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPlaka.setBounds(116, 457, 60, 14);
		contentPane.add(lblPlaka);
		
		JLabel lblanzuman = new JLabel("TEL");
		lblanzuman.setHorizontalAlignment(SwingConstants.LEFT);
		lblanzuman.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblanzuman.setBounds(112, 493, 100, 23);
		contentPane.add(lblanzuman);
		
		JLabel lblYl = new JLabel("ADRES");
		lblYl.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblYl.setBounds(116, 539, 60, 14);
		contentPane.add(lblYl);
		
		JTextField ad = new JTextField();
		ad.setBounds(246, 381, 121, 20);
		contentPane.add(ad);
		ad.setColumns(10);
		
		JTextField soyad = new JTextField();
		soyad.setColumns(10);
		soyad.setBounds(246, 420, 121, 20);
		contentPane.add(soyad);
		
		JTextField tc = new JTextField();
		tc.setColumns(10);
		tc.setBounds(246, 457, 121, 20);
		contentPane.add(tc);
		
		JTextField tel = new JTextField();
		tel.setColumns(10);
		tel.setBounds(246, 497, 121, 20);
		contentPane.add(tel);
		
		JTextField adres = new JTextField();
		adres.setColumns(10);
		adres.setBounds(246, 539, 121, 20);
		contentPane.add(adres);
		
		JLabel lblSzlemeBilgileri = new JLabel("S\u00D6ZLE\u015EME B\u0130LG\u0130LER\u0130");
		lblSzlemeBilgileri.setHorizontalAlignment(SwingConstants.CENTER);
		lblSzlemeBilgileri.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSzlemeBilgileri.setBounds(570, 278, 254, 23);
		contentPane.add(lblSzlemeBilgileri);
		
		JLabel lblNewLabel_10 = new JLabel("M\u00DC\u015ETER\u0130 B\u0130LG\u0130LER\u0130");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setBounds(110, 278, 254, 23);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblEhliyetNo = new JLabel("EHL\u0130YET NO");
		lblEhliyetNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEhliyetNo.setBounds(550, 368, 143, 14);
		contentPane.add(lblEhliyetNo);
		
		JLabel lblEhliyetTarihi = new JLabel("EHL\u0130YET TAR\u0130H\u0130");
		lblEhliyetTarihi.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEhliyetTarihi.setBounds(550, 397, 147, 14);
		contentPane.add(lblEhliyetTarihi);
		
		JLabel lblEhliyetYeri = new JLabel("EHL\u0130YET YER\u0130");
		lblEhliyetYeri.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEhliyetYeri.setBounds(550, 429, 139, 14);
		contentPane.add(lblEhliyetYeri);
		
		JLabel lblPlaka_1 = new JLabel("PLAKA");
		lblPlaka_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlaka_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPlaka_1.setBounds(550, 457, 119, 23);
		contentPane.add(lblPlaka_1);
		
		JLabel lblMarka = new JLabel("MARKA");
		lblMarka.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMarka.setBounds(550, 491, 83, 14);
		contentPane.add(lblMarka);
		
		JLabel lblRenk = new JLabel("RENK");
		lblRenk.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRenk.setBounds(550, 529, 83, 14);
		contentPane.add(lblRenk);
		
		JLabel lblKiracreti = new JLabel("K\u0130RA \u00DCCRET\u0130");
		lblKiracreti.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblKiracreti.setBounds(551, 559, 139, 20);
		contentPane.add(lblKiracreti);
		
		ehno = new JTextField();
		ehno.setColumns(10);
		ehno.setBounds(703, 364, 121, 20);
		contentPane.add(ehno);
		
		ehta = new JTextField();
		ehta.setColumns(10);
		ehta.setBounds(703, 395, 121, 20);
		contentPane.add(ehta);
		
		ehye = new JTextField();
		ehye.setColumns(10);
		ehye.setBounds(703, 426, 121, 20);
		contentPane.add(ehye);
		
		plaka = new JTextField();
		plaka.setColumns(10);
		plaka.setBounds(703, 458, 121, 20);
		contentPane.add(plaka);
		
		renk = new JTextField();
		renk.setColumns(10);
		renk.setBounds(703, 525, 121, 20);
		contentPane.add(renk);
		
		kira = new JTextField();
		kira.setColumns(10);
		kira.setBounds(703, 556, 121, 20);
		contentPane.add(kira);
		
		marka = new JTextField();
		marka.setColumns(10);
		marka.setBounds(703, 489, 121, 20);
		contentPane.add(marka);
		
		tutar = new JTextField();
		tutar.setColumns(10);
		tutar.setBounds(703, 618, 121, 20);
		contentPane.add(tutar);
		
		gunsayý = new JTextField();
		gunsayý.setColumns(10);
		gunsayý.setBounds(703, 589, 121, 20);
		contentPane.add(gunsayý);
		
		JLabel lblGnSays = new JLabel("G\u00DCN SAYISI");
		lblGnSays.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGnSays.setBounds(550, 592, 140, 20);
		contentPane.add(lblGnSays);
		
		JLabel lblToplamTutar = new JLabel("TOPLAM TUTAR");
		lblToplamTutar.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblToplamTutar.setBounds(550, 619, 150, 20);
		contentPane.add(lblToplamTutar);
		
		JButton button = new JButton("KAYDET");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
            String  mrk2,mdl2,plk2,szn2,yl2,plk3,szn3,yl3,yl4,sql_sorgu;
				
				
				mrk2 = ehno.getText();
				mdl2 = ehta.getText();
				plk2 = ehye.getText();
				szn2 = plaka.getText();
				yl2  = renk.getText();
				plk3 = kira.getText();
				szn3 = marka.getText();
				yl3  = tutar.getText();
				yl4  = gunsayý.getText();
				
				
				sql_sorgu = "INSERT INTO sozlesme_bilgileri (ehliyetno,e_tarih,e_yer,plaka,marka,renk,kiraucreti,gun,tutar) VALUES (" +
				
                  "" +mrk2 + "," + "'" + mdl2 + "'," + "'" + plk2 + "'," + "'" + szn2 + "','" + szn3 + "','" +   yl2 + "'," +plk3 + ","  +  "" +yl4 + "," +  yl3 +   ")" 
						;
				
				//System.out.println(sql_sorgu);
				baglanti.ekle(sql_sorgu);
				
				
				ehno.setText("");
				ehta.setText("");
				ehye.setText("");
				plaka.setText("");
				renk.setText("");
				kira.setText("");
				marka.setText("");
				tutar.setText("");
				gunsayý.setText("");
				
				
				JOptionPane.showMessageDialog(null, "EKLEME ÝÞLEMÝ TAMALANDI ");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(128, 0, 0));
		button.setBounds(486, 654, 338, 35);
		contentPane.add(button);
		
		
		
		
		
		
		gnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                String  mrk,mdl,plk,szn,yl,sql_sorgu;
				
				
				mrk = ad.getText();
				mdl = soyad.getText();
				plk = tc.getText();
				szn = tel.getText();
				yl  = adres.getText();
				
				
				sql_sorgu = "INSERT INTO musteri_bilgileri (musteri_ad,musteri_soyad,musteri_tc,musteri_tel,musteri_adres) VALUES (" +
				
                  "'" +mrk + "'," + "'" + mdl + "'," + "'" + plk + "'," + "'" + szn + "','" +   yl + "')" 
						;
				
				//System.out.println(sql_sorgu);
				baglanti.ekle(sql_sorgu);
				
				
				ad.setText("");
				soyad.setText("");
				tc.setText("");
				tel.setText("");
				adres.setText("");
				
				
				JOptionPane.showMessageDialog(null, "EKLEME ÝÞLEMÝ TAMALANDI ");
				
				
			}
		});
		
		JButton btnNewButton = new JButton("ANASAYFAYA D\u00D6N");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				proje prj = new proje();
				prj.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setBounds(431, 545, 150, 38);
		contentPane.add(btnNewButton);
		
	
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(imgboþ));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(-39, -156, 1355,1024);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), null, new Color(139, 0, 0), null));
		scrollPane.setBounds(37, 270, 653, 357);
		contentPane.add(scrollPane);
		
		JTable table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		
		table.setBounds(190, 218, 339, 151);
		scrollPane.setViewportView(table);
		
		ResultSet myRs  = baglanti.yap5();
		
		
		
		try {
			while(myRs.next()) {
			
				
				satirlar[0] = myRs.getString("musteri_ad");
				satirlar[1] = myRs.getString("musteri_soyad");
				satirlar[2] = myRs.getString("musteri_tc");
				satirlar[3] = myRs.getString("musteri_tel");
				satirlar[4] = myRs.getString("musteri_adres");
				
				modelim.addRow(satirlar);
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		table.setModel(modelim);
		
		scrollPane.setVisible(false);
       
		
		
		
		
		
		
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
		lblNewLabel_11.setVisible(false);
		lblNewLabel_12.setVisible(false);
		btnNewButton.setVisible(false);


        Liste.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				ad.setVisible(false);
				soyad.setVisible(false);
				tc.setVisible(false);
				tel.setVisible(false);
				adres.setVisible(false);
				lblAraEkle.setVisible(false);
				lblNewLabel_9.setVisible(false);
				lblModel_2.setVisible(false);
				lblPlaka.setVisible(false);
				lblanzuman.setVisible(false);
				lblYl.setVisible(false);
				
				lblKiracreti.setVisible(false);
				lblSzlemeBilgileri.setVisible(false);
				lblNewLabel_10.setVisible(false);
				lblEhliyetNo.setVisible(false);
				lblEhliyetTarihi.setVisible(false);
				lblEhliyetYeri.setVisible(false);
				lblPlaka_1.setVisible(false);
				
				lblMarka.setVisible(false);
				lblRenk.setVisible(false);
				lblKiracreti.setVisible(false);
				gnc.setVisible(false);
				Liste.setVisible(false);
				button.setVisible(false);
				lblGnSays.setVisible(false);
				lblToplamTutar.setVisible(false);
				
				ehno.setVisible(false);
				ehta.setVisible(false);
				ehye.setVisible(false);
				plaka.setVisible(false);
				renk.setVisible(false);
				kira.setVisible(false);
				marka.setVisible(false);
				tutar.setVisible(false);
				gunsayý.setVisible(false);
				
				lblNewLabel_11.setVisible(true);
				btnNewButton.setVisible(true);
				lblNewLabel_12.setVisible(true);
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
				ad.setVisible(false);
				soyad.setVisible(false);
				tc.setVisible(false);
				tel.setVisible(false);
				adres.setVisible(false);
				lblAraEkle.setVisible(false);
				lblNewLabel_9.setVisible(false);
				lblModel_2.setVisible(false);
				lblPlaka.setVisible(false);
				lblanzuman.setVisible(false);
				lblYl.setVisible(false);
				
				
				
				
				
				
				
				
				
				
				
				
				bmw.setDisabledIcon(new ImageIcon(imgmodel1));
				lblModel_1.setDisabledIcon(new ImageIcon(imgmodel6));
				lblNewLabel_1.setIcon(new ImageIcon(imgboþ));
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
		
		
	}
}

