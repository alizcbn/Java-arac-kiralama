package arackiralama;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class baglanti {
	
	
	static Connection myConn;
	static Statement myStat;

	static ResultSet yap() {
		ResultSet myRs = null;
		
		try {
			
			myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");
			
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from arac_listesi");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return myRs;
		
	}
	
	
	static ResultSet yap2() {
		ResultSet myRs = null;
		
		try {
			
			myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");
			
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from uye_bilgileri");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return myRs;
		
	}
	
	static ResultSet yap3() {
		ResultSet myRs = null;
		
		try {
			
			myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");
			
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from dolu_araclar");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return myRs;
		
	}
	
	
	static ResultSet yap4() {
		ResultSet myRs = null;
		
		try {
			
			myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");
			
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from bos_araclar");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return myRs;
		
	}
	static ResultSet yap5() {
		ResultSet myRs = null;
		
		try {
			
			myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");
			
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from musteri_bilgileri");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return myRs;
		
	}
	static ResultSet yap6() {
		ResultSet myRs = null;
		
		try {
			
			myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");
			
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from sozlesme_bilgileri");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return myRs;
		
	}
	
	
    static void ekle(String sql_sorgu) {
		
		try {
			myStat.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	static void update(String sql_sorgu) {
		
		try {
			myStat.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	static void sil(String sql_sorgu) {
		try {
			myStat.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
}
