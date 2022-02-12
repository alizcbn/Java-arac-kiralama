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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.AbstractButton;
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
import javax.swing.text.MaskFormatter;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class uyeolma extends JFrame {

	private JPanel contentPane;
	 private JTable table;
		
		DefaultTableModel modelim = new DefaultTableModel();
		
		Object [] kolonlar = {"KULLANCIADÝ", "SOYAD", "EPOSTA", "ÞÝFRE", "ÞÝFRE(T)", "TEL" };
		Object [] satirlar = new Object[6];
		private JPasswordField passwordField;
		private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uyeolma frame = new uyeolma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public uyeolma() throws ParseException {
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
		
		JLabel lblyeGirii = new JLabel("\u00DCYE OL");
		lblyeGirii.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblyeGirii.setHorizontalAlignment(SwingConstants.CENTER);
		lblyeGirii.setBounds(215, 213, 367, 71);
		contentPane.add(lblyeGirii);
		
		
		JTextField ad = new JTextField();
		ad.setBounds(289, 295, 216, 25);
		contentPane.add(ad);
		ad.setColumns(10);
		
		JTextField soyad = new JTextField();
		soyad.setColumns(10);
		soyad.setBounds(289, 339, 216, 25);
		contentPane.add(soyad);
		
		JTextField eposta = new JTextField();
		eposta.setColumns(10);
		eposta.setBounds(288, 382, 216, 25);
		contentPane.add(eposta);
		
		MaskFormatter mf = new MaskFormatter("(0###) ### - ## - ##");
		
		JFormattedTextField formattedTextField = new JFormattedTextField(mf);
		formattedTextField.setBounds(289, 531, 216, 25);
		contentPane.add(formattedTextField);
		
		
		JButton btnNewButton_1 = new JButton("\u00DCYE OL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
                String  klnadi,syd,ept,sfr,sfrt,tl,sql_sorgu;
				
                
                klnadi = ad.getText();
                
				syd = soyad.getText();
                
				ept = eposta.getText();
                
				sfr = passwordField.getText();
                
				sfrt = passwordField_1.getText();
                
				tl  = formattedTextField.getText();
			
				
				sql_sorgu = "INSERT INTO uye_bilgileri (kullanýcýadi,soyad,eposta,sifre,sifret,tel) VALUES (" +
				
                "'" + klnadi + "', '" +syd + "', " + "'" + ept + "', " + "'" + sfr + "', " + "'" + sfrt + "', '" +   tl  + "')" 
						;
				
				

				//System.out.println(sql_sorgu);
				baglanti.ekle(sql_sorgu);
				
				
				
				
				JOptionPane.showMessageDialog(null, "EKLEME ÝÞLEMÝ TAMALANDI ");
				
				
				
				uyegirisi uye = new uyegirisi();
				uye.setVisible(true);
				
				
				
				
			}
		});
		
		btnNewButton_1.setBackground(new Color(153, 0, 51));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(281, 575, 224, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblifre = new JLabel("\u015E\u0130FRE :");
		lblifre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblifre.setBackground(Color.BLACK);
		lblifre.setForeground(Color.BLACK);
		lblifre.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblifre.setBounds(174, 421, 105, 38);
		contentPane.add(lblifre);
		
		JLabel lblTifre = new JLabel("\u015E\u0130FRE(TEKRAR) :");
		lblTifre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTifre.setForeground(Color.BLACK);
		lblTifre.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTifre.setBackground(Color.BLACK);
		lblTifre.setBounds(66, 467, 214, 38);
		contentPane.add(lblTifre);
		
		JLabel lblyeAd = new JLabel("AD(kullan\u0131c\u0131 ad\u0131):");
		lblyeAd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblyeAd.setBackground(Color.BLACK);
		lblyeAd.setForeground(Color.BLACK);
		lblyeAd.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblyeAd.setBounds(54, 295, 224, 25);
		contentPane.add(lblyeAd);
		
		JLabel lblEposta = new JLabel("E-POSTA :");
		lblEposta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEposta.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblEposta.setBounds(91, 375, 187, 32);
		contentPane.add(lblEposta);
		
		JLabel lblNewLabel = new JLabel("SOYAD:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(107, 339, 171, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblCepTelefonu = new JLabel("CEP TELEFONU :");
		lblCepTelefonu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCepTelefonu.setForeground(Color.BLACK);
		lblCepTelefonu.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCepTelefonu.setBackground(Color.BLACK);
		lblCepTelefonu.setBounds(66, 517, 214, 38);
		contentPane.add(lblCepTelefonu);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("");
		
		lblNewLabel_6.setIcon(new ImageIcon(imglogo));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(40, 17, 150, 141);
		contentPane.add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(289, 433, 216, 25);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(289, 481, 216, 25);
		contentPane.add(passwordField_1);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), null, new Color(139, 0, 0), null));
		scrollPane.setBounds(549, 272, 653, 357);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		table.setBounds(190, 218, 339, 151);
		scrollPane.setViewportView(table);
		
		table.setModel(modelim);
		
		JLabel sifre = new JLabel("");
		sifre.setIcon(new ImageIcon(imganasayfa));
		sifre.setHorizontalAlignment(SwingConstants.CENTER);
		sifre.setBounds(0, -33, 1280,785);
		contentPane.add(sifre);
		
        modelim.setColumnIdentifiers(kolonlar);
		
		ResultSet myRs  = baglanti.yap2();
		
		
		
		try {
			while(myRs.next()) {
			
				satirlar[0] = myRs.getString("kullanýcýadi");
				satirlar[1] = myRs.getString("soyad");
				satirlar[2] = myRs.getString("eposta");
				satirlar[3] = myRs.getString("sifre");
				satirlar[4] = myRs.getString("sifret");
				satirlar[5] = myRs.getString("tel");
				modelim.addRow(satirlar);
			
				
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_6.setIcon(new ImageIcon(imglogo2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_6.setIcon(new ImageIcon(imglogo));
			}
			
		});
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(0, 0, 0) );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(153, 0, 51 ));
			}
		});
		
		
	}	
}


