package arackiralama;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class baglanti2 {
static ResultSet yap2() {
		
		try {
			
			Connection myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
					"root", "1234");
			
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("SELECT * FROM arac_listesi  where  id = 1  ");
			return myRs;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

static ResultSet yap3() {
	
	try {
		
		Connection myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:7780/arac_kiralama?useUnicode=true&useLegacyDatet imeCode=false&serverTimezone=Turkey",
				"root", "1234");
		
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("SELECT * FROM arac_listesi  where  id = 2  ");
		return myRs;
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return null;
	
}



}
